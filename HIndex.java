package ProjectFiles;

import java.util.*;

public class HIndex {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,8,10};
		System.out.println(hIndex(a));
		int[] a1 = {1,5,5,5,8,10};
		System.out.println(hIndex(a1));
		int a2[] = {0,0,0,0,1};
		System.out.println(hIndex(a2));
		int a3[] = {0,0,10,10,10};
		System.out.println(hIndex(a3));
	}
	public static int hIndex(int[] citations) {
		int hindex = 0;
		Arrays.sort(citations);
		for(int j = citations.length -1,h = 1; j >= 0; j-- ){
			if(citations[j] >=h){
				hindex = h;
				h++;
			}
			else{
				break;
			}
		}
		return hindex;
	}
	//CODE from https://leetcode.com/discuss/56122/standard-binary-search
	public static int hIndex1(int[] citations) {
		int left=0, len = citations.length, right= len-1,  mid;
        while(left<=right)
        {
            mid=(left+right)>>1;
            if(citations[mid]== (len-mid)) return citations[mid];
            else if(citations[mid] > (len-mid)) right = mid - 1;
            else left = mid + 1;
        }
        return len - (right+1);
	}
}
