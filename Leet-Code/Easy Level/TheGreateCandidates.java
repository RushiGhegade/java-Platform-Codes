/*
Three Great Candidates/ Three Ninja Candidates/
Maximum Product of Three Numbers
Company: Flipkart, Amazon, Snapdeal
Platform: Leetcode- 628, GFG, Coding Ninja
Fraz’s SDE Sheet
Description :
The hiring team aims to find 3 candidates who are great collectively. Each
candidate has his or her ability expressed as an integer. 3 candidates are great
collectively if the product of their abilities is maximum. Given abilities of N candidates in
an array arr[], find the maximum collective ability from the given pool of candidates.
Example 1:
Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}
Output: 1200
Explanation:The multiplication of 10, 6 and 20 is 1200.

Example 2:
Input:
N = 5
Arr[] = {-10, -3, -5, -6, -20}
Output: -90
Explanation:
Multiplication of -3, -5 and -6 is -90.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

class ThreeGreateCan{
	
	static int ans(int arr[]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					int ans=arr[i]*arr[j]*arr[k];
					if(ans>max){
						max=ans;
					}
				}
			}
		}

		return max;
	}
	static int GreateCandidates(int arr[]){
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>=max){
				tmax=smax;
				smax=max;
				max=arr[i];
			}else if(arr[i]>=smax && arr[i]!=max){
				tmax=smax;
				smax=arr[i];
			}else if(arr[i]>=tmax && (arr[i]!=max && arr[i]!=smax))	{
				tmax=arr[i];
			}

			if(arr[i]<=min){
				smin=min;
				min=arr[i];
			}else if(arr[i]<=smin && arr[i]!=min){
				smin=arr[i];
			}
		}


		int ansp=max*max*max;
		int ansn=min*smin*max;
		

		System.out.println(max+" "+smax+ " "+tmax+" "+min+" "+smin+" ");
		
		if(ansp>ansn){
			return ansp;
		}else{
			return ansn;
		}
	}
	public static void main(String args[]){

		int arr[]=new int[]{-100,-98,-1,2,3,4};

		int grtcan=GreateCandidates(arr);

		System.out.println(grtcan);
	}
}
















