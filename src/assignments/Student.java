
//Name: Fontem Ivan
package assignments;
import java.util.Scanner; // import the scanner class for inputs


public class Student {
	
	static String Studentlastname, Studentfirstname, sex;
	static String Course;
	static String Nationality;
	static int Age=0;
	static char Grade, Gender;
	static double Score=0;
	static Scanner info = new Scanner(System.in); // create the scanner
	
	
	
	
	
	public static void studentinfo() { // create the student info method to collect student info
		
		
		
		System.out.println("What is your first name"); // ask for the student name
		
		
		Studentfirstname = info.nextLine().toUpperCase(); // save the first name in a variable
		
		
		System.out.println("What is your first name");// ask for the second  name
		
		Studentlastname = info.nextLine().toUpperCase();// save the second name in a variable
		
		System.out.println("What is your course name?");// ask for the course name
		
		Course = info.nextLine().toUpperCase();// save the course name in course variable
		
		System.out.println("What is your Nationality?");// ask for the student's nationality
		
		Nationality = info.nextLine().toUpperCase();// save the nationality in the nationality variable variable
		
        System.out.println("What is your Age?");// ask for the Age
		
		Age = info.nextInt();// save the age in age variable
		
		System.out.println("Are you a male or female ( M for male and F for female");// ask for the gender
		
		Gender = info.next().toUpperCase().charAt(0);// Save gender in the gender variable by taking the first character
	    
		if(Gender=='M') {// use conditional statements to convert Char to string to be able to print gender in full
			
			sex = "Male";
		}else if (Gender=='F') {
			
			sex = "Female";
			
		}else {
			sex = "Unknown";
		}
		
		
		
		
		
		
		
		
	}
	
	public static void studentGrades() {// student grade method to process the grades
		
	
		
		
		System.out.println("What was your score out of 100?"); // ask for the score
		
		Score = info.nextDouble(); // save the score in the Score variable
		
		if (Score>=90 && Score <=100) { // use the conditional logic to grade the score
			
			Grade = 'A';
			
			
			
		}else if (Score>=80 && Score <=89.99) {
			Grade = 'B';
			
			
			
		}else if (Score>=70 && Score <=79.99) {
			Grade = 'C';
			
			
		} else if (Score>=60 && Score <=69.99) {
			Grade = 'D';
			
			
		} else if (Score>=50 && Score <=59.99) { 
			
			Grade = 'E';
			
		} else if (Score>=0 && Score <=49.99) { 
			
			Grade = 'F';
			
		}
		
		else {
			Grade ='X';// grade x to signify a wrong score or out of range
			System.out.println("Your score is out of range!");
		}
			
		
		
	}
	
	
	public static void studentFile() {
		System.out.println();
		
		System.out.println("Full Name:..........."+Studentfirstname+ " "+ Studentlastname); // print name
		
		
		System.out.println("Age:................."+Age); // print the age and gender
		
		System.out.println("Nationality:..........."+Nationality);
		
		System.out.println("Gender:................."+sex);
		

		System.out.println("Course:................"+Course); // print the course
		
		System.out.println();// print an empty line to make the screen clear and readable
		
		System.out.println("Grade:................."+Grade); // print the grade at the end of the statements
		
		if (Grade=='A') { // use the conditional logic print remarks on the grade
			
			
			System.out.println("Excellent!");
			
			
		}else if (Grade=='B') {
			
			System.out.println("Very good!");
			
			
		}else if (Grade == 'C') {
			
			System.out.println("Your are Good!");
			
		} else if (Grade == 'D') {
			
			System.out.println("You Passed!");
			
		} else if (Grade == 'E') {
			
			System.out.println("Average!");
			
		}else if (Grade == 'F') {
			
			System.out.println("Fail!");
			
		}else {
			Grade ='X';// grade x to signify a wrong score or out of range
			System.out.println("Unknown!");
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentinfo(); // call the studentinfo() method
		studentGrades(); // call the studentgrades() method
		studentFile();
		
		

	}

}
