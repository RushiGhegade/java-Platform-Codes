/*
Trapping Rain Water
Company:Flipkart, Amazon, Microsoft, Google
Platform: GFG
Love babbar DSA sheet.
Description:
Given an array arr[] of N non-negative integers representing the height of
blocks. If width of each block is 1, compute how much water can be
trapped between the blocks during the rainy season.

Example 1:
Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation:

Example 2:
Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above
block of height 4 is 3 units and above
block of height 0 is 7 units. So, the
total unit of water trapped is 10 units.
Example 3:
Input:
N = 3
arr[] = {6,9,9}

Output:
0
Explanation:

No water will be trapped.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:

3 < N < 106
0 < Ai < 108
*/

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class TrappingWater {

	public static void main (String[] args) throws IOException {
			
		    int arr[]=new int[]{3,1,2,4,0,1,3,2};
		    int n=arr.length;

		    Solution obj = new Solution();		    
		    System.out.println(obj.trappingWater(arr, n));
	
	}
}
class Solution{
    
    
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];
        
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<leftmax[i-1]){
                leftmax[i]=leftmax[i-1];
            }else{
                leftmax[i]=arr[i];
            }
        }
        
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            
            if(arr[i]<rightmax[i+1]){
                rightmax[i]=rightmax[i+1];
            }else{
                rightmax[i]=arr[i];
            }
        }
        int min=0;
        long count=0;
        for(int i=0;i<arr.length;i++){
            
            if(rightmax[i]<leftmax[i]){
                min=rightmax[i];
            }else{
                min=leftmax[i];
            }
            
           count=count+(min-arr[i]);
            
        }
        return count;
    } 
}



