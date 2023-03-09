import java.util.Scanner;
public class P
{
	public double x;
	public double y;
	Point()
	{
		x=1;
		y=1;
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
 class Test1
{
	public static void main(String[] args)
	{
		double x1,y1,x2,y2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x coordiates and y coordinates of a point:");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		Point p=new Point(x1,y1);
		res=p.distance_from_origin();
		//Point ob=new Point();
		//res=ob.distance_from_origin();
		System.out.println("distance of point from origin"+res);
		System.out.println("Enter x coordiates and y coordinates of a point:");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		Point q=new Point(x2,y2);
		p.distance_from_origin(q);
System.out.println("distance between points p and q is "+res);
	}//main
}//test