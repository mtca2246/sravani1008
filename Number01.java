import java.util.Scanner;
class Number01
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
	public int reversDigit()
	{
		int sum=0;
		int n=this.n1;
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n=n/10;
		}//while
		return sum;
	}//revrseDigit
}//Number01
class Test5
{
	public static void main(String[] args)
	{
		Number01 ob1=new Number01();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int temp=sc.nextInt();
		ob1.setn1(temp);
		int res=ob1.reversDigit();
		System.out.println("reverse of digits"+ob1.getn1()+"is"+res);
	}//main
}//test
