import java.util.Scanner;
public class Program302f
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
b=(a*b)/(a=b);
System.out.println("Number after swapping:" +a+ " " +b);
}
}