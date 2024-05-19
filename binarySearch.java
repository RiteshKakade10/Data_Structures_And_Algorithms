import java.util.*;
import java.io.*;
class Binary_Search
{
	public int Binary_Operations(int arr[],int key)
	{
		int n=arr.length;
		int s=0;
		int e=n-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==key)
			{
			 return mid;
			}
			else if(arr[mid]>key)
			{
				e=mid-1;      
			}
			else
			{
				s=mid+1;
			}
		}
		return -1;
	}



	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Key to search:");
		int key=sc.nextInt();
		int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Binary_Search obj1=new Binary_Search();
		System.out.println("Key Found At Index:::"+obj1.Binary_Operations(arr1,key));
	}
}
