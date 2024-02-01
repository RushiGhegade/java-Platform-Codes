/*
 *Sort Colors / Sort an array of 0s, 1s and 2s
Company: Paytm, Flipkart, Morgan Stanley, Amazon, Microsoft, OYO Rooms,
Samsung, Snapdeal, Hike, MakeMyTrip, Ola Cabs, Walmart, MAQ Software,
Adobe, Yatra.com, SAP Labs, Qualcomm
Platform: Leetcode - 75, GFG
Striver’s and Love Babbar’s DSA sheet.
Description:
Given an array nums with n objects colored red, white, or blue, sort them
in-place so that objects of the same color are adjacent, with the colors in
the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and
blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:
n == nums.length

1 <= n <= 300
nums[i] is either 0, 1, or 2.
 * */


class SortColors {

	 static void sort(int arr[],int start,int mid,int end){

                        int n1=mid-start+1;
                        int n2=end-mid;

                        int arr1[]=new int[n1];
                        int arr2[]=new int[n2];

                        for(int i=0;i<n1;i++){

                                arr1[i]=arr[start+i];
                        }

                        for(int i=0;i<n2;i++){
                                arr2[i]=arr[mid+1+i];
                        }

                        int i=0;
                        int j=0;
                        int k=start;

                        while(i<arr1.length && j<arr2.length){

                                if(arr1[i] < arr2[j]){

                                        arr[k]=arr1[i];
                                        i++;
                                }else{
                                        arr[k]=arr2[j];
					j++;
                                }
                                k++;
                        }

                        while(i<arr1.length){

                                arr[k]=arr1[i];
                                i++;
                                k++;
                        }

                        while(j<arr2.length){

                                arr[k]=arr2[j];

                                j++;
                                k++;
                        }



                }
	
	static void BinarySearch(int arr[],int start,int end){
		
		if(start<end){
			
			int mid=start+(end-start)/2;

			BinarySearch(arr,start,mid);
			BinarySearch(arr,mid+1,end);

			sort(arr,start,mid,end);
		}
	}

	public static void main(String args[])	{
		
		int arr[]=new int[]{2,0,2,1,1,0};

		for(int i=0;i<arr.length;i++){			
			System.out.print(arr[i]+" ");
		}System.out.println();

		int start=0;
		int end=arr.length-1;

		BinarySearch(arr,start,end);
		
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

	}
}



























