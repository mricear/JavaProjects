package ProjectFiles;

public class SingleNumberII {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{1,2,1,1,6,6,6,2,2,3}));
	}
	
    public static int singleNumber(int[] nums) {
    	int result = 0, count;
    	for(int i = 0 ; i < 32; i++){
    		count = 0;
    		for(int j = 0; j < nums.length ; j++){
    			if(((nums[j] >> i) & 1 ) == 1)
    				count++;
    		}
    		if(count %3 != 0){
    			result |= 1<<i;
    		}
    	}
    	return result;
    }

}
