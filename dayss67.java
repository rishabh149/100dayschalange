class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ar[]=new int[2];
        Arrays.sort(nums);
        int k=-1;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target)
            {
                ar[0]=i;
                k=0;
                break;
            }
        if(k==-1)
        {
            ar[0]=-1;
            ar[1]=-1;
            return ar;
        }
        
        for(int i=nums.length-1;i>-1;i--)
            if(nums[i]==target)
            {
                ar[1]=i;
                k=0;
                break;
            }
        return ar;
    }
}
