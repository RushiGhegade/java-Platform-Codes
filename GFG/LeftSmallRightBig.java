/*
Element with left side smaller and right side greater
Company: Zoho, Amazon, OYO Rooms, Intuit
Platform: GFG
Description :
Given an unsorted array of size N. Find the first element in the array such that all
of its left elements are smaller and all right elements are greater than it.
Note: Left and right side elements can be equal to required elements. And extreme
elements cannot be required.

Example 1:
Input:
N = 4
A[] = {4, 2, 5, 7}
Output:
5
Explanation:
Elements on left of 5 are smaller than 5
and on right of it are greater than 5.

Example 2:
Input:
N = 3
A[] = {11, 9, 12}
Output:
-1

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

class Demo{
	

	static int findelement(int arr[]){
		
		for(int i=1;i<arr.length-1;i++){


			boolean Right=true;
			boolean Left=true;


			for(int j=0;j<i;j++){
				
				if(arr[j]>arr[i]){
					Right=false;
					break;
				}
			}

			for(int j=i+1;j<arr.length;j++){
		
				if(arr[j]<arr[i]){
					Left=false;
					break;
				}
			}

			if(Right==Left){
				return arr[i];
			}
		}
		return -1;

	}

	public static void main(String args[]){
		
		int arr[]=new int[]{4, 2, 5, 7};

		int ans=findelement(arr);

		System.out.println(ans);
	}
}

























