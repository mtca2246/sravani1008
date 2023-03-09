import java.util.Scanner;
class Triangle2
{
	public static void main(String[] args)
	{
		float base;
		float height;
		float area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base for right angled triangle");
		base=sc.nextFloat();
		System.out.println("Enter the height for right angled triangle");
		height=sc.nextFloat();
		area=0.5*(base*height);
		System.out.println("Area of a triangle:"+area);
	}
}


