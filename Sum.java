import java.util.*;
class  Sum
{
	private int n;
	public void set(int n)
	{

	this.n=n;
	}
	public int get()
	{
		return this.n;
	}
	public int reverse()
	{
		int sum=0;
		int n=this.n;
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		return sum;
	}
	public int digit()
	{
		int sum=0;
		n=this.n;
		while(n>0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
	}
}
class SumDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the digit");
		n=sc.nextInt();
		int[] arr=new int[n];
		int[] sum=new int[n];
		System.out.println("Enter the number:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Sum s=new Sum();
		for(int i=0;i<n;i++)
		{
			s.set(arr[i]);
			int a=s.digit();
			System.out.println("sum of digits of"+a);
		}
	}
}
