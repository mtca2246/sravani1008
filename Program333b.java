import java.util.Scanner;
public class Program333b
{
static double calculateArea(double b,double h)
{
float half=1/2f;
return(((half)*b)*h);
}
public static void main(String[] args)
{
double b,h;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base:");
b=sc.nextDouble();
System.out.println("Enter the height:");
h=sc.nextDouble();
System.out.println("calculateArea "+calculateArea(b,h));
}
}