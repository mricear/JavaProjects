package ProjectFiles;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));
	}

	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		if(words.length ==0)
			return 0;
		return words[words.length -1].length();
	}

}
