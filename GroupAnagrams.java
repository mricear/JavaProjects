package ProjectFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		List<List<String>> list = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
		for(List<String > l : list){
			System.out.println(l);
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();

		for(String s: strs){
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String key = new String(temp);
			List<String> list;
			if(map.containsKey(key)){
				list = map.get(key);
				list.add(s);
			}
			else{
				list = new ArrayList<String>();
				list.add(s);
				map.put(key, list);
			}
			
		}
		List<List<String>> result = new ArrayList<List<String>>();
		for(List<String> e : map.values()){
			Collections.sort(e);
			result.add(e);
		}
		return result;
	}

}
