import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updatedata {

	private static String path="jdbc:mysql://localhost/EMPLOYEE_DB";
	private static String username="root";
	private static String password="";
	public static void main(String[] args) {
		
		Connection Conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Conn=DriverManager.getConnection(path, username, password);
			PreparedStatement smt=Conn.prepareStatement("UPDATE `file` SET `ID`=?,`FIRSTNAME`=?,`LASTNAME`=?,`SALARY`=? WHERE ID=1");
			smt.setInt(1, 1);
			smt.setString(2,"Jack");
			smt.setString(3, "Sparow");
			smt.setDouble(4, 20);
			
			int status=smt.executeUpdate();
			
			if(status>0)
			{
				System.out.print("Data Inserted Sucessfully!!!!");
			}
			else
			{
				System.out.print("Data Not Inserted!!!!");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
