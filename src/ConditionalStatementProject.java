import java.util.Scanner;

public class ConditionalStatementProject {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entered Age : ");
		
		int age = s.nextInt();
		boolean isTall = true;
		
		if (age >= 18 && isTall) {
			System.out.println("You Are Tall and Have Access to Swim");
			
		}else if (age >= 17 && isTall){
			System.out.println ("You Have Acess but not Qualified. You Need Parent Consent");
			
		}else if (age >= 4){
			System.out.println("You Are a Kid and not invited Here");
		}else {
			System.out.println ("You Are a Baby WTH");
		}

	}

}
