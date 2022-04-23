/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		try {
		    int t=sc.nextInt();
		    while(t>0)
		    {
		        int x=sc.nextInt();
		        String s=sc.next();
		        int c=0,d=0,n=0;
		        for(int i=0;i<s.length();i++)
		        {
		            char ch=s.charAt(i);
		            if(ch=='C')
		            c+=2;
		            else if(ch=='D')
		            d+=1;
		            else
		            n+=2;
		        }
		        int tc=c+d;
		        int tn=n+d;
		        if(tc==tn)
		        System.out.println(55*x);
		        else if(tc<tn)
		        System.out.println(40*x);
		        else
		        System.out.println(60*x);
		        t--;
		    }
		} catch(Exception e) {
		return;
		}
	}
}
