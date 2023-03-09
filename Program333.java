import java.util.Scanner;
public class Program333
{
static double area_of_a_triangle(double base, double height)
{
return 0.5*base*height;
}
public static void main(String[] args)
{
double base;
double height;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base:");
base=sc.nextDouble();
System.out.println("Enter the height:");
height=sc.nextDouble();
System.out.println("area_of_a_triangle:"+area_of_a_triangle(base,height));
}
}


