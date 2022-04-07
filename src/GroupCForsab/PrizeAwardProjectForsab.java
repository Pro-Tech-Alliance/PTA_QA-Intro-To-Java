/**
 * Project Description: Create a PRIZE AWARD program. 
 * Author: Forsab Mbah
 * Date: 7/04/2022
 * */


package GroupCForsab;

import java.util.Scanner;


import AssignmentApril1.ExampleFunction;
import March2022.Student;



public class PrizeAwardProjectForsab {

	static String French,History,Subjects, englishLiterature, lastName,firstName,Nationality, Gender, Grades; 
	static int cumulativeScore=0, Age=0;
	
	
	public static void main(String[] args) {
	
	int cumulativeScore=0,historyScore=0,frenchScore=0,englishLiteraturScore=0;
	
	Scanner scanner = new Scanner(System.in);
	Student studentObject = new Student();
	ExampleFunction exampleFunctionObject = new ExampleFunction();
	
	System.out.println("What is your First Name ?");
	firstName=scanner.nextLine().toUpperCase();
	
	System.out.println("What is your Last Name ?");
	lastName=scanner.nextLine().toUpperCase();

	System.out.println("What is your Gender ?");
	Gender=scanner.nextLine().toUpperCase();
	
	System.out.println("What is your Nationality ?");
	Nationality=scanner.nextLine().toUpperCase();
	
	System.out.println("How old are you ?");
	Age=scanner.nextInt();
	
	System.out.println("Please enter your History score: ");
	historyScore = scanner.nextInt();

	
	System.out.println("Please enter your French score: ");
	 frenchScore= scanner.nextInt();

	 
	System.out.println("Please enter your English Literature score: ");
	 englishLiteraturScore= scanner.nextInt();
	 
	 int TotalScore =  exampleFunctionObject.addThreeNumber(historyScore, frenchScore,englishLiteraturScore );
	 System.out.println(TotalScore);
	 
	 if(TotalScore>=90) {
			Grades="A - 1st PRIZE";
		}else if(TotalScore>=80) {
			Grades="B - 2nd PRIZE";
			}else if(TotalScore>=70) {
				Grades="C - 3rd PRIZE";
			}else {//DEFAULT
				Grades="F - SORRY, NO PRIZE";
			}
	
	 studentObject.studentGrades();
	 studentObject.studentFile();
	 
	 
	}

	
	}
