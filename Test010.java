import java.util.Scanner;
class Test010
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float P,T,R;
		P=sc.nextFloat();
		T=sc.nextFloat();
		R=sc.nextFloat();
		float SI=(P*T*R)/100;
		System.out.println("Simple Interest="+SI);
	}//main
}//class