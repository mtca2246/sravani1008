import java.util.*;
public class Program207
{
public static void main(String[] args)
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if(ch>=65&&ch<=90)
System.out.println("Upper");
else if(ch>=97&&ch<=122)
System.out.println("Lower");
else if(ch>=48&&ch<=57)
System.out.println("Number");
else
System.out.println("symbol");
}
}