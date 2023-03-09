import java.sql.*;
class OracleCon2
{
	public static void main(String[] args)
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("passed 1");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcab2246","mtcab2246");
		System.out.println("passed 2");
		Statement stmt=con.createStatement();
		System.out.println("passed 3");
		String s;
		s="insert into emp values(5,'anil',50000)";
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		con.close();
		}//try
		catch(Exception e)
		{
			System.out.println(e);
		}//catch
	}//main
}//class