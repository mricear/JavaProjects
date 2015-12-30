package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,5,4},
				         {2,3,4,58,6},
			           	 {9,5,3,2,4}};
		printSpirally(matrix);

		int [][] m2 = {{1,2},
				       {3,4},
				       {5,6},
				       {7,8}};
		printSpirally(m2);
		int [][] m3 = {{1,4,2},
				       {3,0,4},
				       {5,2,6},
				       {7,1,8}};
		printSpirally(m3);
		int [][] m4 = {{},
			           {},
			           {},
			           {}};
		printSpirally(m4);
	}

	private static List<Integer>  printSpirally(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		int row_start  = 0;
		int row_end = matrix.length - 1;
		int col_start = 0;
		int col_end = matrix[0].length -1;

		int  i = 0, j = 0;

		if(matrix.length == 0){
			return result;
		}
		
		while(true){
			j = col_start; 
			i = row_start;
			for(; j <= col_end ; j++){
				result.add(matrix[i][j]);
			}
			row_start++;
			j--;
			i++;
			if((row_start > row_end) || (col_start > col_end)){
				break;
			}

			for( ; i <= row_end; i++){
				result.add(matrix[i][j]);
			}
			col_end--;
			i--;
			j--;

			if((row_start > row_end) || (col_start > col_end)){
				break;
			}
			for( ; j >= col_start ; j--){
				result.add(matrix[i][j]);
			}
			row_end--;
			j++;
			i--;

			if((row_start > row_end) || (col_start > col_end)){
				break;
			}

			for(; i >= row_start; i--){
				result.add(matrix[i][j]);
			}
			col_start++;
			i++;
			j++;

			if((row_start > row_end) || (col_start > col_end)){
				break;
			}
		}
		return result;
	}

}
