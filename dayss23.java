import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int n=sc.nextInt();
		System.out.println("enter position :");
		int p=sc.nextInt();
		System.out.println("getting bit at position is :");
		int bm=1<<p;
		if((bm&n)==0)
		System.out.println("0");
		else
		System.out.println("1");
		System.out.println("setting bit at position is :");
		int sb=bm|n;
		System.out.println(sb);
		System.out.println("after clearing bit :");
		int c= ~bm;
		System.out.println(c&n);
		System.out.println("updating bit to 0 :");
		System.out.println(c&n);
		System.out.println("updating bit to 1 :");
		System.out.println(sb);
	}
}
