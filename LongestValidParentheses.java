package ProjectFiles;

public class LongestValidParentheses {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")()()))"));
		System.out.println(longestValidParentheses("))))))"));
		System.out.println(longestValidParentheses("((((("));
		System.out.println(longestValidParentheses("()((()())())"));
		System.out.println(longestValidParentheses("()(())()(()))()"));
		System.out.println(longestValidParentheses("(()((()"));
		
		GIVES WRONG ANSWER
		
	}

    public static int longestValidParentheses(String s) {
    	int left = 0, right = 0, longest = 0, result = 0, prevLongest = 0;
    	boolean inValidFoundInBtw = false;
        for(int i = 0 ; i < s.length(); i++ ){
        	char cur = s.charAt(i);
        	if(cur == '('){
        		inValidFoundInBtw = false;
        		left++;
        	}
        	else if(cur == ')'){
        		if(right >= left){
        			inValidFoundInBtw = true;
        			longest = right *2;
        			prevLongest = longest;
        			if(longest > result){
        				result = longest;
        			}
        			longest = 0;left = 0;right = 0;
        		}
        		else{
        			right++;
        		}
        	}
        	if(right == left && !inValidFoundInBtw){
    			longest = right *2 + prevLongest;
    			prevLongest = longest;
    			if(longest > result){
    				result = longest;
    			}
    			longest = 0;left = 0;right = 0;
    		}
        }
        longest = right *2;
        if(longest > result){
			result = longest;
		}
        return result;
    }
}
