import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int d[]=new int[n];
        int ar[]=new int[n];
        int br[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            br[i]=sc.nextInt();
            d[i]=ar[i]+br[i];
        }
        Arrays.sort(d);
        for(int i=0;i<n;i++)
            System.out.print(d[i]+" ");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
