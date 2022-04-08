import java.sql.*;
import java.util.*;	
class SelectDemo2
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC104","IPC104");
			System.out.println("Connection Established");
			Scanner s=new Scanner(System.in);
			System.out.println("enter your employee id");
			int empno=s.nextInt();
			Statement sct=con.createStatement();
			String sql="select * from emp where Eid="+empno;
			ResultSet rs=sct.executeQuery(sql);
			boolean result=false;
			while(rs.next())
			
				{
				 System.out.println("you are valid user");
				 System.out.println("hello "+rs.getString(2)+" your age is "+rs.getInt(3));
				 result=true;
				}
			if(result==false)
				System.out.println("invalid user");
			
		     }
				catch(Exception e)
				{
				System.out.println(e);
				}
	}
}
			
