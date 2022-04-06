//Name: Fontem Ivan

package assignments;
import java.util.Scanner;


public class NightClub {
	
	static String userFirstName, userLastName, userGender,heading = "Night Club Visa Status";
	static int userAge,userFee;
	static Scanner scanner = new Scanner(System.in);
	
	
	
	
	
public static void userInfo() {
	
	System.out.println("What is your first name?");// ask for the first name
	
	userFirstName = scanner.nextLine().toUpperCase();// save the first name in userFirstName variable

	System.out.println("What is your Last name?");// ask for the Last name
	
	userLastName = scanner.nextLine().toUpperCase();// save the Second name in userFirstName variable
	
	System.out.println("Are you Male/Female/or other");// ask the gender and note other genders as we will charge them more
	
	userGender= scanner.nextLine().toUpperCase(); // save gender in gender variable
	
	System.out.println("How old are you"); // ask for the age which will be a barrier later on
	
	userAge= scanner.nextInt(); // save the age in a variable
	
	
	

	
}

public static void userVisa() {
	
	while (userAge<=20) {// anyone less than 21 has to be screened out
		
		//System.out.println("Hello "+userFirstName+" "+userLastName);
		//System.out.println("You are less than 21 and can't have access to the night Club ticket!");
		userFee = 0; // assign a userfee of 0 so as to use it as a screening fee value 
		break;
			
	}
	while(userAge>=21 ) {// only people greater than 20 can access the club
		
		if (userGender.charAt(0)=='F') { // females or feminine pays 15 so we catch the first character in the string
			
			userFee = 15;
		}else if (userGender.charAt(0)=='M') {//males pay 20 and we catch the first character in masculine or male
			
			userFee = 20;
		} else   {
			
			userFee = 30; // any other gender is considered rich per my personal norms
		}
		break;
	}
}

public static void userVisaDisplay() {
	System.out.println();
	
	System.out.println("*********** "+heading+" ***********");
	
	
	System.out.println("Name:........"+userFirstName+" "+userLastName);
	
	if (userFee ==0) {// those less than 21 have a fee of zero and hence screened out of the club 
		
		
		System.out.println("Unfortunately, you are less than 21 and can't have access to the night Club ticket!");
		System.out.println("Access Denied!");
		
		
		
	}else {// those above 21 are accepted
		
		System.out.println("Age:........"+userAge);
		System.out.println("Gender:....."+userGender);
		System.out.println("Club Fee:..."+userFee);
		System.out.println("Access Granted!");
		
		
		
		
		
		
		
		
	}
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userInfo();
		userVisa();
		userVisaDisplay();

	}

}
