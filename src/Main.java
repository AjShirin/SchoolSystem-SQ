import java.util.Scanner;

public class Main { // Implementing the Serializtion //implements Serializable

	static void menue() {
		System.out.println("***************************");
		System.out.println("Welcome...Please Select one of the following options:");
		System.out.println("1. Create Student Table");
		System.out.println("2. Create Subjects Table");
		System.out.println("3. List Top 100 Students");
		System.out.println("4. List Top 50 Subjects");
		System.out.println("5. Add a new Student");
		System.out.println("6. Adding a new subject ");
		System.out.println("7. Exit App");

	}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		menue();
		do {

			int Menue = sc.nextInt();
			switch (Menue) {
			case 1:
				StudentTable StudentTableVariable = new StudentTable();
				// StudentTableVariable.finalize();
				StudentTableVariable.CreateStudent();
				menue();
				break;

			case 2:
				SubjectTable SubjectTableVariable = new SubjectTable();
				SubjectTableVariable.CreateSubject();
				menue();
				break;

			case 3:

				break;

			case 4:

				break;
			case 5:

				break;

			case 6:

			case 7:
				System.out.println("Exiting The System Bye See you Again :)!....");
				System.exit(0);

				break;
			}

		} while (true);

	}
}