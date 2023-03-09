import java.util.*;
class Myday
{
	private int day;
	private int month;
	private int year;
	public void set_day(int day)
	{
		this.day=day;
	}//set_day
public void set_month(int month)
	{
	this.month=month;
	}//set_month
	public void set_year(int year)
	{
		this.year=year;
	}//set_year
	public void display()
	{
		System.out.println("Date is:"+day+"-"+month+"-"+year);
	}//display
}//Myday
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Myday m=new Myday();
		System.out.println("Enter the day:");
		m.set_day(sc.nextInt());
		System.out.println("Enter the month:");
		m.set_month(sc.nextInt());
		System.out.println("Enter the year:");
		m.set_year(sc.nextInt());
		m.display();
		
	}//main
}//test

