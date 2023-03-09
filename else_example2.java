import java.util.Scanner;
class else_example2 {
	public static void main(String[] args)
	{
		int i,j,k,min=0;
		i=100;j=79;k=209;
		if(i<j)
		{
			if(i<k)min=i;
			else min=k;
		}
		else
		{
			if(j<k)min=j;
			else min=k;
		}
		System.out.println("min of"+i+","+j+"and"+k+"is"+min);
	}
}