class MyDate3
{
	private int day;
	private int month;
	public int year;
	public int get_day()
	{
		return day;
	}//set_day
	public int get_month()
	{
		return month;
	}//set_month
	public void set_day(int d)
	{
		day=d;
	}//get_day
	public void set_month(int m)
	{
		month=m;
	}//get_month
}//MyDate3
class Test
{
	public static void main(String[] args)
	{
	MyDate3 o=new MyDate3();
	o.set_day(22);
	o.set_month(3);
	o.year=2002;
	System.out.println(o.get_day()+"-"+o.get_day()+"-"+o.year);
}//main
}//test
