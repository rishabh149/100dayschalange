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
		try {
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t>0)
		    {
		        int n=sc.nextInt();
		        int ar[]=new int[n];
		        for(int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
		       int br[]=Arrays.copyOfRange(ar,0,n);
		       Arrays.sort(br);
		        if(Arrays.equals(ar,br))
		        System.out.println("YES");
		        else 
		        {
		            
		         /**   outer :
		           for(int i=0;i<n;i++)
		            {
		                for(int j=0;j<n-1;j++)
		               {
		                   if(ar[j]>ar[j+1])
		                   {
		                       int temp=ar[j];
		                       ar[j]=ar[j+1];
		                       ar[j+1]=temp;
		                      
		                       break outer;
		                   }
		  
		               } 
		            }*/
		           
		            for(int j=0;j<n-1;j++)
		            {
		              if(ar[j]>ar[j+1])
		                   {
		                       int temp=ar[j];
		                       ar[j]=ar[j+1];
		                       ar[j+1]=temp;
		                      
		                      // break ;
		                   }   
		            }
		            
		           if(Arrays.equals(ar,br))
		             {
		                 System.out.println("YES");
		             }
		             else
		              {
		                   System.out.println("NO");
		               
		             }
		       }
		        t--;
		    }
		} catch(Exception e) {
		return;
		}
	}
}
