package ProjectFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		List<List<Integer>> list = combinationSum1(new int[]{5,6,13,7}, 7);
//		for(List<Integer> l  : list){
//			for(int i : l)
//				System.out.print(i);
//			System.out.println();
//		}
		grayCode(4);
	}
	
	public static List<Integer> grayCode(int n) {
	    List<Integer> rs=new ArrayList<Integer>();
	    rs.add(0);
	    for(int i=0;i<n;i++){
	        int size=rs.size();
	        for(int k=size-1;k>=0;k--)
	            rs.add(rs.get(k) | 1<<i);
	    }
	    return rs;
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> newList = new ArrayList<>();
		Arrays.sort(candidates);
		recurse(candidates, 0, target,list,newList);
		return list;
	}

	private static void recurse(int[] candidates, int cur, int remaining, List<List<Integer>> list, List<Integer> prevList) {
		if(remaining < 0){
			return ;
		}
		if(remaining == 0){
			Collections.sort(prevList);
			if(!list.contains(prevList)){
				list.add(prevList);
			}
		}
		for(int i = cur; i < candidates.length; i++ ){
			List<Integer> newList = new ArrayList<>(prevList);
			newList.add(candidates[i]);
			if(remaining - candidates[i] < 0){
				break;
			}else{
				recurse(candidates, cur, remaining - candidates[i], list, newList);
			}
		}
		return;
	}
	//CODE FROM https://leetcode.com/discuss/23818/iterative-java-dp-solution
    public static List<List<Integer>> combinationSum1(int[] cands, int t) {
        Arrays.sort(cands); // sort candidates to try them in asc order
        List<List<List<Integer>>> dp = new ArrayList<>();
        for (int i = 1; i <= t; i++) { // run through all targets from 1 to t
            List<List<Integer>> newList = new ArrayList(); // combs for curr i
            // run through all candidates <= i
            for (int j = 0; j < cands.length && cands[j] <= i; j++) {
                // special case when curr target is equal to curr candidate
                if (i == cands[j]) newList.add(Arrays.asList(cands[j]));
                // if current candidate is less than the target use prev results
                else for (List<Integer> l : dp.get(i-cands[j]-1)) {
                    if (cands[j] <= l.get(0)) {
                        List cl = new ArrayList<>();
                        cl.add(cands[j]); cl.addAll(l);
                        newList.add(cl);
                    }
                }
            }
            dp.add(newList);
        }
        return dp.get(t-1);
    }
}
