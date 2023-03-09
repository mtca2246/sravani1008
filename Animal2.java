class Animal2 {
	void eat(){
		System.out.println("eating...");}
}//animal2
class Dog extends Animal2 {
	void bark() {
	System.out.println("barking..."); }
	}//dog
	class cat extends Animal2 {
		void meow() {
			System.out.println("meowing..."); }
		}//cat
		class Inheritance1 {
			public static void main(String[] args)
			{
				cat c=new cat();
				c.meow();
				c.eat();
				//c.bark();
				Dog d=new Dog();
				d.bark();
				d.eat();
			}//main
		}//class
		