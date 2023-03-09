import java.util.Scanner;
class Pattern2
	{ 
		public static void main(String[] args)
	{
char a;
int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		a=sc.next().charAt(0);
		System.out.println("Enter the number:");
		b=sc.nextInt();
		for(int i=0;i<b;i++)
		{
			System.out.println();
		}
	}
}
