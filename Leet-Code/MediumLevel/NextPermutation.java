/*
 *Next Permutation
Companies : Infosys, Flipkart, Amazon, Microsoft, FactSet, Hike, MakeMyTrip,
Google, Qualcomm, Salesforce
Platform:leetcode - 31, GFG
Fraz’s, Love Babber’s and Striver’s DSA sheet
Description:
A permutation of an array of integers is an arrangement of its members
into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically
greater permutation of its integer. More formally, if all the permutations of
the array are sorted in one container according to their lexicographical
order, then the next permutation of that array is the permutation that
follows it in the sorted container. If such arrangement is not possible, the
array must be rearranged as the lowest possible order (i.e., sorted in
ascending order).
For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does
not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.
Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 100
 * */
import java.io.*;
import java.util.*;
class NextPermutation{
    public static void main(String args[])throws IOException
    {
        	
		
      
	int arr[]=new int[]{1,2,3,4};
	int n=arr.length;

	List<Integer> list=Solution.nextPermutation( n,  arr);

	for(Integer X : list){
		System.out.print(X+" ");
	}System.out.println();
    }
}

class Solution{

    static void reverse(int arr[],int i,int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        // find first min from last
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }

        // if index i s-1 then not found less it is last permutation hence reverse all
        if(index==-1){
            reverse(arr,0,n-1);

            for(int i=0;i<arr.length;i++){
                al.add(arr[i]);
            }
            return al;
        }

        // index is not -1 then we find next max
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }

        // then reverse from index+1 to n last
        reverse(arr,index+1,n-1);



        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }

        return al;



    }
}
