import java.util.Scanner;
class Tests
{
	static boolean isNumber(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))==false)
{
				return false;
}//if
		}//for
		return true;
	}//isNumber
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		if(isNumber(str))
			System.out.println("Integer");
		else System.out.println("String");
	}//main
}//class