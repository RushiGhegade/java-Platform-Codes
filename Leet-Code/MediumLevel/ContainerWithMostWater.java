/*
 *Container With Most Water
Companies : Google, Microsoft,Amazon,
Flipkart,Adobe,Dunzo,Paytm,PhonePe, Goldman Sachs.
Platform:leetcode - 11
Fraz’s DSA sheet.
Description:
You are given an integer array height of length n. There are n vertical lines
drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the
container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation:

The above vertical lines are represented by array
[1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue
section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 *
 * */

import java.io.*;
import java.util.*;
import java.lang.*;


class ContainerMostWater{
	public static void main (String[] args) throws IOException{
	    int arr[]=new int[]{1,8,6,2,5,4,8,3,7};
	    int n=arr.length;

	    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        long max=Integer.MIN_VALUE;
        
        int i=0;
        int j=A.length-1;
        
        if(A.length==1){
            return 0;
        }
        
        while(i<j){
            
            if(A[i]<A[j]){
                
                long width=j-i;
                
                long area=A[i]*width;
                
                if(area>max){
                    max=area;
                }
                i++;
            }else{
                long width=j-i;
                
                long area=A[j]*width;
                
                if(area>max){
                    max=area;
                }
                 j--;
            }
           
            
        }
        
        return max;
    }
    
}
