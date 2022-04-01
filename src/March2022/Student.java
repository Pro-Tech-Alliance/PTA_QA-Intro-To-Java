package March2022;
import java.util.Scanner; //Import the Scanner class library in your projec
public class Student {
 
	static String lastName,firstName,course,Nationality;
	static int Age=0;
	static double Score=0;
	static String Grades,Gender;
	 static Scanner scanner = new Scanner(System.in);//Create an object of the Scanner class
	
	public static void main(String[] args) {//MAIN METHOD-BRAIN
		studentInfo();
		studentGrades();
		studentFile();
		

	}
	
	
public static void studentInfo() {
	

	
		System.out.println("What is your First Name ?");
		firstName=scanner.nextLine().toUpperCase();
		
		System.out.println("What is your Last Name ?");
		lastName=scanner.nextLine().toUpperCase();
		
		System.out.println("What Course do you want to take ?");
		course=scanner.nextLine().toUpperCase();
		
		System.out.println("What is your Gender ?");
		Gender=scanner.nextLine().toUpperCase();
		
		System.out.println("What is your Nationality ?");
		Nationality=scanner.nextLine().toUpperCase();
		
		System.out.println("What is your Score ?");
		Score = scanner.nextDouble();
		
		System.out.println("How old are you ?");
		Age=scanner.nextInt();
		
	}
	
	public static void studentGrades() {
	
		if(Score>=90) {
			Grades="A - Excellent";
		}else if(Score>=80) {
			Grades="B - Good";
			}else if(Score>=70) {
				Grades="C - Average";
			}else if(Score>=60) {
				Grades="D - Oooh";
			}else {//DEFAULT
				Grades="F - Banga Man";
			}
		
	}

	public static void studentFile() {
		

	System.out.println("******PRO-TECH ALLIANCE STUDENT RECORD********\n");
		System.out.println("Name:............ "+firstName+" "+lastName);
		System.out.println("Nationality:......"+Nationality);
		System.out.println("Gender:.......... "+Gender);
		System.out.println("Course:.......... "+course);
		System.out.println("Score:........... "+Score);
		System.out.println("Grades:.......... "+Grades);
		System.out.println("Age:............. "+Age+" YEARS OLD");
		
		
	}



}
