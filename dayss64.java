class Solution {
    public int addDigits(int num) {
        int d=0;
        if(num<10)
            return num;
        else
        {
            while(num>0)
            {
                d+=num%10;
                num/=10;
            }
        }
        if(d>9)
            return addDigits(d);
        return d;
    }
}
