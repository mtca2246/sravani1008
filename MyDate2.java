class MyDate2
{
	private int day;
	private int month;
	private int year;
public int get_day()
{
	return day;
}//get_day
public int get_month()
{
	return month;
}//get_month
public int get_year()
{
	return year;
}//get_year
public void  set_day(int d)
{
	day=d;
}//set_day
public void  set_month(int m)
{
	month=m;
}//set_month
public void  set_year(int y)
{
	year=y;
}//set_year
}//mydate2
class Test
{
	public static void main(String[] args)
	{
		MyDate2 ob=new MyDate2();
		ob.set_day(10);
		ob.set_month(8);
		ob.set_year(2002);
		System.out.println(ob.get_day()+"-"+ob.get_month()+"-"+ob.get_year());
	}//main
}//test
