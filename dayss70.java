class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if(n==0)
            return false;
        int a=1;
        while(a<n)
        {
            a=a*4;
        }
        if(n==a)
             return true;
        return false;
    }
}
