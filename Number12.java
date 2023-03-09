import java.util.Scanner;
class Number12
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
		Number12 ob=new Number12();
		ob.setNum(temp[i]);
		if(ob.checkprime())
		System.out.println("prime");
			else
			System.out.println("not prime");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int temp[]=new int[10];
		for(int i=0;i<temp.length;i++)
			temp[i]=sc.nextInt();
		for(int j=0;j<temp.length;j++)
		//int temp=sc.nextInt();
	}//main
}//clss