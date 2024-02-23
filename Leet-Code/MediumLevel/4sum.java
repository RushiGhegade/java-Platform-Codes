/*
 *4Sum
Company:Microsoft, Amazon, Deloitte, PayPal, HP Enterprises
Platform : leetcode-18
Fraz’s and Striver’s DSA sheet
Description:
Given an array nums of n integers, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
Constraints:
1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 *
 * */
import java.util.*;
class FourSum{

        //Find TwoSum
        List<List<Integer>> TwoSum(int arr[],long target,int start){

                List<List<Integer>> res=new ArrayList<>();

                if(arr.length-start<2){
                        return res;
                }

                int i=start;
                int j=arr.length-1;

                while(i<j){
                        if(i!=start  && arr[i]==arr[i-1]){
                                i++;
                                continue;

                        }
                        long sum=arr[i]+arr[j];

                        if(sum==target){
                                List<Integer> tsum=new ArrayList<>();
                                tsum.add(arr[i]);
                                tsum.add(arr[j]);
                                res.add(tsum);
                                i++;
                                j--;
                        }else if(sum>target){
                                j--;
                        }else{
                                i++;
                        }
                }

                return res;

        }
        // Find TSum For Target
        List<List<Integer>> TSum(int arr[],int target,int start){

                List<List<Integer>> res=new ArrayList<>();

                if(arr.length-start<3){
                        return res;
                }

                for(int i=start;i<=arr.length-3;i++){
                        if(i!=start  && arr[i]==arr[i-1]){
                                continue;
                        }
                        long val=arr[i];
                        //System.out.println("Value : "+val);
                        long tar=target-val;
                        System.out.println("Two Sum Target"+tar);

                        List<List<Integer>>  TSum = TwoSum(arr,tar,i+1);

                        for(List<Integer> list : TSum){

                                list.add((int)val);

                                res.add(list);
                        }
                }

                System.out.println("Tree Sum Arrray :"+res);


                return res;

        }

        // Find Four Sum For target
        List<List<Integer>> fSum(int arr[],int target){

                List<List<Integer>> res=new ArrayList<>();

                if(arr.length<4){
                        return res;
                }


                for(int i=0;i<=arr.length-4;i++){
                        if(i!=0  && arr[i]==arr[i-1]){
                                continue;
                        }
                        int val=arr[i];

                        int tar=target-val;
                        System.out.println("Three Sum tar"+tar);

                        List<List<Integer>> Tsum=TSum(arr,tar,i+1);

                        for(List<Integer> list : Tsum){

                                list.add(val);
                                res.add(list);
                        }
                }

                return res;
        }

        public static void main(String args[]) {

                int arr[]=new int[]{1000000000,1000000000,1000000000,1000000000};
                int target=-294967296;
                Arrays.sort(arr);

                FourSum obj=new FourSum();
                List<List<Integer>> Fsum= obj.fSum(arr,target);

                System.out.println(Fsum);
        }
}