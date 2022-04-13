// { Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S1 = read.readLine();
            String S2 = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.findTime(S1,S2));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findTime(String S1 , String S2) {
        // code here
          char[] chars = S1.toCharArray();      
        int[] mp = new int[26];
        for(int i=0; i<26; i++)
            mp[chars[i] - 'a'] = i;
        
        int ans = 0, pos = 0;
        char[] charsWord = S2.toCharArray();
        for(int i=0; i<S2.length(); i++) {
            ans += Math.abs(mp[charsWord[i] - 'a'] - pos);
            pos = mp[charsWord[i] - 'a'];
        }
        return ans;
    }
};
