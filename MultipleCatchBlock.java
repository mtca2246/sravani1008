public class MultipleCatchBlock
{
	public static void main(String[] args)
	{
		try
		{
			int arr[]=new int[5];
			arr[5]=30/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArthmeticException Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
		catch(Exception e)
		{
			System.out.println("paent Exception occurs");
		}
		System.out.println("Rest of the code");
	}
}