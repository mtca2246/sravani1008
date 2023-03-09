import java.util.*;
class  SumOfEven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//int sumOdd=0;
		int sumEven=0;
		System.out.println("Enter the 10 array elements");
		int Arr[]=new int[10];
		for(int i=0;i<Arr.length;i++)
			Arr[i]=sc.nextInt();
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j]%2==0)
			{
				sumEven=sumEven+Arr[j];
			}//if
			//else
			//{
			//	sumEven=sumEven+Arr[j];
			//}//else
		}//for

		//System.out.println("Sum of Odd numbers:"+sumOdd);
		System.out.println("Sum of Even numbers:"+sumEven);
	}//main
}//class