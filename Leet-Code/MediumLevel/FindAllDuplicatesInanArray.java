/*
 Find All Duplicates in an Array
Company: Amazon, Microsoft, OYO Rooms
Platform: Leetcode - 442
Fraz’s DSA sheet.
Description:
Given an integer array nums of length n where all the integers of nums are in the range
[1, n] and each integer appears once or twice, return an array of all the integers that appears
twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 * */


import java.util.*;
class DuplicatesinanArray{

        // Optimize
        // time  --> O(N)
        // space --> O(1)
        // Hint
        // 1<=arr[i]<=N       N is the length of array hence we subtract 1 from arr[i]-1 we get a index and make -arr[i]
        //                     if index is repeate aitomatically -arr[i] become +arr[i]  is the repeted
        static  List<Integer> DuplicateNum(int arr[]) {

                        List<Integer> list = new ArrayList<>();
                        int index=0;
                        for(int i=0;i<arr.length;i++){

                                if(arr[i]>=0){
                                        index=arr[i]-1;
                                }else{
                                        index=(-arr[i])-1;
                                }

                                arr[index]=-arr[index];

                                if(arr[index] >= 0){

                                        if(arr[i]>=0){
                                                list.add(arr[i]);
                                        }else{
                                                list.add(-arr[i]);
                                        }
                                }
                        }

                        return list;
        }

        // Brute Force
        // time  -->O(N)
        // Space -->O(N)  space in this problem want O(1)
        static List<Integer> duplicateNum(int arr[]){

                HashMap<Integer,Integer> hm=new HashMap<>();   // Space O(N)

                List<Integer> list=new ArrayList<>();

                for(int i=0;i<arr.length;i++){

                        if(hm.containsKey(arr[i]))      {

                                hm.put(arr[i],hm.get(arr[i])+1);
                        }else{
                                hm.put(arr[i],1);
                        }
                }

                for(int i=0;i<arr.length;i++){

                        if(hm.get(arr[i])>1){
                                list.add(arr[i]);
                                hm.put(arr[i],hm.get(arr[i])-1);
                        }
                }

                return list;

        }

        public static void main(String args[]){

                int arr[]=new int[]{10,2,5,10,9,1,1,4,3,7};

                List<Integer> list=DuplicateNum(arr);
                System.out.println(list);
        }
}
