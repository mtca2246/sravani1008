import java.util.Scanner;
public class Program302e
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number:");
int a=sc.nextInt();
int b=sc.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("Number after swapping:"+"a="+a+"b="+b);
}
}