package ProjectFiles;

import java.util.Stack;

class MinStack {
	Stack<Integer> s = new Stack<>();
	Stack<Integer> min = new Stack<>();
	
    public void push(int x) {
        s.push(x);
        if(min.isEmpty() || x <= min.peek()){
        	min.push(x);
        }
    }

    public void pop() {
        int x = s.pop();
        if( min.peek() == x){
        	min.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}