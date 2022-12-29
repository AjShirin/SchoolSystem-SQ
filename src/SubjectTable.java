import java.io.IOException;
import java.sql.*;
import java.util.*;



public class SubjectTable {
	static void CreateSubject() throws IOException { 

			// Creating the connection using Oracle DB
			// Note: url syntax is standard, so do grasp
			String url = "jdbc:sqlserver://localhost:1433;databaseName=SchoolMgt;encrypt=true;trustServerCertificate=true";

			// Username and password to access DB
			// Custom initialization
			String user = "sa";
			String pass = "root";
			
			// Creating table  using SQL query
			String sqlCreate =  ("create table Subjects(Id int primary key,title VARCHAR(8) not null, description VARCHAR(250) not null, pricePerStudent DECIMAL )");
					

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
				if (m >= 0)
					System.out.println("true" );
				else
					System.out.println("false");

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
