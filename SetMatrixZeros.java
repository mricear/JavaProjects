package ProjectFiles;

public class SetMatrixZeros {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1},{1,1,1,1}};
		setZeroes(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void setZeroes(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					for(int a = 0; a < matrix.length ; a++ ){
						if(matrix[a][j] != 0 ){
							matrix[a][j] = Integer.MIN_VALUE +2;
						}
					}
					for(int b = 0; b < matrix[0].length ; b++){
						if(matrix[i][b] != 0){
							matrix[i][b] = Integer.MIN_VALUE + 2;
						}
					}
				}
			}
		}
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == Integer.MIN_VALUE +2){
					matrix[i][j] = 0;
				}
			}
		}
	}

}
