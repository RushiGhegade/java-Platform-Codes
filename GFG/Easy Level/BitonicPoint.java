/*
 *Bitonic Point
Company: Flipkart, Amazon, Microsoft

Platform:GFG
Description:
Given an array arr of n elements that is first strictly increasing and then
maybe strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the
maximum value.
Example 1:
Input:
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.
Example 2:
Input:
n = 5
arr[] = {1, 45, 47, 50, 5}
Output: 50
Explanation: The maximum element is 50.
Expected Time Complexity: O(logn)
Expected Auxiliary Space: O(1)
 * */



class BitonicPoint {
		
	static int bitonicPoint(int arr[] , int k){
		
		int start=0;
		int end=arr.length-1;
		
		int max=Integer.MIN_VALUE;

		while(start <= end){
			
			int mid = start +(end-start)/2;

			if (arr[mid] > max ){
				
				max=arr[mid];
			}
			 

			if(mid==0){
				 if(arr[mid+1] >= arr[mid]){

                                	start=start+1;
				 }else{
					end=mid-1;
				 }
                        }else if(mid==arr.length-1){	
				 if(arr[mid-1] >= arr[mid]){

                                	end=mid-1;
                        	}else{
					start=mid+1;
				}
			}else{

				if(arr[mid-1] > arr[mid]){
				
					end=mid-1;
				}

				if(arr[mid+1] > arr[mid]){
				
					start=mid+1;
				}

				if(arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid]){

                                        return arr[mid];
                          }
			}
		
	

		
		}
		return max;
	}	

	public static void main(String args[]) {
		
		int arr[]=new int[]{7,6,5,4,3,2,1};

		int k=0;

		int ans = bitonicPoint(arr,k);

		System.out.println(ans);
	}
}


