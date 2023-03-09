import java.util.*;
public class Program302a
{
static int isEven(int n)
{
return(n&1);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the numbers:");
{
n=sc.nextInt();
if(isEven(n)==0)
System.out.print("Even\n");
else
System.out.print("Odd\n");
}
}
}