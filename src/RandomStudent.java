import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class RandomStudent { // This class is almost done but there is error (I was trying to do it in eclipse 1st)
//	public static void main(String args[]) {
//
////	static void addFakeStudents() throws IOException { 
//	Scanner scanner = new Scanner(System.in);
//	
//		System.out.println("Enter number of students you want to add");
//		int id = scanner.nextInt();
//		
//	
//		for (int i = 0; i <= id; i++) {
//			  System.out.println(i);
//			}
//		

	public static void main(String args[]) {
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int randomNumber2 = rand.nextInt(100);
		int randomNumber1 = rand.nextInt(1000);
		
		
		 
 
		// Create Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students you want to add");
		int id = sc.nextInt();
		
		for (int i = 0; i<=id; i++) {

		System.out.println("Enter first name  of the student ");
		String fname = sc.next();

		System.out.println("Enter Last name  of the student ");
		String Lname = sc.next();
		
		System.out.println("The ID is : " + id );
		System.out.println("The first Name is : " + fname + randomNumber2);
		System.out.println("The Last Name is : " + Lname + randomNumber1);
        System.out.println("The birth date is :" + java.time.LocalDate.now());    

		}
		
//		   public static void main(String[] args) {
//
//		        GregorianCalendar gc = new GregorianCalendar();
//
//		        int year = randBetween(1900, 2021);
//
//		        gc.set(gc.YEAR, year);
//
//		        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
//
//		        gc.set(gc.DAY_OF_YEAR, dayOfYear);
//
//		        System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
//
//		    }
//
//		    public static int randBetween(int start, int end) {
//		        return  start + (int)Math.round(Math.random() * (end - start));
//		    }
//		}
//	
	
		// System.out.println(firstName.concat(lastName));

//		// Generate random integers in range 0 to 999
//		int rand_int1 = rand.nextInt(1000);
//		int rand_int2 = rand.nextInt(1000);
//
//		// Print random integers
//		System.out.println("Random Integers: " + rand_int1);
//		System.out.println("Random Integers: " + rand_int2);
//
//		// Generate Random doubles
//		double rand_dub1 = rand.nextDouble();
//		double rand_dub2 = rand.nextDouble();
//
//		// Print random doubles
//		System.out.println("Random Doubles: " + rand_dub1);
//		System.out.println("Random Doubles: " + rand_dub2);
	}
}
