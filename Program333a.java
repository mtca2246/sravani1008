import java.util.Scanner;
public class Program333a
{
static double calculateArea(double b,double h)
{
double temp;
temp=1/2*b*h;
return temp;
}
public static void main(String[] args)
{
double base,height,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter base of right angled triangle");
base=sc.nextDouble();
System.out.println("Enter height of right angled triangle");
height=sc.nextDouble();
area=calculateArea(base,height);
System.out.println("Area of triangle with base"+calculateArea(b,h));
}
}
}
