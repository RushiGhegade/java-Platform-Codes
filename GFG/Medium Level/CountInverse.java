/*
 *
 *
 * Count Inversion

Company:Google, Amazon, Microsoft,OYO,Adobe, Oracle
Platform: GFG
love babbar DSA sheet
Description:
Given an array of integers. Find the Inversion Count in the array.
Inversion Count: For an array, inversion count indicates how far (or close)
the array is from being sorted. If the array is already sorted then the
inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the
maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Example 1:
Input: N = 5,
arr[] = {2, 4, 1, 3, 5}
Output: 3

Explanation: The sequence 2, 4, 1, 3, 5
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:
Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already
sorted so there is no inversion count.
Example 3:
Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array
are same, so there is no inversion count.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).
Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018
 * */

class Sorting
{
    public static void main (String[] args) 
    {
 	

		long arr[]=new long[]{2, 4, 1, 3, 5};
		
		int n =arr.length;

		
		long count = Solution.inversionCount(arr,n);

		System.out.println(count);
    }
}
class Solution
{
    //Function to count inversions in the array.
    static long sort(long arr[],int start,int mid,int end){
        
        int n1=mid-start+1;
        int n2=end-mid;
        
        long arr1[]=new long[n1];
        long arr2[]=new long[n2];
        
        // for arr1
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[start+i];
        }
        
        // for arr2
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[mid+1+i];
        }
        
        int i=0;
        int j=0;
        int k=start;
        long count=0;
        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
                count=count+(n1-i);
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
        return count;
        
    }
    static long margeSort(long arr[],int start,int end){
        long count=0;
        if(start<end){
            int mid=(start+end)/2;
            
            count =count+margeSort(arr,start,mid);
            count =count+margeSort(arr,mid+1,end);
            
            count =count+sort(arr,start,mid,end);
        }
        return count;
    }
    
    
    static long inversionCount(long arr[], long n)
    {
       
       return margeSort(arr,0,arr.length-1);
       
       
       // TLE
        // Your Code Here
       /* long allcount=0;
        for(int i=0;i<arr.length;i++){
            long count=0;
           
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                    
                }
            }
            allcount=allcount+count;
           
            
        }
        
        return allcount;*/
    }
}
