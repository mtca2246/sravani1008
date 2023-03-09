import java.util.Scanner;
public class Pattern10
{
	static void printPatternOneRow(char ch,int nr)
	{
		for(int i=0;i<=nr;i++)
		{
			System.out.print(ch);
		}
		System.out.print("\n");
	}
	static void printPatternOneColumn(int nc,char ch)
	{
		for(int i=nc;i>0;i--)
	{
		printPatternOneRow(ch,i);
	}
	}
public static void main(String[] args)
{
	char ch;
	int nr,nc;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows");
	nr=sc.next().charAt(0);
	System.out.println("enter the number of columns");
	nc=sc.nextInt();
	printPatternOneColumn(nc,'+');
}
}

	