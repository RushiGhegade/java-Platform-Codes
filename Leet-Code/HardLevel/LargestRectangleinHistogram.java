/*
 *:Largest Rectangle in Histogram
Company: Microsoft, Google
Platform: leetcode- 84, GFG
Fraz’s DSA sheet.
Description:

Given an array of integers heights representing the histogram's bar height where
the width of each bar is 1, return the area of the largest rectangle in the histogram.

Example 1:

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:

Input: heights = [2,4]
Output: 4

Constraints:
1 <= heights.length <= 105
0 <= heights[i] <= 104
 * */

import java.util.*;
class Demo{
	
	static int findmaxArea(int arr[]) {
		
		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++) {

			int left=i-1;
			int lcount=0;
			while(left>=0){
				if(arr[left] > arr[i]){
					lcount++;
				}else{
					break;
				}

				left--;
			}

			int rcount=1;
			int right=i+1;

			while(right<arr.length){
				if(arr[right] > arr[i]){
					rcount++;
				
				}else{
					break;
				}

				right++;
			}

			max=Math.max(max,(arr[i]*(lcount+rcount)));
		}
		return max;
	}
	
	static void  Findleftsmall(int[] arr,int[] lsmall){

	 	Stack s=new Stack();

		s.push(-1);

		for(int i=0;i<arr.length;i++){

			while((int)s.peek()!=-1 && arr[i] <= arr[(int)s.peek()] ){
				s.pop();
			}
			
			lsmall[i]=(int)s.peek();
			s.push(i);
		}
	}


	

	static void Findrightsmall(int arr[] ,int rsmall[]){

		Stack s=new Stack();

		s.push(-1);


		for(int i= arr.length-1;i>=0;i--){

			while((int )s.peek()!=-1 && arr[i] <= arr[(int )s.peek()]){
				s.pop();
			}

			rsmall[i]=(int )s.peek();
			s.push(i);

		}
	}

	public static void main(String args[]) {
		
		int arr[]=new int[]{2,1,5,6,2,3};

		// Brute Force -->TLE  time complexity ->O(n^2);
		int area=findmaxArea(arr);
		System.out.println(area);

		// Optimize Approch		
		int lsmall[]=new int[arr.length];
		int rsmall[]=new int[arr.length];

		Findleftsmall(arr,lsmall);
		Findrightsmall(arr,rsmall);
		
		int maxarea=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			int right=rsmall[i];
			int left=lsmall[i];
			
			if(right==-1){
				right=arr.length;
			}
			
			int width=right-left-1;

			maxarea=Math.max(maxarea,arr[i]*width);
		}

		System.out.println(maxarea);
	}
}































