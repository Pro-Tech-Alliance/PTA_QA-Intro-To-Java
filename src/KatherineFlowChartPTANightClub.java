import java.util.Scanner; //Import the Scanner class library in your projec
public class KatherineFlowChartPTANightClub {//START of class

	static String CustomerLastName,CustomerFirstName,Gender,Message="", Heading="PTA NightClub";
	static int Age=0;
	static Double EntryPrice=.0; 
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {//START of main
		CustomerInformationInput();
		calculation();
		output();
		
	}//END of main

	public static void CustomerInformationInput() {
		System.out.println("Please enter your First Name");
		CustomerFirstName= scan.nextLine();
	
		System.out.println("Pleas enter your Last Name");
		CustomerLastName=scan.nextLine();
		
		System.out.println("Pleas enter your gender");
		Gender=scan.nextLine();
	
		
		
		System.out.println("Please enter your age");
		 Age=scan.nextInt();
	
		
	}
	
	public static void calculation() {
		//checking the price
		if(Gender.equalsIgnoreCase("Male")) {
			EntryPrice=20.0;
		}else if(Gender.equalsIgnoreCase("Female")) {
			EntryPrice=15.0;
		}else {
			System.out.println("Check their ID to get their Gender and determine price");
			}
		
		
		//checking the age
		if(Age>=21) {
			Message="Allow";
		}else {
			Message="Not Allow";
		}
	
		
	}
	
	
	public static void output() {
		System.out.println(Heading);
		System.out.println("Fist Name:............."+CustomerFirstName.toUpperCase());
		System.out.println("Last Name:............."+CustomerLastName.toUpperCase());
		System.out.println("Gender:................"+Gender.toUpperCase());
		System.out.println("Age:..................."+Age);
		System.out.println(Message+" Balance Due:$"+EntryPrice);
	}
		
	
	
}//END of class
