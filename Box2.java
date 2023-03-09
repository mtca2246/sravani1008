
class Box2
{
	 private double width;
	 private double height;
	 private double depth;
 public Box2()
{
	width=height=depth=0.0;
}
  public Box2(double w,double h,double d)
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
 class BoxDemo2
{
	public static void main(String[] args)
{
Box2 myBox1=new Box2();
Box2 myBox2=new Box2(10,15,20);
myBox1.volume();
myBox2.volume();
}
}

