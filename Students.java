class Students
{
	int rollno;
	String name;
	float fee;
	Students(int rollno,String name,float fee);
	{
this rollno=rollno;
this name=name;
this fee=fee;
	}//Student()
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}//void display()
}//student
class TestThis2
{
public static void main(String[] args)
	{
Students s1=new Students(111,"ankitha",5000f);
Students s2=new Students(222,"sumith",6000f);
s1.display();
s2.display();
}//main
}//TestThis2