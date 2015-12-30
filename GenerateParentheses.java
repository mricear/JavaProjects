package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		List<String > l =  generateParenthesis(3);
		for(String s : l ){
			System.out.println(s);
		}
	}

	private static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		if(n == 0){
			return result;
		}
		generateParenthesisHelper(n-1,n,"(",result);
		return result;
	}

	private static void generateParenthesisHelper(int l, int r, String stringSoFar, List<String> result) {
		if(l > r){
			return;
		}
		if(l == 0 && r == 0){
			result.add(stringSoFar);
			return;
		}
		if(l > 0)
			generateParenthesisHelper(l-1, r, stringSoFar + "(", result);
		if(r > 0 && l <= r)
			generateParenthesisHelper(l, r-1, stringSoFar + ")", result);

	}

}
