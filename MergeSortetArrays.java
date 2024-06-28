import java.util.*;
class MergeSortetArrays{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int j=0,i=m;j<n;j++)
        {
            nums1[i]=nums2[j];
            i++;
        }   
        Arrays.sort(nums1);
    }
}
//This program contains only logic inside it
//Write Main Class
