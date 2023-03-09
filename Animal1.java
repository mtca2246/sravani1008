class Animal1
{
	void eat()
	{
		System.out.println("eating...");}//eat
	}//animal
	class Dog extends Animal1
	{
		void bark()
		{
			System.out.println("barking...");}//bark
		}//dog
		class babydog extends Dog
		{
			void weep()
			{
				System.out.println("weeping..."); }//weep
		}//babydog
		class Inheritance2
		{
			public static void main(String[] args)
			{
				babydog d=new babydog();
				d.weep();
				d.bark();
				d.eat();
			}//main
		}//class