class Animals2a
{
	Animals2a()
	{
		System.out.println("Animal is created");
	}
	class Dog extends Animals2a
	{
		 Dog()
		{
		
			System.out.println("Dog is created");
		}
	}
	class  TestSuper4
	{
		public static void main(String[] args)
		{
			Dog d=new Dog();
			
			
		}
	}
}