class Solution {
    public boolean isHappy(int n) {
        int d=0;
        while(n>0)
        {
            d=d+((n%10)*(n%10));
            
            n/=10;
        }
        if(d<10)
        {
            if(d==1||d==7)
                return true;
            return false;
        }
        return isHappy(d);
    }
}
