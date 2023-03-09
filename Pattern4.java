import java.util.*;
class Pattern4
{
	static void printpatternOneRow(char c,int n)
	{
		for(int i=0;i<=n;i++){System.out.print(c);}
		System.out.print("\n");
	}
	static void printpatternInc(char c,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(c);
		}
	}
	static void printpatternDec(char c,int n)
	{
		for(int i=n;i>0;i--)
		{
			System.out.println(c);

		}
	}
	public static void main(String[] args)
	{
		char c='*';
		int n=10;
	if(n%2==0)
		{
			printpatternInc(n/2,c);
			printpatternDec(n/2,c);
			}
			else
		{
				printpatternInc((int)(n/2),c);
				printpatternDec((n+1)/2,c);
}
	}
}

		
