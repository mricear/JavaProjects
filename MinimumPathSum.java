package ProjectFiles;

public class MinimumPathSum {

	public static void main(String[] args) {

	}

	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		for(int i = m-1; i >= 0 ; i--){ 
			for(int j = n-1;  j >= 0; j--){
				if(j+1 >= n && i+1 >= m){	
				}
				else if(i+1 >= m){
					grid[i][j] += grid[i][j+1];
				}
				else if(j+1 >= n){
					grid[i][j] += grid[i+1][j];
				}
				else{
					grid[i][j] = grid[i][j] +  Integer.min(grid[i][j+1] , grid[i+1][j]);
				}
			}
		}
		return grid[0][0];
	}

}
