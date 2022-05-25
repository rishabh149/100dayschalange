class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }

        int quotient = 0;
        
        // XOR: return true: (true, false) or (false, true)
        //             false: (true, true) or (flase, false)
        boolean neg = dividend < 0 ^ divisor < 0; 
        
        // Make it to long to avoid abs(Integer.MIN_VALUE) being overflow
        long ldd = Math.abs((long)dividend);
        long ldr = Math.abs((long)divisor);
        
        // bitwise operator(<<):
        //    ex:
        //        3 in binary is 11, when it shift to left 1 position(3 << 1).
        //        It will become 110, which is 11 add 0 at the end.
        //        110 in decimal is 6. So 3 << 1 = 6.
        // ACA       That is 3<<1 = 3*2^1, 3<<2 = 3*2^2, 3<<3 = 3*2^3.....
        //    X << Y = X * 2^Y.
        
        while(ldd >= ldr) {
            int shift = 0;
            while(ldd >= (ldr << shift)) {  
                shift++;
            }
            shift--;
            if (shift < 0) shift = 0;
            ldd = ldd - (ldr << shift);
            quotient = quotient + (1 << shift);
        }
        
        return neg ? -quotient : quotient;
    }
}
