import java.util.*;
class SecondLargestCount{
	public static int LargestElement(int B[],int n){
		
		int count=0;
		int flarge=Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		for(int num:B){
			if(num>flarge){
				slarge=flarge;
				flarge=num;
			}else if(num>slarge && num<flarge){
				slarge=num;
			}
		}

		//Find count of second largest number in array

		for(int i=0;i<n;i++){
			if(B[i]==slarge){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int B[]={1,2,3,4,4,4,4,4,4,5,5,5};
		int n=B.length;
		System.out.println(LargestElement(B,n));
	}
}