/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    for(int i = 0; i < N; i++)
		    {
		        int K = sc.nextInt();
		        if(K <= A)
		        {
		          System.out.print(1);
		          A = A - K;
		        }
		        else
		         System.out.print(0);
		    }
		    System.out.println();
		}
	}
}
