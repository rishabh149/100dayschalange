/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes herew
		try {
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0)
		    {
		        int n=sc.nextInt();
		        int x=sc.nextInt();
		        int a=n/(3*x);
		        System.out.println(a);
		    }
		} catch(Exception e) {
		return ;
		}
	}
}
