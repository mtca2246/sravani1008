import java.util.Scanner;
class Number8
{
	private int num;
	public void setNum(int num)
	{	this.num=num;  }
	public int getNum()
	{	return this.num;  }
	public boolean CheckPrime()
	{
		if(num==1||num==2)
			return true;
		for(int i=2;i<this.num;i++)
		{
			if(this.num%i==0)
				return false;
		}//for
		return true;
	}//checkprime
}//number8
class Test46
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a no");
		int size=sc.nextInt();
		int[] numList=new int[size];
		int[] numPrime=new int[size];
		System.out.println("Enter "+size+" numbers");
		for(int i=0;i<size;i++)
		{
			numList[i]=sc.nextInt();
		}//for
		Number8 ob1=new Number8();
		for(int i=0;i<size;i++)
		{
		ob1.setNum(numList[i]);
		if(ob1.CheckPrime())
		{
			System.out.println("Prime"+ob1.getNum());
			numPrime[i]=ob1.getNum();
		count++;
		}//if
		else
		{
			numPrime[i]=0;
		}//else
		}//for
	for(int i=0;i<size;i++)
		{
		if(numPrime[i]!=0)
			System.out.print(numPrime[i]!=0);
			System.out.print(numPrime[i]+",");
		}//for
		System.out.println("\n Total number in input array is "+count);
	}//main
}//class
