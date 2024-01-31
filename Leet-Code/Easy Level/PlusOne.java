/*
 * Plus One
Companies: Microsoft, Google
Platform: LeetCode - 66

Fraz’s SDE sheet.
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
*/



class PluseOne{

	static int[] pluseOne(int arr[]){
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==9){
				count++;
			}
		}

		int len=arr.length;
		if(count==arr.length){
			len=len+1;
		}

		int arr1[]=new int[len];
		
		int carry=0;
		int sum=0;
		int k=0;
		for(int i=arr.length-1;i>=0;i--){


			if(i==arr.length-1){
				 sum=carry+arr[i]+1;
			}else{
				sum=arr[i]+carry;
			}

			if(sum>=10){
				carry=1;
			}else{
				carry=0;
			}

			arr1[arr1.length-1-k]=sum%10;
			k++;

		}
		if(carry==1){
			arr1[0]=carry;
		}

		return arr1;
	}
	public static void main(String args[]){
		int arr[]=new int[]{9};
		//int arr[]=new int[]{9,8,7,6,5,4,3,2,1,0};
		//int arr[]=new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		int arr1[]=pluseOne(arr);

		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}System.out.println();
	}
}






















