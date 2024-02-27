/*
 *
 * Maximum Points You Can Obtain from Cards
Company: Intuit, Cisco, Wipro, Amazon
Platform : leetcode - 1423
Fraz’s DSA sheet
Description:

There are several cards arranged in a row, and each card has an associated
number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You
have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can
obtain.
Example 1:
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the
rightmost card first will maximize your total score. The optimal strategy is to take the
three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:
Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
Example 3:
Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.
Constraints:
1 <= cardPoints.length <= 105
1 <= cardPoints[i] <= 104
1 <= k <= cardPoints.length
 * */



class Demo{
	
	public static void main(String args[])  {
		
		int arr[]=new int[]{9,7,7,9,7,7,9};
		int k=7;

		int rem=arr.length-k;
		int sum=0;
		int allsum=0;
		for(int i=0;i<rem;i++){
			allsum += arr[i];
			sum=sum+arr[i];
		}

		int min=sum;

		for(int i=rem ;i<arr.length;i++){
			allsum +=arr[i];

			sum =sum+arr[i];
			sum=sum-arr[i-rem];

			if(sum<min){
				min=sum;
			}
		}

		System.out.println(allsum-min);

	}
}




