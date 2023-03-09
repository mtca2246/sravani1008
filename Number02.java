import java.util.Scanner;
class Number02
{
	private int sum;
	private int product;
	public int get_sum()
	{
		return sum;
	}//get
	public int get_product()
	{
		return product;
	}//get
	public void set_sum(int s)
	{
		sum=s;
	}//set
	public void set_product(int p)
	{
		product=p;
	}//set
	}//Number02
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Number02 n=new Number02();
		n.set_sum(10,20,30);
		n.set_product(10,20,30);
		
		System.out.println("enter the  three number:");
		System.out.println("enter the three product:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	System.out.println("the sum of:"+ n.get_sum);
	System.out.println("the product of:"+n.get_product);
	}//main
}//test

