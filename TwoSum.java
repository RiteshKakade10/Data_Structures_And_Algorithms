class TwoSum{
  public static String TwoSum1(int arr1[],int k)
  {
    for(int i=0;i<arr1.length;i++)
      {
        for(int j=1;j<arr1.length;j++)
          {
            if(arr1[i]+arr1[j]==k)
            {
              System.out.println(i+" "+j);
              return "Yes";
            }
          }
      }
      return "NO";
  }
  public static void main(String args[]){
    int arr1[]={1,-2,-3,-5,4,5,7,8,9};
    int k=3;
    System.out.println(TwoSum1(arr1,k));  
  }
}
