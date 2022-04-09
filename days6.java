// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        String s="",c="";
        int k=-1;
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            if(B.lastIndexOf(ch)<0&&s.lastIndexOf(ch)<0)
            {
            s+=ch+" ";
            k=1;
            }
        }
        for(int i=0;i<B.length();i++)
        {
            char ch=B.charAt(i);
            if(A.lastIndexOf(ch)<0&&s.lastIndexOf(ch)<0)
            {
            s+=ch+" ";
                k=1;
            }
        }
        if(k==-1)
        return "-1";
        else
        {
        String ar[]=s.split(" ");
        Arrays.sort(ar);
        
        for(int i=0;i<ar.length;i++)
        {
            c+=ar[i];
        }
        }
      return c;
    }
    }
