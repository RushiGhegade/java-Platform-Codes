/*
 *2: K-th element of two Arrays
Company: Flipkart, Microsoft
Platform: GFG
Love Babbar’s DSA Sheet
Description:
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element
K. The task is to find the element that would be at the kth position of the final
sorted array.

Example 1:
Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output: 6
Explanation: The final sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Example 2:
Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
Output: 256
Explanation: Final sorted array is - 72, 86, 100, 112, 113, 119, 256, 265, 349,
445, 770, 892
7th element of this array is 256.
Expected Time Complexity: O(Log(N) + Log(M))
Expected Auxiliary Space: O(Log (N))

Constraints:
1 <= N, M <= 106
0 <= arr1i, arr2i < INT_MAX
1 <= K <= N+M
 * */

class KthElement{


	static int[] marge(int arr1[],int arr2[]) {

		int n=arr1.length+arr2.length;

		int arr[]=new int[n];

		int i=0;
		int j=0;
		int k=0;

		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<=arr2[j]){
				arr[k]=arr1[i];
				i++;
			}else{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length){
			arr[k]=arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length){
			arr[k]=arr2[j];
			j++;
			k++;
		}

		return arr;
	}

	public static void main(String args[]) {
		
		int arr1[]=new int[]{100,112,256,349,770};
		int arr2[]=new int[]{72,86,113,119,256,445,892};

		int k=7;
		int arr[]=marge(arr1,arr2);

		System.out.println(arr[k-1]); // 1 based Index
	}
}
