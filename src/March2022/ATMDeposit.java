package March2022;

import java.util.Scanner;

public class ATMDeposit {
//user should enter their deposit amount and current bank 
	//balance and should get a total displayed
	public static void main(String[] args) {
	
		double depositAmount=0;
		double bankBalance=0;
			//Creating objects of classes
		Calcultion calculationObject = new Calcultion();
		Scanner scanner = new Scanner(System.in);
		Student studentObject = new Student();
		
		System.out.println("Please enter your deposit ammount? ");
		depositAmount = scanner.nextDouble();
		System.out.println("Please enter your current balance ?");
		
		bankBalance =scanner.nextDouble();
		studentObject.studentInfo();
		Student.studentGrades();
		Student.studentFile();
		
		double answer = calculationObject.moneyAddition(depositAmount, bankBalance);
		System.out.println("Current balance is $"+answer);
		
		
		
	}

}
