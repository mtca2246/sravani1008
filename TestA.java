import java.util.Scanner;
class TestA
{
	public static int sumDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;//sum+=n%10
			n=n/10;
		}//while
		return sum;
	}//sumDigit
	public static void main(String[] args)
	{
		Number ob1=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int temp=sc.nextInt();
		int res=sumDigit(temp);
		System.out.println("Sum of digits of"+temp+"is "+res);
	}//main
}//Test

