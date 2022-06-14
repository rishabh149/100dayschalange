// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            
            System.out.println(new Solution().findNum(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
     boolean check(int p, int n)
    { 
        int temp = p, count = 0, f = 5;
        while (f <= temp)
        { 
            count += temp/f; 
            f = f*5; 
        } 
        return (count >= n);
    }
    
    int findNum(int n)
    {
        if (n == 1)
        {
            return 5;
        }
        int low = 0; 
        int high = 5*n; 
      
        while (low < high)
        { 
            int mid = (low + high) / 2;
            if (check(mid, n)) 
                high = mid; 
            else
                low = mid+1; 
        } 
        return low;
    }
}
