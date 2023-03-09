class Animal
{
	public void eat(){System.out.println("eating...");}
}
class Dog extends Animal
	{
		void bark(){System.out.println("barking...");}
	}//dog
		class TestInheritance
		{
			public static void main(String[] args)
			{
				Dog d=new Dog();
				d.bark();
				d.eat();
			}//main
		}//class
	