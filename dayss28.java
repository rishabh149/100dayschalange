/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T,A,A1,A2,B,B1,B2;
		T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    A=sc.nextInt();
		    B=sc.nextInt();
		    A1=sc.nextInt();
		    B1=sc.nextInt();
		    A2=sc.nextInt();
		    B2=sc.nextInt();
		    
		    if((A==A1&&B==B1)||(A==B1&&B==A1))
		    {
		        System.out.println("1");
		    }
		    else if((A==A2&&B==B2)||(A==B2&&B==A2))
		    {
		        System.out.println("2");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
