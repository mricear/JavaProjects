package ProjectFiles;

public class MaximalSquare {

	public static void main(String[] args) {
		System.out.println(maximalSquare(new char[][]
			{{'1','1','1','1'},
			{'1','1','0','1'},
			{'1','1','0','1'}}));
		System.out.println(maximalSquare(new char[][]{{'1','0'},{'0', '1'}}));

	}

	public static int maximalSquare(char[][] matrix) {
		if(matrix.length == 0){
			return 0;
		}
		if(matrix.length == 1){
			for(int i = 0; i < matrix[0].length; i++){
				if(matrix[0][i] == '1')
					return 1;
			}
			return 0;
		}
		int[][] dup = new int[matrix.length][matrix[0].length];
		int result = 0;
		for(int i = 0; i < matrix[0].length; i++){
			dup[0][i] = matrix[0][i] - '0';
			if(matrix[0][i] == '1')
				result = 1;
		}
		for(int i = 0; i < matrix.length; i++){
			dup[i][0] = matrix[i][0] - '0';
			if(dup[i][0] == 1)
				result = 1;
		}
		for(int i = 1; i < matrix.length; i++){
			for(int j = 1; j < matrix[0].length; j++){
				if(matrix[i][j] == '1'){
					dup[i][j] =  (min(dup[i-1][j], dup[i-1][j-1], dup[i][j-1]) ) + 1;
					if(dup[i][j] > result){
						result = dup[i][j];
					}
				}
			}
		}
		return result*result;
	}

	private static int min(int a, int b, int c) {
		if(a < b){
			if(a<c){
				return a;
			}
			else{
				return c;
			}
		}
		else{// b <= a
			if(b<c){
				return b;
			}
			else{
				return c;
			}
		}
	}

}
