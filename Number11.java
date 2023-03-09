import java.util.Scanner;
class Number11
{
	private int num;
	public void setNum(int num)
	{ this.num=num; }
	public int getNum()
	{ return this.num; }
	public boolean checkprime()
	{
		if(this.num==1||this.num==2) 
			return true;
		for(int i=2;i<this.num;i++)
		{
			if(this.num%i==0)
				return false;
		}//for
		return true;
	}//checkpoint
}//number
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int temp=sc.nextInt();
		Number11 ob1=new Number11();
		ob1.setNum(temp);
		if(ob1.checkprime())
		System.out.println("prime");
			else
			System.out.println("not prime");
	}//main
}//clss