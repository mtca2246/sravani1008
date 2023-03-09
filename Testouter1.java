class TestOuter1
{
	static int data=10;
	static class Inner
	{
		void msg()
		{
			System.out.println("data is"+data);
		}//msg
	}//Inner
	public static void mani(String[] args)
	{
		TestOuter.Inner.msg();
	}//main
}//outer
	