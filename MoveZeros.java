package ProjectFiles;

public class MoveZeros {

	public static void main(String[] args) {
		System.out.println("TEST CASE 1");
		int[] a = {1,0,3,2,6};
		moveZeroes(a);
		for(int i: a){
			System.out.print(i+ " ");
		}
		System.out.println("TEST CASE 2");
		int[] a1 = {0,0,0,0};
		moveZeroes(a1);
		for(int i: a1){
			System.out.print(i+ " ");
		}
		System.out.println("TEST CASE 3");
		int[] a2 = {0,0,3,2,6};
		moveZeroes(a2);
		for(int i: a2){
			System.out.print(i+ " ");
		}
		System.out.println("TEST CASE 4");
		int[] a3 = {1,0,0,0,6};
		moveZeroes(a3);
		for(int i: a3){
			System.out.print(i+ " ");
		}
	}

	public static void moveZeroes(int[] nums) {
		int i = 0;
		while(i < nums.length && nums[i] != 0)
			i++;

		if(i == nums.length){
			return;
		}

		int zeroptr = i;

		int firstNonZeroValueStartPoint = -1; 
		while(i < nums.length){
			if(nums[i] != 0){
				if(firstNonZeroValueStartPoint == -1){
					firstNonZeroValueStartPoint = i;
				}
				nums[zeroptr++] = nums[i];
			}
			i++;
		}
		
		while(zeroptr < nums.length){
			nums[zeroptr++] = 0;
		}
	}
}
