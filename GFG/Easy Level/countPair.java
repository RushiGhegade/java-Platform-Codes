/*
Count pairs with given sum
Company: Amazon, MakeMyTri, Facebook, UnitedHealth Group
Platform: GFG
Love Babbar’s SDE Sheet
Description:
Given an array of N integers, and an integer K, find the number of pairs of
elements in the array whose sum is equal to K.
Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6 and arr[1] + arr[3] = 5 + 1 = 6.
Example 2:
Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation:
Each 1 will produce sum 2 with any 1.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/
import java.util.*;
class CountPair{
	
	// optimal Aproch
	static int Countpair(int arr[],int k){
		
		int count=0;
		
		Map<Integer,Integer> mp=new HashMap<>();

		for(int i=0;i<arr.length;i++){
			
			if(mp.containsKey(arr[i])){
				mp.put(arr[i],mp.get(arr[i])+1);
			}else{
				mp.put(arr[i],1);
			}
		}
	
		for(int i=0;i<arr.length;i++){
			
			int ans=k-arr[i];
			
			if(mp.containsKey(ans)){
				
				mp.put(arr[i],mp.get(arr[i])-1);
				if(mp.get(ans)!=0){
					count=count+mp.get(ans);

				}
			}else{
				System.out.println(arr[i]);
			}
		}

		return count;
	}
	// Brute Force Approch O(n^2)
	static int countpair(int arr[],int k){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){

				int sum=arr[i]+arr[j];

				if(sum==k){
					count++;	
				}
			}
		}

		return count;
	}
	public static void main(String args[]){
		
		int arr[]=new int[]{1,5,7,1};
		
		int k=6;
		int ans=Countpair(arr,k);
		System.out.println(ans);
	}
}









