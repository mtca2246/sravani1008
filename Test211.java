import java.util.Scanner;
class Test211
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double P,R,T;
		P=sc.nextDouble();
		R=sc.nextDouble();
		T=sc.nextDouble();
		double CI=P*(Math.pow((1+R/100),T));
		System.out.println("Compound Interest="+CI);
	}//main
}//claass