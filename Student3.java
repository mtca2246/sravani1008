import java.util.Scanner;
class Student3
{
	int rollno;
	String name;
	static String college="ITS";
	Student3(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
		{
		System.out.println(rollno+" "+name+" "+college);
		}
	}
class TestStaticVariable
	{
	public static void main(String[] args)
		{
		 int rollno=r;
		 String name=n;
		Scanner sc=new Scanner();
		r=sc.nextInt();
		n=sc.nextString();
		Student3 s1=new Student3();
		student3 s2=new Student3();
		s1.display();
		s2.display();
		}
	}
	

	
