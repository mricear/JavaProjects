package ProjectFiles;

public class SortColors {

	public static void main(String[] args) {
		sortColors(new int[]{1,2,2,2,1,0,0,0});
		System.out.println();
		sortColors(new int[]{0,0,0,1,2,2,2,1,0,0,0});
	}

	private static void sortColors(int[] nums) {

		int i = 0, j = nums.length -1;
		int mid = 0;
		
		while(mid <= j){
			if(nums[mid] == 0){
				int t = nums[i];
				nums[i] = nums[mid];
				nums[mid] = t;
				i++;mid++;
			}
			else if(nums[mid] == 2){
				int t = nums[mid];
				nums[mid] = nums[j];
				nums[j] = t;
				j--; 
			}
			else{
				mid++;
			}
		}
		
		for(int i1 = 0; i1 < nums.length ; i1++)
			System.out.print(nums[i1]);
	}
	
	
	
	private static void sortColors3(int[] nums) {
		int leftPtr = 0,rightPtr = nums.length -1;
		int i = leftPtr, j = rightPtr;
		while(i <= j){
			while(nums[i] == 0 ) {
				i++;
			}

			while(nums[j] == 2 ){
				j--;
			}
			
			if(nums[i] == 2 && nums[j] == 0){
				int t = nums[i];
				nums[i] = nums[j];
				nums[j] = t;
			}
			if(nums[i] == 1 || nums)
		}
	}

	public static void sortColors2(int[] nums) {
		int i = 0,j = nums.length -1 , mid = (i + j )/2;
		int mid1 = mid, mid2 = mid;

		while( (i <= j) && (i <= mid1) && (j >= mid2)){
			while(nums[i] == 0){ i++;}
			while(nums[j] == 2){ j--;}
			while( nums[mid1] == 1){ mid1--;}
			while(nums[mid2] == 1){mid2++;}
			if( (i <= mid1) &&  nums[i] == 1 && nums[mid1] == 0){
				int temp = nums[i];
				nums[i] = nums[mid1];
				nums[mid1] = temp;
				i++; mid1--;
			} 
			if( (i <= mid2) && nums[i] == 1 && nums[mid2] == 0){
				int t = nums[i];
				nums[i] = nums[mid2];
				nums[mid2] = t;
				i++;mid2++;
			}
			if((i <= j) && nums[i] == 2 && nums[j] == 0){
				int t = nums[i];
				nums[i] = nums[j];
				nums[j ] = t;
				i++;j--;
			}

			if( (j >= mid1) &&  nums[j] == 1 && nums[mid1] == 2){
				int temp = nums[i];
				nums[i] = nums[mid1];
				nums[mid1] = temp;
				j--; mid1--;
			} 
			if( (j >= mid2) && nums[j] == 1 && nums[mid2] == 2){
				int t = nums[i];
				nums[i] = nums[mid2];
				nums[mid2] = t;
				j--;mid2++;
			}
		}
	}

	public static void sortColors1(int[] nums) {
		int a =0, b = 0, c = 0;

		for(int i : nums){
			if(i == 0){
				a++;
			}
			else if(i == 1){
				b++;
			}
			else{
				c++;
			}
		}
		for(int i = 0; i < nums.length; ){
			while(a > 0){
				nums[i] = 0;
				a--;
				i++;
			}
			while(b > 0){
				nums[i] = 1;
				b--;
				i++;
			}
			while(c > 0){
				nums[i] = 2;
				c--;
				i++;
			}
		}
		for(int i : nums){
			System.out.println(i);
		}
	}

}
