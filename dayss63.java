/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int lcm =0;
    int f=4,a=6;
    for(int j=f;j<=f*a;j++)
		            {
		                if(j%f==0&&j%a==0)
		                {
		                    lcm=j;
		                    break;
		                }
		            }
		System.out.println("Hello World"+lcm);
	}
}
