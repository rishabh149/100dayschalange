class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        long s=2;
        while(s<n)
            s=s*2;
        if(s==n)
            return true;
        return false;
    }
}
