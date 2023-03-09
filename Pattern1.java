class Pattern1
{
	static void printpatternOneRow(char ch,int nc)
	{
		for(int i=0;i<nc;i++)
		{
			System.out.print(ch);
		}
		System.out.print("\n");
	}
	static void printpattern(int nr,char ch)
	{
		for(int i=1;i<=nr;i++)
		{
			printpatternOneRow(ch,i);
		}
	}
	public static void main(String[] args)
	{
		printpattern(6,'$');
	}
}