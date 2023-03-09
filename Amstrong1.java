import java.util.Scanner;
class Amstrong1
{
	public static void main(String[] args)
	{
		int n=0,i,b;
		int rem,sum=0,count=0;
		System.out.println("Armstrong numbers from 100 to 10000");
		for(i=100;i<=10000;i++)
		n=i;
		while(n>0)
		{
			b=n%10;
		// sum=sum+(b*b*b);
		sum=(int)Math.pow(sum,count)+sum;
		 n=n/10;
		}
		if(sum==n)
		{
			System.out.println(i+" ");
		}
		sum=0;	
	}
}
