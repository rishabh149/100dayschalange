class Solution {
    public int findNumbers(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            String s=Integer.toString(nums[i]);
            s=s.trim();
            if(s.length()%2==0)
                sum++;
        }
        return sum;
    }
}
