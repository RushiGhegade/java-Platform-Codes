/*
Sliding Window Maximum
Company: Flipkart, Amazon, Microsoft, Directi
Platform: leetcode-239
Fraz’s DSA sheet

Description:
You are given an array of integers nums, there is a sliding window of size k which is
moving from the very left of the array to the very right. You can only see the k numbers in
the window. Each time the sliding window moves right by one position.
Return the max sliding window.

Example 1:
Input:
nums = [1,3,-1,-3,5,3,6,7], k = 3
Output:
[3,3,5,5,6,7]

Explanation:
Window position Max
--------------- -----
[1 3 -1] -3 5 3 6 7 3
1 [3 -1 -3] 5 3 6 7 3
1 3 [-1 -3 5] 3 6 7 5
1 3 -1 [-3 5 3] 6 7 5
1 3 -1 -3 [5 3 6] 7 6
1 3 -1 -3 5 [3 6 7] 7
Example 2:
Input:
nums = [1], k = 1
Output:
[1]

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length
*/


import java.util.*;
class Window {

	public static void main(String args[]) {
		
		int arr[]=new int[]{1,3,-1,-3,5,3,6,7};
		int  k = 3;
		// OPtimize Approch
		LinkedList<Integer> StoreIndex=new LinkedList<Integer>();
		List<Integer> result =new ArrayList<>();

		for(int i=0;i<arr.length;i++){
			
			while(StoreIndex.size() > 0 && StoreIndex.getFirst() <= i-k){
				StoreIndex.removeFirst();
			}

			while(StoreIndex.size() > 0 && arr[StoreIndex.getLast()] < arr[i]){
				StoreIndex.removeLast();
			}

			StoreIndex.add(i);

			if(i >= k-1){
				result.add(arr[StoreIndex.getFirst()]);
			}
		}

		int arr1[]=new int[result.size()];

		for(int i=0;i<arr1.length;i++){
			arr1[i]=result.get(i);
			System.out.print(arr1[i] +" ");
		}System.out.println();

	


	}
}














