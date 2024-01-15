/*
Description:
Given an array Arr of N positive integers and another number X. Determine
whether or not there exist two elements in Arr whose sum is exactly X.
Example 1:
Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:
Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

import java.util.*;
class KeyPair{



	// Brute Force Approch	
	static String keypair(int arr[],int k){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==k)
					return "yes";
			}
		}
		return "No";
		
	}

	// Optimal Approch
	static String keypairoptimal(int arr[],int k){
		
		Set<Integer> set= new HashSet<Integer>();

		for(int i=0;i<arr.length;i++){
			
			int ans=k-arr[i];

			if(set.contains(ans))
				return "Yes";
			else
				set.add(arr[i]);
		}

		return "No";
	}
	public static void main(String args[]){
		int arr[]=new int[]{1,4,45,6,10,8};
		int k=16;
		String ans=keypair(arr,k);
		System.out.println(ans);

		String ans1=keypairoptimal(arr,k);
                System.out.println(ans1);
	}
}
