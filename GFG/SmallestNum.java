/*
Find the smallest and second smallest element in
an array
Company: Amazon, Goldman Sachs
Platform: GFG
Description:
Given an array of integers, your task is to find the smallest and second smallest
element in the array. If smallest and second smallest do not exist, print -1.
Example 1:
Input :
5
2 4 3 5 6
Output :
2 3
Explanation:
2 and 3 are respectively the smallest
and second smallest elements in the array.

Example 2:
Input :
6
1 2 1 3 6 7
Output :
1 2
Explanation:
1 and 2 are respectively the smallest
and second smallest elements in the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

*/
import java.util.*;
class Smallest{
	static long[] minAnd2ndMin(long a[])  
    	{
        long arr[]=new long[2];
        
        long min=Integer.MAX_VALUE;
        long smin=Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            
            if(min>a[i]){
                smin=min;
                min=a[i];
                flag=true;
            }else if(smin>a[i] && a[i]!=min){
                smin=a[i];
                flag=true;
            }
        }
        int m=0;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                m++;
            }
            
        }
        if(m==a.length-1){
            flag=false;
        }
        if(flag){
            arr[0]=min;
            arr[1]=smin;
            return arr;
        }else{
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
	}
	public static void main(String args[]){
		long arr[]=new long[]{1 ,2, 1, 3, 6, 7};

		long ans[]=minAnd2ndMin( arr);

		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}System.out.println();
		
		
	}
}















