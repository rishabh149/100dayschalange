class Solution {
    public int search(int[] nums, int target) {
       //int ar[]=Arrays.copy(nums,nums.length);
        //if(Arrays.binarySearch(ar,target)==-1)
          //  return -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}
