package March2022;
import java.util.Scanner;
public class FinalAssignment {
	
	static String lastName,firstName,course,Nationality;
	static int Age=0;
	static int gpa=0;
	static String Gender;
	static double fees=0,Score=0,Fail=59;
	 static Scanner scanner = new Scanner(System.in);
	
	

	
public static void StudentInfo() {
	System.out.println("What is your First Name ?");
	firstName=scanner.nextLine();
	
	System.out.println("What is your Last Name ?");
	lastName=scanner.nextLine();
	
	
	System.out.println("What Course do you want to take ?");
	course=scanner.nextLine();
	
	System.out.println("What is your Gender ?");
	Gender=scanner.nextLine();
	
	System.out.println("What is your Nationality ?");
	Nationality=scanner.nextLine();
	
	System.out.println("What is your gpa ?");
	gpa = scanner.nextInt();
	
	System.out.println("How old are you ?");
	Age=scanner.nextInt();
	}


public static void Studentgpa() {
	if(Score>=90) {gpa=5;
		
	}
	 else if (Score>=80) {gpa=4;}
	 else if (Score>=70) {gpa=3;}
	 else if (Score>=60) {gpa=2;}
	 else {Score=59+ Fail;}
	
	}
		
			

		public static void studentFile() {
			

			System.out.println("******FinalAssignment********\n");
				System.out.println("Name............ "+firstName);
				System.out.println("Name..............."+lastName);
				System.out.println("Nationality......"+Nationality);
				System.out.println("Gender.......... "+Gender);
				System.out.println("Course.......... "+course);
				System.out.println("Score........... "+gpa);
				System.out.println("Age............. "+Age+" YEARS OLD");
				
				
			}
		
		
		
}
