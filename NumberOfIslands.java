package ProjectFiles;

public class NumberOfIslands {

	public static void main(String[] args) {
		System.out.println(numIslands(new char[][] {{'1','1','0'},{'0','0','1'},{'1','1','0'}}));
		System.out.println(numIslands(new char[][] {{'1'}}));
	}


	public static int numIslands(char[][] grid) {
		if(grid.length == 0){
			return 0;
		}
		int rows = grid.length;
		int cols = grid[0].length;
		int result = 0;
		for(int i = 0 ; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(grid[i][j] == '1'){
					recurseAndFind(i,j,grid,rows,cols);
					result++;
				}
			}
		}
		return result;
	}


	private static void recurseAndFind(int i, int j, char[][] grid, int rows, int cols) {
		grid[i][j] = '0';
		if( j+1 < cols && grid[i][j+1] == '1'){
			recurseAndFind(i , j +1 , grid,rows,cols);
		}
		if(i +1 < rows && grid[i+1][j] == '1'){
			recurseAndFind(i+1, j, grid, rows, cols);
		}
		if(i - 1 >= 0 && grid[i-1][j] == '1'){
			recurseAndFind(i-1, j, grid, rows, cols);
		}
		if(j -1  >= 0 && grid[i][j-1] == '1'){
			recurseAndFind(i, j -1, grid, rows, cols);
		}
	}
}
