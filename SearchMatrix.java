package ProjectFiles;

public class SearchMatrix {

	public static void main(String[] args) {
		int matrix[][] = {{1,3,5,7},
				          {2,4,7,9},
				          {3,6,9,13}}; 
		System.out.println(searchMatrix(matrix, 13));
		System.out.println(searchMatrix(matrix, 15));
		System.out.println(searchMatrix(matrix, 0));
		System.out.println(searchMatrix(matrix, 1));
		System.out.println(searchMatrix(matrix, 4));
		
		
		int[][] matrix2 = {{-5}};
		System.out.println(searchMatrix(matrix2, -2));

	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		
		if(matrix == null || matrix.length == 0){
			return false;
		}
		
		int i = 0, j = matrix[0].length -1;
		
		while (i < matrix.length && j >= 0 ){
			if(matrix[i][j] == target){
				return true;
			}
			else if(matrix[i][j] > target){
				j--;
			}
			else{
				i++;
			}
		}
		
		return false;
	}

}
