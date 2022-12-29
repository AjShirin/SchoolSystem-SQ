import java.io.IOException;
import java.sql.*;
import java.util.*;



public class StudentTable {
	static void CreateStudent() throws IOException { 

			// Creating the connection using Oracle DB
			// Note: url syntax is standard, so do grasp
			String url = "jdbc:sqlserver://localhost:1433;databaseName=SchoolMgt;encrypt=true;trustServerCertificate=true";

			// Username and password to access DB
			// Custom initialization
			String user = "sa";
			String pass = "root";
			
			// Creating table  using SQL query
			String sqlCreate =  ("create table Student(Id int primary key,fname VARCHAR(8) not null, lname VARCHAR(8) not null, birthdate date )");
					

			// Connection class object
			Connection con = null;

			// Try block to check for exceptions
			try {

				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				// Registering drivers
				DriverManager.registerDriver(driver);

				// Reference to connection interface
				con = DriverManager.getConnection(url, user, pass);

				// Creating a statement
				Statement st = con.createStatement();


				// Executing query // sqlCreate
				int m = st.executeUpdate(sqlCreate);
				if (m >= 1)
					System.out.println("false" );
				else
					System.out.println("true");

				// Closing the connections
				con.close();
			}

			// Catch block to handle exceptions
			catch (Exception ex) {
				// Display message when exceptions occurs
				System.err.println(ex);
			}
		}
}
