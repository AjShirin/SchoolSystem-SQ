import java.io.IOException;

public class ShowTop {
	static void TopTenStudent() throws IOException { 
		String sql = "SELECT * FROM Student ORDERED BY id LIMIT 10";
}
	static void TopfiftteenSubjects() throws IOException { 
		String sql = "SELECT * FROM Subjects ORDERED BY id LIMIT 15";
}
	
	static void TophundradStudents() throws IOException { 
		String sql = "SELECT * FROM Student ORDERED BY id LIMIT 100";
}
	
	static void TopfiftySubjects() throws IOException { 
		String sql = "SELECT * FROM Subjects ORDERED BY id LIMIT 50";
}
		
	
}
