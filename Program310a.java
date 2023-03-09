import java.util.*;
public class Program310a {
static int smallest_among_three(int a,int b,int c)
	{
	if(a<b&&a<c)
		return a;
	else if(b<a&&b<c)
		return b;
	else if(c<a&&c<b)
       return c;
	return 0;
	}
	public static void main(String[] args)
	{
		int a,b,c;
	System.out.println("Enter the three numbers:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	int max=smallest_among_three(a,b,c);
	System.out.println("The smallest among three numbers is "+max);
}
}

	
