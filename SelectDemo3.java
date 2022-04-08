import java.sql.*;
import java.util.*;	
class SelectDemo3
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC104","IPC104");
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1,5);
			ps.setString(2,"rakesh");
			ps.setInt(3,20);
			ps.setInt(1,6);
			ps.setString(2,"yogi");
			ps.setInt(3,20);
			ps.executeUpdate();
		     }
			catch(Exception e)
				{
					System.out.println(e);
				}
	}
}