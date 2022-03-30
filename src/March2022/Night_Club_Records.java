package March2022;
import java.util.Scanner;
public class Night_Club_Records {// class start

	
	static String LastName, FirstName, Gender, Message="", Caption="PTA NightClub";
	static int Age=0;
	static double Enterprice =0;

	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {// Main Method Start
		CoustmersInformation();
		evaluation();
		output();
				
			}// End of main
	
	public static void CoustmersInformation() {
		System.out.println("Kindly enter your Firest Name");
		FirstName=scanner.nextLine().toUpperCase();
		
		System.out.println("Kindly enter your Last Name");
		LastName=scanner.nextLine().toUpperCase();
		
		
		System.out.println("Kindly enter your Gender");
		Gender=scanner.nextLine().toUpperCase();
		
		System.out.println("Kindly enter your Age");
		Age=scanner.nextInt();
		
		
	
		
	}
	
	public static void evaluation() {
	
		if (Gender.equalsIgnoreCase("Male")) {
			Enterprice=20.0;
		}else if(Gender.equalsIgnoreCase("Female")) {
			Enterprice=15.0;
		}else {
			System.out.println("verify member ID to get their Gender and price");
		}
		
		if (Age>=21) {
			Message="Allow Entry";
		}else {
			Message="Please, you are under Age and not allow here, kindly go Home!";
			
		}
	}
						
			
	public static void output() {
		

		System.out.println("Fist Name:............."+FirstName.toUpperCase());
		System.out.println("Last Name:............."+LastName.toUpperCase());
		System.out.println("Gender:................"+Gender.toUpperCase());
		System.out.println("Age:..................."+Age);
		System.out.println(Message+" Balance Due:$"+Enterprice);
	


	}	
	
	
}// class ends

	
		
	