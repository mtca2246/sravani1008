public class JavaExceptionExample2
	{  
  public static void main(String args[])
	  {  
   try
   {  
      int a=50/0;  
   }
   catch(ArithmeticException e)
	   {
	   System.out.println(e);
	   }  
   System.out.println("rest of the code...");  
  }  
} 