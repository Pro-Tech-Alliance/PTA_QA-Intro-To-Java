package Eyambe;

//package EMPLOYEE_INFORMATION;
import java.util.Scanner;

/*
 * AUTHOR : EYAMBE RIGOBERT
 * DATE   : 27/03/2022
 * TIME   : 10:23am
 * */
public class EMPLOYEE_INFORMATION {

	static Scanner sc = new Scanner(System.in); //Creating an instance of the scanner class to get user input
	
	
	static String EmpName,EmpGender,EmpMaritalStatus,EmpDepartment,EmpPosition;
	static int EmpAge = 0;
	static double EmpAnnualSalary = 0, TaxRate = 0, Output = 0;
	
	
	//ENTRY POINT OF THE PROGRAM
	public static void main(String[] args) {
		
		EmployeeInformation();
		
		GetTaxRate();
		
		Display();
	
	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
	//FUNCTION TO GET EMPLOYEE INFORMATION
	
	public static void EmployeeInformation()
	{
		
		System.out.println("Enter employee's name ");
		EmpName = sc.nextLine().toUpperCase();
		
		System.out.println("\nEnter employee's age ");
		EmpAge = sc.nextInt();
		
		sc.nextLine();//used to clear the buffer to get a string variable.
		
		System.out.println("\nEnter employee's gender ");
		EmpGender = sc.nextLine().toUpperCase();
		
		System.out.println("\nEnter employee's marital status ");
		EmpMaritalStatus = sc.nextLine().toUpperCase();
		
		System.out.println("\nEnter employee's department ");
		EmpDepartment = sc.nextLine().toUpperCase();
		
		System.out.println("\nEnter employee's position ");
		EmpPosition = sc.nextLine().toUpperCase();
		
		System.out.println("\nEnter employee's salary ");
		EmpAnnualSalary = sc.nextDouble();
		
	}
	
	//FUNCTION TO CALCULATE THE TAX RATE
	
	public static double CalculateTaxRate(double Rate,double annualSalary)
	{
		
		 Output = ((Rate / 100) * annualSalary);
		
		return Output;
	}
	
	
	//FUNCTION TO GET TAX RATE
	
	public static void GetTaxRate()
	{
		
		if(EmpAnnualSalary <= 60000)
		{
			
			TaxRate = CalculateTaxRate(5, EmpAnnualSalary);
						
		}
		else if(EmpAnnualSalary >= 60000 &&  EmpAnnualSalary <= 100000)
		{
			
			TaxRate = CalculateTaxRate(10,EmpAnnualSalary);
			
		}
		else
		{
			
			TaxRate = CalculateTaxRate(24,EmpAnnualSalary);
			
		}
	}
	
	//FUNCTION TO DISPLAY EMPLOYEE INFORMATION
	
	public static void Display()
	{
		System.out.println("==========--WELCOME TO THE EMPLOYEE TAX RECORD SYSTEM--==========\n");
		
		System.out.println("Name            " + EmpName );
		System.out.println("Age             " + EmpAge );
		System.out.println("Gender          " + EmpGender );
		System.out.println("Marital Status  " + EmpMaritalStatus );
		System.out.println("Department      " + EmpDepartment );
		System.out.println("Position        " + EmpPosition );
		System.out.println("Annual Salary   " + (int)EmpAnnualSalary );
		System.out.println("Tax             " + (int)TaxRate );
	
	}

}
