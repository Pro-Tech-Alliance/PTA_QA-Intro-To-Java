package March2022;
import java.util.Scanner; // Import the Scanner class library in your project

public class ElegeantBoutiqueStoreCard {//Class Start
	
	static String LastName,FirstName,State,Gender,Heading;
	static int BirthdayYear,SSN,YearlySalary;
	static double CreditScore=0;
	 
static Scanner scan = new Scanner(System.in);// Create an object of the Scanner class

public static void main(String[] args) {//Start of Main
		CustomersInformation();
		CustomerCreditScoreCalculation();
		CustomerFileOutput();
		
		/**SoftwearPercentageSave softObj = new SoftwearPercentageSave();
		
		double softwear3=0;
		double softwear4=0;

		System.out.println("Please Enter Price of Softwear1");
		softwear3 = Software.	
					 
		System.out.println("Please Enter Price of Softwear2");
		softwear4 = scanObj.
									
		Double Answer1 = softwear3+softwear4;
		System.out.println(Answer1);
		 * */
}//End of Main

public static void CustomersInformation() {//Start of Method 1
	    System.out.println("Please Enter your Last Name");
		LastName=scan.nextLine();
		
		System.out.println("Please Enter your First Name");
		FirstName=scan.nextLine();
			
		System.out.println("Please Enter your State");
		State=scan.nextLine();
		
		System.out.println("Are you a Male or Female");
		Gender=scan.nextLine();
		
		System.out.println("Please Enter the year of your Birthday");
		BirthdayYear=scan.nextInt();
		
		System.out.println("Please Enter SSN");
		SSN=scan.nextInt();
		
		System.out.println("Please Enter Yearly Salary ");
		YearlySalary=scan.nextInt();
		
		System.out.println("Please Enter your Credit Score ");
		CreditScore=scan.nextDouble();
		
}//End of Method 1


public static void CustomerCreditScoreCalculation() {//Start of Method 2
	           
	if(CreditScore>=850) {
		System.out.println("Excellent Score:You are Approve");	
	}else if (CreditScore>=749) {
		System.out.println("Good Score:You are Approve");	
	}else if (CreditScore>=699) {
		System.out.println("Fair Score:Pending for  Review ");	
	}else if (CreditScore>=500) {
		System.out.println ("NOT APPROVE");
	}
}//End Method 2

	
public static void CustomerFileOutput() {//Start of Method 3
	System.out.println("Heading:...............Elegeant Boutique Store Card \n");
	System.out.println("Name:................."+LastName.toUpperCase()+" "+FirstName.toUpperCase());
	System.out.println("State:................"+State.toUpperCase());
	System.out.println("Gender:..............."+Gender.toUpperCase());
	System.out.println("BirthdayYear:........."+BirthdayYear);
	System.out.println("SSN:.................."+SSN);
	System.out.println("Yearly Salary:........"+YearlySalary);
    System.out.println("CreditScore:.........."+CreditScore);
			
			
}//End of Method 3
	
}//End of Class
