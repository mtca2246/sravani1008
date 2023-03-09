public class Triangle33
{
	Point P;
	Point Q;
	Point R;
	public Point getP()
	{
		return this.P;
	}
	public Point getQ()
	{
		return this.Q;
	}
	public Point getR()
	{
		return this.R;
	}
	public Triangle33(Point A,Point B,Point C)
	{
		this.P=new Point(A.x,A.y);
		this.Q=new Point(B.x,B.y);
		this.R=new Point(C.x,C.y);
	}
	public Triangle33(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		this.P=new Point(x1,y1);
		this.Q=new Point(x2,y2);
		this.R=new Point(x3,y3);
	}
	public double Perimeter()
	{
		double peri;
		peri=this.P.distance_from_point(this.Q);
		peri=peri+this.P.distance_from_point(this.R);
		peri=peri+this.Q.distance_from_point(this.R);
		return peri;
	}
	public void Translate(double x_trans,double y_trans)
	{
		this.P.Translate(x_trans,y_trans);
	this.Q.Translate(x_trans,y_trans);
	this.R.Translate(x_trans,y_trans);
	}
	public double Area()
	{
		double peri,Area,S,A,B,C;
		peri=this.Perimeter();
		S=peri/2;
		A=this.P.distance_from_point(this.Q);
		B=this.P.distance_from_point(this.R);
		C=this.Q.distance_from_point(this.R);
		Area=Math.sqrt(S*(S-A)*(S-B)*(S-C));
		return Area;
	}
}
