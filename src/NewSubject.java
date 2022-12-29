//
//import java.sql.*;
//import java.util.*;
//
//public class NewSubject {
//	public static void main(String a[]) {
//
//		// Creating the connection using Oracle DB
//		// Note: url syntax is standard, so do grasp
//		String url = "jdbc:sqlserver://localhost:1433;databaseName=SchoolMgt;encrypt=true;trustServerCertificate=true";
//
//		// Username and password to access DB
//		// Custom initialization
//		String user = "sa";
//		String pass = "root";
//
//		// Entering the data
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("enter name");
//		String name = scanner.next();
//
//		System.out.println("enter roll no");
//		Integer roll = scanner.nextInt();
//
//		System.out.println("enter class");
//		String cls = scanner.next();
//
//		// Inserting data using SQL query
//		String sql = "insert into Student values('" + name + "'," + roll + ",'" + cls + "')";
//
//		// Connection class object
//		Connection con = null;
//
//		// Try block to check for exceptions
//		try {
//
//			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//			//DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SocialFamilyTree;integratedSecurity=true;");
//			// Registering drivers
//			DriverManager.registerDriver(driver);
//
//			// Reference to connection interface
//			con = DriverManager.getConnection(url, user, pass);
//
//			// Creating a statement
//			Statement st = con.createStatement();
//
//			// Executing query
//			int m = st.executeUpdate(sql);
//			if (m >= 1)
//				System.out.println("inserted successfully : " + sql);
//			else
//				System.out.println("insertion failed");
//
//			// Closing the connections
//			con.close();
//		}
//
//		// Catch block to handle exceptions
//		catch (Exception ex) {
//			// Display message when exceptions occurs
//			System.err.println(ex);
//		}
//	}
//}
//
