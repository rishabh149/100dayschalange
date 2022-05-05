class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
    int ar[]=Arrays.copyOf(nums1,n);
    for(int i=nums1.length,j=0;i<n;i++,j++)
        ar[i]=nums2[j];
    Arrays.sort(ar);
        if(n%2==0)
        {
            int s=ar[n/2]+ar[n/2-1];
            return 1.0*s/2;
        }
        double b=1.0*ar[n/2];
        return b;
        
    }
}
