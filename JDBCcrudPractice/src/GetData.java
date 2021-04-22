import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class GetData {

	public static String path="jdbc:mysql://localhost/EMPLOYEE_DB";
	public static String username="root";
	public static String password="";
	public static void main(String[] args) {
		
		 Connection conn=null;
		 Statement smt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(path, username, password);
		    smt=conn.createStatement();
		    ResultSet rslt=smt.executeQuery("SELECT * FROM FILE");
		    
		    while(rslt.next())
		    {
		    	System.out.println("ID : "+rslt.getInt(1));
		    	System.out.println("Name :"+rslt.getString(2));
		    	System.out.println("Last Name :"+rslt.getString(3));
		    	System.out.println("Salary :"+rslt.getDouble(4));
		    }
		    
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
