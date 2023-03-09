import java.util.Scanner;
class Number2
{
	private int n1;
	public void setn1(int n1)
	{
		this.n1=n1;
	}//setn1
	public int getn1()
	{
		return this.n1;
	}//getn1
	public int sumDigit()
	{
		int sum=0;
		int n=this.n1;
		while(n>0)
		{
			sum=sum+n%10;//sum+=num%10
			n=n/10;
		}//while
		return sum;
	}//sumDigit
}//number2
class Test
{
	public static void main(String[] args)
	{
		Number2 ob1=new Number2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int temp=sc.nextInt();
		
		 System.out.println("sum of digits "+temp+"is"+);
	}//main
}//test