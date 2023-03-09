import java.util.Scanner;
class Factorial
{
	static int fact(int n)
	{
		int res=1;
	while(n!=0)
		{
		res=res*n+n%10;
		n--;
	}//while
	return res;
	}//fact
}//factorial
class Test4
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		 int res=fact(n);
		System.out.println("Factorial of numbers:"+n+"is"+res);
	}//main
}//Test4