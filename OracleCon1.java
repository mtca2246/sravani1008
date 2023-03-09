import java.sql.*;
class OracleCon1
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
		String s;
		String s1;
		s1="insert into student values(9,'Test65',31)";
		s="insert into student values(7,'Test6',89)";
		ResultSet rs=stmt.executeQuery(s);
		ResultSet rs1=stmt.executeQuery(s1);
		System.out.println("One row Inserted");
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