import java.util.Scanner; 
class SearchElements
{
	public static void main(String[] args) 
	{
		int n,x,flag=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements you want in array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}//for
		System.out.println("Enter the elements you want to find:");
		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}//if
			else 
			{
				flag=0;
			}//else
		}//for
			if(flag==1)
			{
				System.out.println("Elements found at position: "+(i+1));
			}//if
			else
			{
				System.out.println("Elements not found");
			}//else
	}//main
}//class