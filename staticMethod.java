class StaticMethod
{
	static void myStaticMethod()
	{
		System.out.println("static methods can be called without creating object");
	}
	 public void myPublicMethod()
	{
		System.out.println("public method can be called by creating object");
	}
	public static void main(String[] args)
	{
		myStaticMethod();
		StaticMethod myObj=new StaticMethod();
		myObj.myPublicMethod();
		
	}
}

