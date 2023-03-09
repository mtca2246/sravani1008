import java.util.Scanner;
public class Program302c
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number:");
int a=sc.nextInt();
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("Number after swapping:"+"a="+a+"b="+b);
}
}