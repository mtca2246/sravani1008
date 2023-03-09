import java.util.Scanner;
class CubeOfArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int cube[]=new int[10];
		System.out.println("Enter the 10 array numbers");
		int Arr[]=new int[10];
		for(int i=0;i<Arr.length;i++)
			Arr[i]=sc.nextInt();
		System.out.println("cube of number:");
		for(int j=0;j<Arr.length;j++)
	{
			cube[j]=Arr[j]*Arr[j]*Arr[j];
			System.out.println(cube[j]);
	}//for
}//main
}//class