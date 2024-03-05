/*
 *Max Value of Equation
Company: Microsoft,Goldman Sachs, Wipro, Infosys
Platform: leetcode-1499.
Description:
You are given an array points containing the coordinates of points on a 2D plane, sorted
by the x-values, where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length.
You are also given an integer k.
Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i
< j <= points.length.
It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi -
xj| <= k.

Example 1:
Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
Output: 4
Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the
equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and
give a value of 10 + -10 + |5 - 6| = 1.
No other pairs satisfy the condition, so we return the max of 4 and 1.
Example 2:
Input: points = [[0,0],[3,0],[9,2]], k = 3
Output: 3
Explanation: Only the first two points have an absolute difference of 3 or less in the
x-values, and give the value of 0 + 0 + |0 - 3| = 3.

Constraints:
2 <= points.length <= 105
points[i].length == 2
-108 <= xi, yi <= 108
0 <= k <= 2 * 108
xi < xj for all 1 <= i < j <= points.length
xi form a strictly increasing sequence.
 * */


class Demo{
	
	static int BruteForce(int arr[][],int k){
		
		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				
				int diff=Math.abs(arr[i][0]-arr[j][0]);

				if(diff<=k){

					int sum=arr[i][1]+arr[j][1]+diff;

					if(sum>max){
						max=sum;
					}
				
				}

			}
		}
		return max;
	}
		
	static int Optimize(int arr[][],int k) {

		int max=Integer.MIN_VALUE;
		int flag=0;
		for(int i=0;i<arr.length-1;i++) {
			if(flag<i+1){
				flag=i+1;
			}
			for(int j=flag;j<arr.length;j++) {
				
				int diff=Math.abs(arr[i][0]-arr[j][0]);

				if(diff>k){
					break;
				}

				int res=arr[i][1]+arr[j][1]+diff;

				if(res>max){
					max=res;
					flag=j-1;
				}

			}
		}

		return max;
	}
	public static void main(String args[]){
		
		int arr[][]=new int[][] {{0,0},{3,0},{9,2}}; 
		int k = 3;
		

		// brute force time complexity -->>> O(N^2)
		int ans=BruteForce(arr,k);
		System.out.println(ans);


		// Optimize apprcoh
		int ans1=Optimize(arr,k);
		System.out.println(ans1);


	}
}
























