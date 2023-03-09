import java.util.Scanner;
class Test011
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double P,R,T;
		p=sc.nextDouble();
		R=sc.nextDouble();
		T=sc.nextDouble();
		double CI=p*(Math.pow((1+R/100)T));
		System.out.println("Compound Interest="+CI);
	}//main
}//claass