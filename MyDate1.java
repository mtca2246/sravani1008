class MyDate1
{
	public int day;
	public int month;
	public int year;
}//mydate
class Test
{
	public static void main(String[] args)
	{
		MyDate1 ob=new MyDate1();
		ob.day=5;
		ob.month=4;
		ob.year=2000;
		System.out.println(ob.day+"-"+ob.month+"-"+ob.year);
	}//main
}//Test
