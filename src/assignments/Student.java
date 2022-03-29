package assignments;
import java.util.Scanner; // import the scanner class for inputs


public class Student {
	
	static String Studentlastname, Studentfirstname, sex;
	static String Course;
	static String Nationality;
	static int Age=0;
	static char Grade, Gender;
	static double Score=0;
	
	
	
	
	
	public static void studentinfo() { // create the student info method to collect student info
		
		Scanner info = new Scanner(System.in); // create the scanner
		
		System.out.println("What is your first name"); // ask for the student name
		
		
		Studentfirstname = info.next(); // save the first name in a variable
		
		
		System.out.println("What is your first name");// ask for the second  name
		
		Studentlastname = info.next();// save the second name in a variable
		
		System.out.println("What is your course name?");// ask for the course name
		
		Course = info.next();// save the course name in course variable
		
		System.out.println("What is your Nationality?");// ask for the student's nationality
		
		Nationality = info.next();// save the nationality in the nationality variable variable
		
        System.out.println("What is your Age?");// ask for the Age
		
		Age = info.nextInt();// save the age in age variable
		
		System.out.println("Are you a male or female ( M for male and F for female");// ask for the gender
		
		Gender = info.next().charAt(0);// Save gender in the gender variable by taking the first character
	    
		if(Gender=='M') {// use conditional statements to convert Char to string to be able to print gender in full
			
			sex = "Male";
		}else if (Gender=='F') {
			
			sex = "Female";
			
		}else {
			sex = "Unknown";
		}
		
		
		
		System.out.println("Welcome to this institution "+Studentfirstname+ " "+ Studentlastname); // print name
		
		
		System.out.println("Your age is  "+Age+ " with nationality as "+Nationality+" Gender is "+ sex); // print the age and gender
		
		System.out.println("You are enrolled in "+Course); // print the course
		
		System.out.println();// print an empty line to make the screen clear and readable
		
		
		
		
	}
	
	public static void studentGrades() {// student grade method to process the grades
		
		Scanner info = new Scanner(System.in); // create the scanner
		
		
		System.out.println("What was your score out of 100?"); // ask for the score
		
		Score = info.nextDouble(); // save the score in the Score variable
		
		if (Score>=50 && Score <=59.99) { // use the conditional logic to grade the score
			
			Grade = 'C';
			System.out.println("Average, keep up!");
			
			
		}else if (Score>=60 && Score <=79.99) {
			Grade = 'B';
			System.out.println("Very good!");
			
			
		}else if (Score>=80 && Score <=100) {
			Grade = 'A';
			System.out.println("Your are excellent!");
			
		} else if (Score>=0 && Score <=49.99) {
			Grade = 'F';
			System.out.println("Your mark is below 50, you failed!");
			
		} else {
			Grade ='X';// grade x to signify a wrong score or out of range
			System.out.println("Your score is out of range!");
		}
			
		System.out.println("Your grade is "+Grade); // print the grade at the end of the statements
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentinfo(); // call the studentinfo() method
		studentGrades(); // call the studentgrades() method
		
		

	}

}
