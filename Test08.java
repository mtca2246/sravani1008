import java.util.Scanner;
public class Point
{
	private  double x;
	private  double y;
	public double getX()
	{ return this.X;}
	public double getY()
	{return this.Y;}
	Point()
	{
		x=0;
		y=0;
	}//point
	Point(double x1,double y1)
	{
		x=x1;
		y=y1;
	}//point
	public double distance_from_origin()
	{
		double dist;
		dist=Math.sqrt(x*x+y*y);
		return dist;
	}//public
	public double distance_from_point(Point Q)
	{
		double diff_x = x-Q.x;
		double diff_y = y-Q.y;
		return Math.sqrt(diff_x*diff_x+diff_y*diff_y);
	}//public
	public void Translate(double x_trans,double y_trans)
	{
		x=x+x_trans;
		y=y+y_trans;
	}//translate
}//point
 class Test08
{
	public static void main(String[] args)
	{
		double x1,y1,x2,y2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x coordiates and y coordinates of a point:");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		Point p=new Point(x1,y1);
		System.out.print("Enter x coordiates and y coordinates:");
		ystem.out.println("for translate of the points");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		System.out.print("co-ordinate point is"+p.getX()+","+p.getY());
		System.out.println("After translation");
		p.translate(x2,y2);
	}//main
}//test