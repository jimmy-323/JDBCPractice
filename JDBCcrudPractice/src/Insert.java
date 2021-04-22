import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Insert {

	public static String path="jdbc:mysql://localhost/EMP";
	public static String username="root";
	public static String password="";
	public static void main(String[] args) {
		
		 Connection conn=null;
		 Statement smt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(path, username, password);
		    smt=conn.createStatement();
		    ResultSet rslt=smt.executeQuery("select * from employee");
		    
		    while(rslt.next())
		    {
		    	System.out.println(""+rslt.getString(0));
		    	System.out.println(""+rslt.getString(0));
		    	System.out.println(""+rslt.getString(0));
		    	System.out.println(""+rslt.getString(0));
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
