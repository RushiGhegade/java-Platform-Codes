/*
Move Zeros

Company: Paytm, Amazon, Microsoft, Samsung, SAP Labs, Linkedin,
Bloomberg, BlueStack
Platform:Leetcode-283, GFG
Fraz’s and Striver’s SDE Sheet
Description:
Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/


class MoveZerosEnd{
	
	static void moveZeros(int arr[]){
		
		int nz=0;  // keep track on non zero element
		int z=0;   // keep track on zero
		
		while(nz<arr.length){
			
			if(arr[nz]!=0){
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
			}else{
				nz++;
			}
		}
	}

	public static void main(String args[]){

		int arr[]=new int[]{1,2,3,0,0,0,0};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		moveZeros(arr);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}




















