class Solution {
    public String toHex(int num) {
          String a[]={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        String str="";
        int i;
        if(num==0)
            return "0";
        if(num>0)
        {
            while(num>0)
            {
                int k=num%16;
                str=a[k]+str;
                num=num/16;
            }
        }
        else
        {
            long n = num;
        n =  (long)Math.pow(2, 32) + n ;//taking 2's complement
        while (n != 0) {
                int k=(int)(n%16);
                str=a[k]+str;
                n /= 16;
        }
        }
        return str;
    }
}
