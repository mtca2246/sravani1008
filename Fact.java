import java.util.Scanner;
class Fact
{
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else 
			return n*fact(n-1);
	}//fact
	static int product(int a,int b,int c)
	{
		return a*b*c;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int d=sc.nextInt();
		int f=fact(d);
		int res=product(a,b,c);
		System.out.println("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Factorial of " + d + " is " + f);
		System.out.println("product of the number :" + res);
	}//main
}//factorial