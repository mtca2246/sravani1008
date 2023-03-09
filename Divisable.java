import java.util.*;
class  Divisable
{
	public static void main(String[] args) 
	{
		int div=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int Arr[]=new int[10];
		for(int i=0;i<Arr.length;i++)
			Arr[i]=sc.nextInt();
		for(int j=0;j<Arr.length;j++)
		{
		
		if(Arr[j]%5==0)
		{
			System.out.println(Arr[j]+" is Divisable by 5");
		}//if
		else
		{
			System.out.println(Arr[j]+" is not Divisable by 5");
		}//else
	}//for
	}//mainclass
}//class