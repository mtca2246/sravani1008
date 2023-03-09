class Box1
{
	private double width;
	private double height;
	private double depth;
 public Box1()
{
	width=height=depth=0.0;
}
  public Box1(double w,double h,double d)
	{
	  width=w;
	  height=h;
	  depth=d;
	}
public void Volume()
{
	System.out.println("volume="+(width*height*depth));
}
}
 class BoxDemo
 {
	 public static void main(String[] args)
	 {
		 Box1 myBox1=new Box1();
		 Box1 myBox2=new Box1(10,15,20);
	 myBox1.volume();
	 myBox2.volume();
 }
}

