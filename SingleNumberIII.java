package ProjectFiles;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {

	public static void main(String[] args) {
		int n[] = {1, 2, 1, 3, 2, 5,3,4};
		int[] r = singleNumber(n);
		for(int i: r){
			System.out.print(i+ " ");
		}
	}
	public static int[] singleNumber1(int[] nums) {
		int result[] = new int[2];
		HashMap<Integer, Boolean> cache = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(cache.containsKey(nums[i])){
				cache.remove(nums[i]);
			}
			else{
				cache.put(nums[i], true);
			}
		}
		int i = 0;
		for(Map.Entry<Integer,Boolean> e : cache.entrySet()){
			result[i++] = e.getKey();
		}
		return result;
	}
	
    public static int[] singleNumber(int[] nums) {
    	int xor = 0;
    	for(int i = 0; i < nums.length; i++)
    		xor ^= nums[i];
    	int differentDigit = 0;
    	for(int i = 0; i< 32 ; i++){
    		if(((xor >> i) & 1) == 1){
    			differentDigit = i;
    			break;
    		}
    	}
    	int xor1 =0, xor2 = 0;
    	for(int i = 0; i < nums.length; i++){
    		if(((nums[i] >> differentDigit) & 1) == 1){
    			xor1 ^= nums[i];
    		}
    		else
    			xor2 ^= nums[i];
    	}
    	return new int[] {xor1, xor2};
    }
}
