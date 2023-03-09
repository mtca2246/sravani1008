import java.util.Scanner;
class Number9
{
	private int num;
	public void setNum(int num)
	{ this.num=num; }
	public int getNum()
	{ return this.num; }
	public int CheckLength()
	{
		int n=this.num;
		if(n<0)
			n=-n;
		if(n==0)
			return 1;
		int len=0;
		while(n>0)
		{
			n=n/10;
			len++;
		}
		return len;
	}//checklen
}//number
class Test56
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter a no");
	int temp=sc.nextInt();
	Number9 ob=new Number9();
	ob.setNum(temp);
	System.out.println("\n"+ob.CheckLength());
	}//main
}//class