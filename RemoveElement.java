package ProjectFiles;

public class RemoveElement {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[]{1,2,5,7,2,2}, 2));
		System.out.println(removeElement(new int[]{2,2,2,2,2,2}, 2));
		System.out.println(removeElement(new int[]{}, 2));
		System.out.println(removeElement(new int[]{1,3,4,5,3}, 2));
		System.out.println(removeElement(new int[]{2,2,1,2,2,2}, 2));

	}
	public static int removeElement(int[] nums, int val) {
		int i = 0, j = nums.length -1;

		while(i <= j){
			while(i <= j && nums[i] != val){
				i++;
			}
			while(i <= j && nums[j] == val){
				j--;
			}
			//swap(nums[i], nums[j]);
			if(i <= j){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp; 
				i++;j--;
			}
		}
		
		return j+1;
	}

}
