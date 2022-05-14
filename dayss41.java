import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a="";
		for (int i=0;i<s.length() ; i++)
		{
		    char ch=s.charAt(i);
		    if(a.indexOf(ch)>-1)
		     continue;
		    a+=ch;
		}
		if(a.length()%2==0)
		 System.out.println("CHAT WITH HER!");
		 else
		 System.out.println("IGNORE HIM!");
		
	}
}
