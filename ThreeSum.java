class ThreeSum{
    public static boolean ThreeSum1(int nums[])
    {
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        return true;
                    } 
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = { 0, -1, 2, -3, 1 };
        System.out.println(ThreeSum1(nums));
        
    }
}
