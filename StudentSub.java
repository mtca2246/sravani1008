import java.util.Scanner;
class StudentSub
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=sc.nextInt();
		int rollNo[]=new int[n];
		int s1[]=new int[n];
		int s2[]=new int[n];
		int s3[]=new int[n];
		double total[]=new double[n];
		double avg[]=new double[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter students"+(i+1)+"Details :");
			System.out.println("RollNo:");
				rollNo[i]=sc.nextInt();
			System.out.println("Subject 1 marks:");
			s1[i]=sc.nextInt();
			System.out.println("Subject 2 marks:");
			s2[i]=sc.nextInt();
			System.out.println("Subject 3 marks:");
			s3[i]=sc.nextInt();
			total[i]=(s1[i]+s2[i]+s3[i]);
			avg[i]=total[i]/3.0;
		}//for
		System.out.println("RollNo\t Total\t Average");
		for(int i=0;i<n;i++)
			System.out.println(rollNo[i]+"\t"+total[i]+"\t"+avg[i]);
	}//main
}//class