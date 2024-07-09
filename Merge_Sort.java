class Merge_Sort{
	public static void PrintArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	} 
	public static void Merge_Sort1(int arr[],int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=si+(ei-si)/2;
		Merge_Sort1(arr,si,mid);//left
		Merge_Sort1(arr,mid+1,ei);//Right
		Merge(arr,si,mid,ei);
	}

	public static void Merge(int arr[],int si,int mid,int ei)
	{
		int temp[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j <= ei)
		{
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;
			}
			else{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}

		//left
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}

		//Right
		while(j<=ei)
		{
			temp[k++]=arr[j++];
		}

		//Assign temp Array Values into the original array

		for(k=0,i=si;k<temp.length;k++,i++)
		{
			arr[i]=temp[k];
		}
	}
	public static void main(String[] args) {
		int arr[]={4,2,3,8,7,9};
		Merge_Sort1(arr,0,arr.length-1);
		PrintArr(arr);
	}
}