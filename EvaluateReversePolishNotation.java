package ProjectFiles;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
		//"4", "13", "5", "/", "+"
		System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
		System.out.println(evalRPN(new String[]{"4","5", "-"}));
	}

	public static int evalRPN(String[] tokens) {
//		int result = 0;
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < tokens.length; i++){
			String cur = tokens[i];
			if(cur.equals("*") || cur.equals("/") || cur.equals("+") || cur.equals("-")){
				int b = s.pop();
				int a = s.pop();
				int eval = 0 ;
				switch(cur){
				case "*":
					eval = a * b;
					break;
				case "/":
					eval = a / b;
					break;
				case "+":
					eval = a + b;
					break;
				case "-":
					eval = a - b;
				}
				s.push(eval);
			}
			else{
				s.push(Integer.parseInt(tokens[i]));
			}
		}
		return s.peek();
	}

}
