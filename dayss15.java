/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	System.out.println("Patter 1 : solid square");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Patter 2 : solid square boundary");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i==4||j==0||j==4) {
                    System.out.print("* ");
                }
               
                else
                System.out.print("  ");
               
            }
            System.out.println("");
        }
        System.out.println("Patter 3 : solid triangle");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
         System.out.println("Patter 4 : solid invert triangle");
        for (int i = 4; i >-1; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Patter 5 : solid left triangle");
        for (int i = 4; i >-1; i--) {
            for (int j = 0; j <=4; j++) {
                if(j>=i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("Patter 6 : solid triangle");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println("");
        }
        System.out.println("Patter 7 : solid invert triangle");
        for (int i = 4; i >-1; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println("");
        }
        int n=1;
         System.out.println("Patter 8 : solid triangle");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((n)+" ");
                n++;
            }
            System.out.println("");
        }
        n=1;
        System.out.println("Patter 9 : solid triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                n=i+j;
                if(n%2==0)
                System.out.print("1 ");
                else
                 System.out.print("0 ");
                
            }
            System.out.println("");
        }
        System.out.println("Patter 10 : rohmbus");
        for (int i = 4; i >-1; i--) {
            for (int j = 0; j <=4; j++) {
                if(j>=i)
                break;
                else
                System.out.print("  ");
            }
            for(int j=0;j<5;j++)
            System.out.print("@ ");
            System.out.println("");
        }
        System.out.println("Patter 11 : palindrom praymid");
        for (int i = 5; i >0; i--) {
            n=5;
            for (int j = 1; j <=5; j++) {
                if(j>=i)
                System.out.print(n+" ");
                else
                System.out.print("  ");
                n--;
            }
            n=2;
            for(int j=5;j>0;j--)
            {
             if(j>i)
             {
             System.out.print(n+" ");
             n++;
             }
            }
            System.out.println("");
        }
        n=1;
         System.out.println("Patter 12 :non-palindrom praymid");
        for (int i = 5; i >0; i--) {
           
            for (int j = 1; j <=5; j++) {
                if(j>=i)
                System.out.print(n+" ");
                else
                System.out.print("  ");
                
            }
             for(int j=5;j>0;j--)
            {
             if(j>i)
             {
             System.out.print(n+" ");
             }
            }
             System.out.println("");
             n++;
        }
            
	}
}
