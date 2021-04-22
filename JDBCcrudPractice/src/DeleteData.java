import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	private static String path="jdbc:mysql://localhost/EMPLOYEE_DB";
	private static String username="root";
	private static String password="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(path, username, password);
			PreparedStatement smt=conn.prepareStatement("delete from FILE where id=?");
			System.out.println("Enter ID to delete:");
			Scanner scan=new Scanner(System.in);
			int id=scan.nextInt();
			smt.setInt(1, id);
			int i=smt.executeUpdate();
			if(i>0)
			{
				System.out.print("Data Deleted Sucessfully!!!");
			}
			else
			{
				System.out.print("Data not Deleted!!!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
