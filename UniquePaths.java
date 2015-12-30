package ProjectFiles;

public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3,4));
	}

	public static int uniquePaths(int m, int n) {
		int[][] matrix = new int[m][n];
		
		for(int i = m-1; i >= 0 ; i--){ 
			for(int j = n-1;  j >= 0; j--){
				if(j+1 >= n && i+1 >= m){
					matrix[m-1][n-1] = 1;			
				}
				else if(i+1 >= m){
					matrix[i][j] = matrix[i][j+1];
				}
				else if(j+1 >= n){
					matrix[i][j] = matrix[i+1][j];
				}
				else{
				matrix[i][j] = matrix[i][j+1] + matrix[i+1][j];
				}
			}
		}
		return matrix[0][0];
	}
}
