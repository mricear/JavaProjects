package ProjectFiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {

	public static void main(String[] args) {
		List<String> r = findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		for(String s: r)
			System.out.println(s);
	}
	
    public static List<String> findRepeatedDnaSequences(String s) {
    	List<String> result = new ArrayList<>();
    	
    	if(s.length() < 10)
    		return result;
    	
        StringBuilder key = new StringBuilder();
        HashMap<String,Integer> cache = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

    	for(int i = 0;i <= 9; i++){
    		key.append(s.charAt(i));
    	}
    	cache.put(key.toString(),1);
    	
    	for(int i = 10; i < s.length() ; i++){
    		key.append(s.charAt(i));
    		key.deleteCharAt(0);
    		String keyString = key.toString();
    		if(cache.containsKey(keyString) ){
    			int value = cache.get(keyString) ;
    			if(value == 1){
    			result.add(keyString);
    			}
    			cache.put(keyString, value+1);
    		}
    		else
    			cache.put(keyString,1);
    	}
    	return result;
    }

}
