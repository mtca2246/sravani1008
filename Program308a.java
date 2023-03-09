import java.util.*;
public class Program308a
{
	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("The largest among the three number is"+a);
		else if(b>a&&b>c)
			System.out.println("The largest among the three number is"+b);
		else
			System.out.println("The largest among the three number is"+c);
	}
}