class MyDate
{
	private int day;
	public int month;
	public int year;
	public int get_day()
	{
		return day;
	}//get_day
	public void set_day(int d)
	{
		day=d;
	}//set_day
}//Mydate
class Test
{
public static void main(String[] args)
	{
	MyDate ob1=new MyDate();
	ob1.set_day(2);
	ob1.month=12;
	ob1.year=1984;
	System.out.println(ob1.get_day()+"-"+ob1.month+"-"+ob1.year);
	}//main
}//Test
