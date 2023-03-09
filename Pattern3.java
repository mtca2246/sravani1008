class Pattern3
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
		for(int i=nr;i>0;i--)
		{
			printpatternOneRow(ch,i);
		}
	}
	public static void main(String[] args)
	{
		printpattern(6,'$');
	}
}
