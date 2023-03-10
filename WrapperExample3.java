public class WrapperExample3
{
	public static void main(String[] args)
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60;
		char c='a';
		boolean b2=true;
		//Autoboxing 
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		//printing objects
		System.out.println("--- Printing object values ---");
		System.out.println("Byte objects:"+byteobj);
		System.out.println("Short objects:"+shortobj);
		System.out.println("Integer objects:"+intobj);
		System.out.println("Long objects:"+longobj);
		System.out.println("float value:"+floatobj);
		System.out.println("Double objects:"+doubleobj);
		System.out.println("Character objects:"+charobj);
		System.out.println("Boolean objects:"+boolobj);
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		System.out.println("--- Printing Primitive values ---");
		System.out.println("byte value:"+bytevalue);
		System.out.println("short value:"+shortvalue);
		System.out.println("int value:"+intvalue);
		System.out.println("long value:"+longvalue);
		System.out.println("float value:"+floatvalue);
		System.out.println("double value:"+doublevalue);
		System.out.println("char value:"+charvalue);
		System.out.println("boolean value:"+boolvalue);
	}
}