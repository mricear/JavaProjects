package ProjectFiles;

public class MajorityElement {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {1,1,1,1,3,4,2,0,0,0,0,0,0,0,0}));
	}
	public static int majorityElement(int[] nums) {
		if(nums == null )
			return 0;

		int count = 0, result = 0;
		for(int i = 0; i < nums.length; i++){
			int e = nums[i];
			if(count == 0){
				result = e;
				count++;
			}
			else if(result == e){
				count++;
			}
			else
				count--;
		}
		return result;
	}

}
