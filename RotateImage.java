package ProjectFiles;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);


		int rows = matrix.length;
		int cols = matrix[0].length;
		for(int i = 0; i < rows; i++){
			for(int j =0; j < cols; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(matrix1);

		rows = matrix1.length;
		cols = matrix1[0].length;
		for(int i = 0; i < rows; i++){
			for(int j =0; j < cols; j++){
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}



	public static void rotate(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int j = 0;
		for(int i = 0; i < rows; i++){
			for(j = i+1; j < cols; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		int mid_col;
		if(rows %2 == 0){
			mid_col = rows/2 ;
		}
		else{
			mid_col = rows/2 +1;
		}
		for(int i = 0; i < rows; i++){
			for(j = 0; j < mid_col; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][rows - 1- j];
				matrix[i][rows - 1- j] = temp;
			}
		}
	}

}
