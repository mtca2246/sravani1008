class MyDate4
{
	public int day;
	private int month;
	public int year;
	public int get_month()
	{
		return month;
	}//get_month
	public void set_month(int m)
	{
		month=m;
	}//set_month
}//MyDate
class Test
{
	public static void main(String[] args)
	{
		MyDate4 o=new MyDate4();
		o.day=25;
		o.set_month(6);
		o.year=2002;
		System.out.println(o.day+"-"+o.get_month()+"-"+o.year);
	}//main
}//test
