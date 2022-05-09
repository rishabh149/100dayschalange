class Solution {
    public int searchInsert(int[] nums, int target) {
        int i= Arrays.binarySearch(nums,target);
        if(i>-1)
            return i;
        return -1*i-1;
    }
}
