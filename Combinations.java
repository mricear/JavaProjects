package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		combine(3,2);
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(n,1,k,new ArrayList<>(), result);
		return result;
	}

	private static void helper(int n, int posSoFar, int k, List<Integer> l, List<List<Integer>> result) {

		if(0 == k){

			result.add(new ArrayList<>(l));
			for(int i : l)
				System.out.print(i);

			System.out.println();
			return;
		}

		for(int j = posSoFar; j <= n; j++){
			l.add(posSoFar);
			helper(n, j+1, k-1, l,result);
			l.remove(l.size() -1);
		}
	}
	
}

