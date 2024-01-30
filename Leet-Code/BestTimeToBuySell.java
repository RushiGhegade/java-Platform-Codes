/*
 *Best Time to Buy and Sell Stock
Company: Amazon, Google, Flipkart, Microsoft, PayU, Phone Pe, American
Express, Cognizant, Cisco, Dunzo
Platform: Leetcode - 121
Fraz’s, Striver’s and love bubbar’s DSA sheet.
Description:
You are given an array of prices where prices[i] is the price of a given stock
on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you
must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104
 * */




class Profit {

	static int BuyCell ( int arr []) {
			
		int resMax=Integer.MIN_VALUE;

		int max=arr[arr.length-1];

		for(int i=arr.length-1 ; i>=0 ; i--) {

			if(max <= arr[i] ) {
				
				max= arr[i];
			}

			int diff = max-arr[i];

			if(diff >= resMax) {
				
				resMax=diff;
			}
		}

		return resMax;
	}

	public static void main(String args[]) {

   		int arr[]=new int[]{7,6,4,3,1};

		int profit= BuyCell(arr);		
		
		System.out.println(profit);
	}
}






















