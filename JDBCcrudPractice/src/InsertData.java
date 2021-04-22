import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

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
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter Id: ");
			int id=scan.nextInt();
			System.out.println("Enter First Name :");
			String name=scan.next();
			System.out.println("Enter Last Name:");
			String last=scan.next();
			System.out.println("Enter Salary:");
			double salary=scan.nextDouble();
			
			smt.setInt(1,id );
			smt.setString(2,name);
			smt.setString(3,last);
			smt.setDouble(4, salary);
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
