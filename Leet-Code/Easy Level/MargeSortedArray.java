/*
Merge Sorted Array
Company: Amazon, Samsung, LinkedIn +50 companies
Platform: Leetcode - 88
Fraz’s and Striver’s SDE sheet
Description:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2
respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored
inside the array nums1. To accommodate this, nums1 has a length of m + n, where the
first m elements denote the elements that should be merged, and the last n elements
are set to 0 and should be ignored. nums2 has a length of n.
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from
nums1.
Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure
the merge result can fit in nums1.

Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
*/

class MargeSortedArray{
	
	static void margesortedarray(int arr1[],int arr2[]){

		int i=0;
		int j=0;

		while(i<arr1.length  && j<arr2.length){
				
			if(arr1[i]==0){                 // Need to handel this condition because zero comes at any possition
				int a1=arr1.length-i;
				int a2=arr2.length-j;

				if(a1==a2){
					break;
				}
			}


			if(arr1[i] <= arr2[j]){
				i++;
			}else{

				for(int k=arr1.length-2 ; k>=i ; k--){

					arr1[k+1]=arr1[k];
				}

				arr1[i]=arr2[j];
				i++;
				j++;
			}
		}

		while(i<arr1.length && j<arr2.length){
			arr1[i]=arr2[j];
			i++;
			j++;
		}
	}

	public static void main(String args[]){
		
		int arr1[]=new int[]{1,2,3,0,0,0};

		int arr2[]=new int[]{2,5,6};

		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]);
		}System.out.println();

		margesortedarray(arr1,arr2);


		for(int i=0;i<arr1.length;i++){
                        System.out.print(arr1[i]);
                }System.out.println();
	}

}


















