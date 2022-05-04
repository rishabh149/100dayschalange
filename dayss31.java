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
	    
	     int T=sc.nextInt();
	    while(T-->0){
	       
	        int A=sc.nextInt();
	        int B=sc.nextInt();
	        
	        int count=1;
	        int bob=0;
	        int lim=0;
	        while(lim<=A && bob<=B){
	            lim+=count;
	            count++;
	            if(lim>A){
	            System.out.println("Bob");
	            break;
	            }
	           
	            bob+=count;
	            count++;
	            if(bob>B){
	            System.out.println("Limak");
	            break;
	       
	       
	        
	    }

	}
}
}
}
