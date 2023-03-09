import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,rem,arm=0,count=0;
		int t=n;
		while(t>0)
		{
			t=t/10;
			count++;
		}
		while(temp>0)
		{
			rem=temp%10;
			arm=(int)Math.pow(rem,count)+arm;
			temp=temp/10;
		}
		if(n==arm)
		{
			System.out.println("Number is Armstrong");
		}
			else
		{
				System.out.println("Number is not Armstrong");
		}
	}
}
