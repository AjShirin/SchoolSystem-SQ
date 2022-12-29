import java.io.IOException;
import java.util.Scanner;

public class RandomStudent {
	static void addFakeStudents() throws IOException { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of students you want to add");
		int id = scanner.nextInt();
		
	
		for (int i = 0; i <= id; i++) {
			  System.out.println(i);
			}
}
}
