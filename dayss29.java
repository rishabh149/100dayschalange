/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int hcf(int a ,int b)
    {
        int c=a%b;
        while(c!=0)
        {
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		for(int i=0;i<t;i++)
		{
		    int hcf=0;
		    n=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		        a[j]=sc.nextInt();
		    for(int j=0;j<n;j++)
		    {
		        hcf=hcf(hcf,a[j]);
		    }
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(a[j]/hcf+" ");
		   }
		   System.out.print("\n");
		}
	}
}
