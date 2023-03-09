import java.util.Scanner;
class Fractional
{
	public static int fact(int n)
	{
		int res=1;
	while(n!=0)
		{
		res=res*n;
		n--;
	}//else
	}//while
	return res;
}//sum
}//fractinal
class Test4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		res=sum(n);
		System.out.println("Fractional of numbers:"+n+"is"+res);
	}//main
}