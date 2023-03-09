import java.util.Scanner;
class Number
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
	public int sumDigit()//n=12345
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
}//Number
class Test
{
	public static void main(String[] args)
	{
		Number ob1=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int temp=sc.nextInt();
		ob1.setn1(temp);
		int res=ob1.sumDigit();
		System.out.println("sum of digits of "+ob1.getn1()+"is "+res);
	}//main
}//test

