package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		l.add(a);
		a = new ArrayList<>();
		a.add(3);a.add(4);
		l.add(a);
		a = new ArrayList<>();
		a.add(6);a.add(5);a.add(7);
		l.add(a);
		a = new ArrayList<>();
		a.add(4);a.add(1);a.add(8);a.add(3);
		l.add(a);
		System.out.println(minimumTotal(l));
	}
	
	public static int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >=0; i--){
        	for(int j = 0; j < triangle.get(i).size(); j++){
        		triangle.get(i).set(j, triangle.get(i).get(j)+ Integer.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
        	}
        }
        return triangle.get(0).get(0);
    }

}
