import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	 private static String path="jdbc:mysql://localhost/EMPLOYEE_DB";
	 private static String username="root";
	 private static String password="";
	 
	public static void main(String[] args) {
          Connection conn=null;
          
          try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(path, username, password);
			PreparedStatement smt=conn.prepareStatement("insert into file values (?,?,?,?)");
			smt.setInt(1,4 );
			smt.setString(2,"A");
			smt.setString(3,"B");
			smt.setDouble(4, 30000);
			int i=smt.executeUpdate();
			if(i>0)
			{
				System.out.println("Data Inserted Sucessfully!!!");
			}
			else
			{
				System.out.println("Data Not Inserted !!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          

	}

}
