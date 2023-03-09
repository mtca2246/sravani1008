class Stars
{
	public static void print_multiple_stars(int i)
	{
		int k=1;
		for(;k<=i;k=k+1)
			System.out.print("*");
	}
	public static void main(String[] args)
	{
		int j=5;
		print_multiple_stars(j);
		System.out.println(" ");
	}
}

