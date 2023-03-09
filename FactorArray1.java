import java.util.Scanner;
public class FactorArray1
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter a number :");
		num=sc.nextInt();
		int size=(int)num/2;
		int[] FA=new int[size];
		int i,count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				FA[count]=i;
				//System.out.println(i+" ");
				count=count+1;
			}//if
		}//for
		System.out.print("\n Total factors of "+num +":"+count);
		System.out.println(" ");
		for(int j=0;j<count;j++)
			System.out.print(FA[j]+" ");
	}//main
}//class