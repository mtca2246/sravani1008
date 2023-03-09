class Rectangle
{
	private double length;
	private double breath;
	public Rectangle()
	{
		length=breath=0.0;
	}
	public Rectangle(double l,double b)
	{
		length=l;
		breath=b;
	}
	public void area()
	{
		System.out.println("Area="+(l*b));
	}
	public void perimeter()
	{
		System.out.println("perimeter="+(2*l*b));
	}
	 class RectangleDemo
	{
		 public static void main(String[] args)
	{
		Rectangle myrectangle=new Rectangle();
		Rectangle myrectangle=new Rectangle(5,10);
		myrectangle.area();
		myrectangle.area();
		myrectangle.perimeter();
		myrectangle.perimeter();
	}
}
} 
	