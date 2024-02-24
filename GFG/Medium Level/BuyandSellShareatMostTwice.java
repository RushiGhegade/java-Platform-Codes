/*
 *Buy and Sell a Share at most twice
Company: Amazon, Facebook
Platform: GFG
Love Bubbar’s DSA sheet
Description:
In daily share trading, a buyer buys shares in the morning and sells them on the same
day. If the trader is allowed to make at most 2 transactions in a day, the second
transaction can only start after the first one is complete (buy->sell->buy->sell). The stock
prices throughout the day are represented in an array of prices.
Given an array price of size n, find out the maximum profit that a share trader could have
made.
Example 1:
Input:
n = 6
prices[] = {10,22,5,75,65,80}
Output:
87
Explanation:
Trader earns 87 as sum of 12, 75 Buy at 10, sell at 22, Buy at 5, and sell at 80.
Example 2:
Input:
n = 7
prices[] = {2,30,15,10,8,25,80}
Output:
100
Explanation:
Trader earns 100 as sum of 28 and 72 Buy at price 2, sell at 30, Buy at 8 and sell at 80,
Your Task:
Complete the function maxProfit() which takes an integer array price as the only
argument and returns an integer, representing the maximum profit, if only two
transactions are allowed.
Expected Time Complexity: O(n)
Expected Space Complexity: O(n)
Constraints:
1 <= n <= 105
1 <= price[i] <= 105
 * */





class Demo{
	
	static int TwoStock(int arr[]){
		
		int n=arr.length;

		int result[]=new int[n];

		int max=arr[n-1];
		// fint max from right to left ans comapre result[i-1] and max-arr[i] which is max
		for(int i=n-2;i>=0;i--){
			
			if(arr[i]>max){
				max=arr[i];
			}

			result[i]=Math.max(result[i+1] , (max-arr[i]));
		}

		int min=arr[0];
		// Find the min form left to right ans compare the result[i-1] ans result[i]+(arr[i]-min);
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]<min){
				min=arr[i];
			}

			result[i]=Math.max(result[i-1] , (result[i] + (arr[i]-min) ));
		}

		return result[n-1];
	}

	public static void main(String args[]) {

		int arr[]=new int[]{2,30,15,10,8,25,80};

		int ans=TwoStock(arr);
		System.out.println(ans);
	}
}























