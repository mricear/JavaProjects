package ProjectFiles;

/**
 * This problem is different than the one leetcode was expecting.
 * It gets the LCP for any two strings whereas leetcode is expecting to return the LCP
 * for all the strings.
 * @author ma64
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] st = {"this is a test", "this is also a test"," this is note"};
		System.out.println(longestCommonPrefix(st));
		String[] st2 = {"c","c", "gds"};
		System.out.println(longestCommonPrefix(st2));
		String[] st3 = {"ca","caf", "cafd"};
		System.out.println(longestCommonPrefix(st3));
		String[] st4 = {"","cdad", "cda"};
		System.out.println(longestCommonPrefix(st4));
	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)    return "";
		if(strs.length == 1) return strs[0];
		Trie1 t = new Trie1(' ');
		t.children =  new Trie1[256];
		String result = "";
		for(String s : strs){
			String st = addandSearch(s,t);
			if(st.length() > result.length()){
				result = st;
			}
		}
		return  result;
	}
	public static String addandSearch(String st, Trie1 t){
		String output = "";
		for(int i = 0; i < st.length(); i++){
			char c = st.charAt(i);
			if(t.children == null){
				t.children = new Trie1[256];
			}
			if(t.children[c] != null){
				t = t.children[c];
				output += c;
			}
			else{
				t.children[c] = new Trie1(c);
				t = t.children[c];
				t.children = new Trie1[256];
			}
		}
		return output;
	}

	public static String longestCommonPrefixAmongAllStrings(String[] strs) {
		String result = "";
		for(String s : strs){
			String lcp = longestCommonPrefix();
		}
	}
}

class Trie1{
	Trie1[] children;
	char value;

	Trie1(char c){
		value = c;
	}

}
