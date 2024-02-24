/*
 Best Time to Buy and Sell Stock II
Companies: Amazon, Facebook, Atlassian, OYO, LinkedIn, Infosys, PhonePe, HCL
Platforms: leetcode - 122
Fraz’s DSA sheet
Description:
You are given an integer array of prices where prices[i] is the price of a given stock on
the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one
share of the stock at any time. However, you can buy it and then immediately sell it on
the same day.
Find and return the maximum profit you can achieve.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to profit positively, so we never buy the stock to achieve
the maximum profit of 0.

Constraints:
1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104
 * */




class Demo{
	
	// Using Recursion But it give TLE
	static int find(int index,int buy , int arr[]){
		
		if(index==arr.length-1){
			return 0;
		}

		int profit=0;
		if(buy==1){
			
			int buyStock=(-arr[index]) + find(index+1,0,arr);
		       	int SkipStock = 0 + find(index+1,1,arr);

			profit=Math.max(buyStock,SkipStock);
		}else{
			
			int sellStock=(+arr[index])+find(index+1,1,arr);
			int skipStock=0+find(index+1,0, arr);

			profit=Math.max(sellStock , skipStock);
		}

		return profit;
	}


	// Optimal
	static int FindStock(int arr[]) {
		
		int profit=0;

		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i] < arr[i+1]){
				
				profit = profit+(arr[i+1] - arr[i]);
			}
		}

		return profit;
	}
	public static void main(String args[]) {
		
		int arr[]=new int[]{5,4,3,2,1};

		int n=arr.length;

		// using recursion to find 
		int ans= find(0,1,arr);
		System.out.println(ans);

		// Optimal 
		int ans1=FindStock(arr);
		System.out.println(ans1);

	}
}

























