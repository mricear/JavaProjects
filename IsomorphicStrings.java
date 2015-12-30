package ProjectFiles;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("put", "kit"));
		System.out.println(isIsomorphic("put", "ktt"));
		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("paper", "title"));
	}

	
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
    	for(int i = 0; i < s.length(); i++){
    		char cur = s.charAt(i);
        	if(map.containsKey(cur)){
        		char value = map.get(cur);
        		if(value != t.charAt(i)){
        			return false; 
        		}
        	}
        	else{
        		if(map.containsValue(t.charAt(i))){
        			return false;
        		}
        		map.put(cur, t.charAt(i));
        	}
        }
    	return true;
    }
}
