class Box
{
	private double width;
	private double height;
	private double depth;
 Box()
{
	width=height=depth=0.0;
}
  public Box(double w,double h,double d)
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
 public class BoxDemo
 {
	 public static void main(String[] args)
	 {
Box myBox1=new Box();
Box myBox2=new Box(10,15,20);
myBox1.volume();
myBox2.volume();
 }
}

