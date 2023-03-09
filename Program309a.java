import java.util.Scanner;
public class Program309a
{
static void displayDay(int day_no)
{
String s=new String();
switch (day_no)
{
	case 0:s="sunday";break;
	case 1:s="monday";break;
	case 2:s="tuesday";break;
	case 3:s="wednesday";break;
	case 4:s="thursday";break;
	case 5:s="friday";break;
	case 6:s="saturday";break;
		default:s="Incorrect day number";
}
System.out.println("Day is :"+s);
}
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the day numbers(0-6):");
	int day_no=sc.nextInt();
	displayDay(day_no);
	}
}

 