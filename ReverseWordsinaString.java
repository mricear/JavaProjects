package ProjectFiles;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		String s = "   risk  ffsd   or     life    ";
		System.out.println(reverseWords(s));
		//System.out.println(s);
	}


	public static String reverseWords(String s) {
		s = s.trim();
		char[] str = s.toCharArray();
		reverse(str,0,str.length -1);
		int cur = 0, i = 0, start = 0, end =0;
		while( i < str.length){
			while( i < str.length && str[i] == ' ') i++;
			start = i;
			while(i < str.length && str[i] != ' ') i++;
			end = i-1;
			reverse(str,start, end);

			for(int a = cur, b = start; b <= end; a++, b++)
				str[a] = str[b];

			cur = cur + end - start +2;
			if(cur -1 <str.length )
				str[cur - 1] = ' ';

		}
		while(cur < s.length()){
			str[cur++] = ' '; 
		}
		String result = new String(str);
		return result.trim();

	}


	private static void reverse(char[] s, int a, int b) {
		for(int i = a, j = b; i < j ; i++, j--){
			char c = s[i];
			s[i] = s[j];
			s[j] = c;
		}
	}

}
