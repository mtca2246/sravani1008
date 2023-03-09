import java.util.Scanner;
class Number333
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}//set
	public long productDigit()
	{
		long res=1;
		int n=this.num;
		while(n>0)
		{
			res=res*(n%10);
			n=n/10;
		}//while
		return res;
	}//productDigit
	public int calculateFactorial()
	{
		int n=this.num;
		int result=1;
		while(n>=0)
		{
			if(n==0)
			{
				result=result*1;
				break;
			}
			else
			{
				result=result*n;
				n=n-1;
			}//else
		}//while
		return result;
	}//calculateFactorial
}//number
class Test5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the non negative integers:");
	int temp=sc.nextInt();
	Number333 ob=new Number333();
	if (temp>=0)
	{
		ob.setNum(temp);
		System.out.println(ob.calculateFactorial());
		System.out.println(ob.productDigit());
	}//if
	else
	{
		System.out.println("INVALID");
	}//else
}//main
	}//Testclass