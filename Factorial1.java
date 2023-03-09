import java.util.Scanner;
class Factorial1
{
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else 
			return n*fact(n-1);
	}//fact
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int f=fact(a);
		System.out.println("Factorial of " + a + " is " + f);
	}//main
}//factorial