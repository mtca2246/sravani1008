import java.util.Scanner;
class Program333c
{
static double calculateArea(double b,double h)
{
double temp,area;
temp=1.0/2*b*h;
return temp;
}
public static void main(String[] args)
{
double base,height,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the right angle triangle breath");
base=sc.nextDouble();
System.out.println("Enter the righgt angle triangle height");
height=sc.nextDouble();
area=calculateArea(base,height);
System.out.println("Area of the triangle with base" +base+ "height" +height+ "is" +area+ "sq units");
}
}