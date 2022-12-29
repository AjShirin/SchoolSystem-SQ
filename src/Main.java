import java.util.Scanner;

public class Main { // Implementing the Serializtion //implements Serializable

	static void menue() {
		System.out.println("***************************");
		System.out.println("Welcome!! Please Select one of the following options :) :");
		System.out.println("1. Create Student Table");
		System.out.println("2. Create Subjects Table");
		System.out.println("3. List Top 10 Students");
		System.out.println("4. List Top 15 Subjects");
		System.out.println("5. List Top 100 Students");
		System.out.println("6. List Top 50 Subjects");
		System.out.println("7. Add fake Student");
		System.out.println("8. Add a fake Subject");
		System.out.println("9. Add a new Student");
		System.out.println("10. Adding a new subject ");
		System.out.println("11. Load 1000000 student in Students Table ");
		System.out.println("12. Load 100000 subjects in Subjects Table");
		System.out.println("13. Exit App");

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
				ShowTop ShowTopVariable = new ShowTop();
				ShowTopVariable.TopTenStudent();
				menue();
				break;

			case 4:
				ShowTop ShowTopVariable2 = new ShowTop();
				ShowTopVariable2.TopfiftteenSubjects();
				menue();

				break;
				
			case 5:
				ShowTop ShowTopVariable3 = new ShowTop();
				ShowTopVariable3.TophundradStudents();
				menue();
				break;

			case 6:
				ShowTop ShowTopVariable4 = new ShowTop();
				ShowTopVariable4.TopfiftySubjects();
				menue();
				break;
				
			case 7:
				break;
				
			case 8:
				break;
				
			case 9:
				break;
				
			case 10:
				break;
				
			case 11:
				ShowTop ShowTopVariable5 = new ShowTop();
				ShowTopVariable5.TopMillionStudent();
				menue();
				
				break;
				
			case 12:
				ShowTop ShowTopVariable6 = new ShowTop();
				ShowTopVariable6.TophundradStudents();
				menue();
		
				break;
			

			case 13:
				System.out.println("Exiting The System Bye See you Again :)!...");
				System.exit(0);

				break;
			}

		} while (true);

	}
}