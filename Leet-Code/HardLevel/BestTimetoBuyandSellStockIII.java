/*
 *Best Time to Buy and Sell Stock III
Company:Microsoft,Directi, Atlassian, Samsung R & D institute, Quikr, American Express,
Myntra, Groww, Paypal,Zomato, Arcesium,PAytm, Goldman Sachs, Salesforce, MobiKwik, D.E.
Shaw,Blackrock, Park+, GoMechanic, MagicPIN,Curefit.
Platform: leetcode -123.
Fraz’s DSA sheet.
Description:
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve. You may complete at most two transactions.
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the
stock before you buy again).
Example 1:
Input: prices = [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
Example 2:
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
engaging multiple transactions at the same time. You must sell before buying again.
Example 3:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 105
 * */


class Demo{
	
	static int findTransaction(int[] arr,int index,int buy,int limit){
		
		if(index==arr.length){
			return 0;
		}

		if(limit==0){
			return 0;
		}

		int profit=0;

		if(buy==1){
			
			int buyStock=-arr[index]+findTransaction(arr,index+1,0,limit);
			int Skip=0+findTransaction(arr,index+1,1,limit);

			profit=Math.max(buyStock,Skip);
		}else{
				
			int sellStock=+arr[index]+findTransaction(arr,index+1,1,limit-1);
			int Skip=0+findTransaction(arr,index+1,0,limit);

			profit=Math.max(sellStock,Skip);
		}

		return profit;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{7,6,4,3,1};
	
		// using Recursion TLE
		/*int limit=2;
		int index=0;
		int buy=1;

		int ans=findTransaction(arr,index,buy,limit);

		System.out.println(ans);*/

		// Optimize Approch Time Complexity --> O(N)
		

		int result[]=new int[arr.length];

		// Fill the result from right to left
		int max=arr[arr.length-1];

		for(int i=arr.length-2;i>=0;i--){
			
			if(max<arr[i]){
				max=arr[i];
			}

			result[i]=Math.max(result[i+1],(max-arr[i]));
		}

		// fill the result Array From Left to right

		int min=arr[0];

		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min){
				min=arr[i];
			}

			result[i]=Math.max(result[i-1],(result[i]+(arr[i]-min)));
		}

		System.out.println(result[arr.length-1]);

	}
}


















