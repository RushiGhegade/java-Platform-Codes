
import java.util.*;
class Demo{
	
	public static int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i=i+2){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,0,1};
		Arrays.sort(arr);

		int num=singleNumber(arr);
		System.out.println(num);
	}
}	
