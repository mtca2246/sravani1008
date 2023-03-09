class TestOuter
{
	static int data=30;
	static class Inner
	{
		void msg()
		{
			System.out.println("data is"+data);
		}//msg
	}//inner
	public static void main(String[] args)
	{
		TestOuter.Inner obj=new TestOuter.Inner();
		obj.msg();
	}//main
}//outer
	