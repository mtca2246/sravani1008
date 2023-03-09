class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}//void run
}//vehicle
class Bike2 extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running safely");
	}//run
}//bike2
	class TestVehicle
	{
		public static void main(String[] args)
		{
			Bike2 obj=new Bike2();
			obj.run();
		}//main
	}//class
