package ProjectFiles;

public class WordSearch {

	public static void main(String[] args) {
		System.out.println(exist(new char[][] {{'C','A','A'},{'A','A','A'},{'B','C','D'}},"SAND"));
	}

	public static boolean exist(char[][] board, String word) {
		
		Trie t =
		int rows = board.length, cols = board[0].length;
		if(word == null || word == "")
			return false;
		char s = word.charAt(0);
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < cols; j++){
				if(board[i][j] == s){
					if(helper(i,j,board ,word , 0))
						return true;
				}
			}
		return false;
	}

	private static boolean helper(int i, int j, char[][] board, String word, int index) {
		if(index == word.length())
			return true;
		if(i < 0 || i >= board.length || j < 0 || j >= board[0].length)
			return false;
		if( board[i][j] == word.charAt(index)){
			board[i][j] ^= 256;
			boolean r = helper(i+1,j,board, word, index+1) ||
					helper(i-1,j,board, word, index+1) ||
					helper(i,j+1,board, word, index+1) ||
					helper(i,j-1,board, word, index+1);
			board[i][j] ^= 256;
			return r;
		}
		return false;
	}

}
