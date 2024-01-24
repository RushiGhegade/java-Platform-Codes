/*
 * Longest Common prefix in a Array
Company: VMWare, Microsoft, Google
Platform: leetcode-14

Description:
Write a function to find the longest common prefix string amongst an array of
strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog", "racecar", "car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/




class Solution{
	
	static String solution(String arr[]){
		
		if(arr.length==0){
			return "";
		}
		
		int minlen=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
			
			int len=arr[i].length();

			if(len < minlen){
				minlen=len;
			}	
		}

		String ans="";

		for(int i=0;i<minlen;i++){
			
			char ch=arr[0].charAt(i);
			int count=0;

			for(int j=0;j<arr.length;j++){
				
				if(arr[j].charAt(i)==ch){
					count++;
				}
			}

			if(count==arr.length){
				ans=ans+ch;			
			}
		}

		if(ans!=null){
			return ans;
		}else{
			return "";
		}
	}

	public static void main(String args[]){


		String arr[]=new String[]{"dog","racecar","car"};

		String str=solution(arr);

		System.out.println(str);
	}		

}






















