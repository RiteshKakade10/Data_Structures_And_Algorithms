import java.util.*;
class KadanesAlgo
{
	public static int MaxSubArray(int arr1[])
	{
			int cs=0;
			int ms=Integer.MIN_VALUE;
			for(int i=0;i<arr1.length;i++)
			{
				cs+=arr1[i];
				ms=Math.max(ms,cs);
				if(cs<0)
				{
					cs=0;
				}
				
			}
		return ms;
	}
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Maximum Sum Subarray Is:"+MaxSubArray(arr1));
	}
}
