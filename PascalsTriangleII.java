package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public static void main(String[] args) {
		
	}
    
	public List<Integer> getRow(int rowIndex) {
		
		List<Integer> l1 =  new ArrayList<>();
		
		if(rowIndex == 0)
			return l1;
		
		l1.add(1);
		List<Integer> l = l1;
		for(int i = 2 ; i <= rowIndex; i++){
			l =  new ArrayList<>();
			for(int j = 0 ; j < i; j++ ){
				int f,s;
				if((j - 1) >= 0){
					f = l1.get(j-1);
				}
				else
					f  = 0;
				if(j < l1.size()){
					s = l1.get(j);
				}
				else
					s = 0;
				
				l.add(f + s); 
			}
			l1 = l;
		}
		return l;
    }

}
