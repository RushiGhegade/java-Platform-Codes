/*
 * Left most and right most index
Company: Amazon, Microsoft, Google

Platform: GFG
Description:
Given a sorted array with possibly duplicate elements. The task is to find indexes
of first and last occurrences of an element X in the given array.
Note: If the element is not present in the array return {-1,-1} as pair.
Example 1:
Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation: Index of first occurrence of 5 is 2 and index of last occurrence of 5
is 5.
Example 2:
Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
X = 7
Output:
6 6
Can you solve the problem in expected time complexity?
Expected Time Complexity: O(Log(N))
Expected Auxiliary Space: O(1)
*/




class Index{
	int first;
	int last;

	Index(int first,int last){
		this.first=first;
		this.last=last;
	}

	// Time Complexity -> O(n)
	static Index index(int arr[],int x){       

		int First=-1;
		int Last=-1;
		boolean flag=false;

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==x){
				
				if(flag==false){
					First=i;
					Last=i;
					flag=true;
				}else{
					Last=i;
				}
			}
		}

		return new Index(First,Last);
	}
	// Time Complexity -> O(log(N))         (Binary Search)
	static Index indexX(int arr[],int x){
		
		int First=-1;
		int Last=-1;

		int start=0;
		int end=arr.length-1;

		while(start<=end){
			
			int mid=end-(end-start)/2;

			if(arr[mid]==x){
				First=mid;
			}

			if(arr[mid]<x){
				start=mid+1;;
			}

			if(arr[mid]>=x){
				end=mid-1;
			}
		}

		start=0;
		end=arr.length-1;

		while(start<=end){
			
			int mid=end-(end-start)/2;

			if(arr[mid]==x){
				Last=mid;
			}

			if(arr[mid]>x){
				end=mid-1;
			}

			if(arr[mid]<=x){
				start=mid+1;
			}
		}

		return new Index(First,Last);

	}
	public static void main(String args[]){
		
		int arr[]=new int[]{1, 3, 5, 5, 5, 5, 7, 123, 125};

		int x=0;

		

		Index obj=indexX(arr,x);

		System.out.print(obj.first);
		System.out.println(" "+obj.last);	

		
	}
}





