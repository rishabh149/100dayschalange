class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ar[]=new int[n+m];
        int k=0;
        for(int i=0,j=0;i<m;i++,j++)
        {
            if(nums1[i]==0)
                continue;
            ar[j]=nums1[i];
            k++;
        }
        for(int i=m,j=0;i<n+m;i++,j++)
        {
            if(nums2[j]==0)
                continue;
            k++;
            ar[i]=nums2[j];
        }
       Arrays.sort(ar);
        for(int i=0;i<k;i++)
        {
            if(i==0)
               System.out.print("["+ar[i]+",");
            else if(i+1==k)
                System.out.print(ar[i]+"]");
            else
        System.out.print(ar[i]+",");
        }
    }
}
