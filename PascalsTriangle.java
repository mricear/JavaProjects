package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();

		if(numRows == 0)
			return result;

		List<Integer> l =  new ArrayList<>();
		l.add(1);
		result.add(l);

		for(int i = 2 ; i <= numRows; i++){
			l =  new ArrayList<>();
			for(int j = 0 ; j < i; j++ ){
				int f,s;
				if((j - 1) >= 0){
					f = result.get(i - 2).get(j-1);
				}
				else
					f  = 0;
				if(j < result.get(i - 2).size()){
					s = result.get(i - 2).get(j);
				}
				else
					s = 0;
				l.add(f + s); 
			}
			result.add(l);
		}
		return result;
	}

}
