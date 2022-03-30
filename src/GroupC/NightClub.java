package GroupC;
import java.util.Scanner;
public class NightClub {
static String Sexe,firstName,lastName;
static String sexe1 ="Men";
static String sexe2 = "women";
static int Age , debitCard=0;
static Scanner scr = new Scanner(System.in);


	public static void main(String[] args) {
		clientInfo();
		clientConditions();

	}
       public static void clientInfo() {
    	   System.out.print("What is your First Name?: ");
    	   firstName = scr.nextLine().toUpperCase();
    	   System.out.print("What is your Last Name?: ");
    	   lastName = scr.nextLine().toUpperCase();
    	   System.out.print("Are you a Men or Women?: ");
    	   Sexe = scr.nextLine().toUpperCase();
    	   System.out.print("How old are you?: ");
    	   Age = scr.nextInt();
    	   System.out.print("How much do you have in your debit card?: ");
    	   debitCard = scr.nextInt();   
    	   
       }
       public static void clientConditions() {
    	 if((((Sexe.equals(sexe1)) && (Age >= 21) && debitCard >= 20) || ((Sexe.equals(sexe2)) && (Age >= 21)) && debitCard >= 15 ) ) {
    	   System.out.println("Name : " +firstName+ " "+lastName);
      	   System.out.println("Gender: "+Sexe );
      	   System.out.println("Age: "+ Age);
   
    	   System.out.println("Welcome in our Night Club !!!!!!!!");
    	 }else {
    	   System.out.println("Name : " +firstName+ " "+lastName);
      	   System.out.println("Gender: "+Sexe );
      	   System.out.println("Age: "+ Age);
      	   
           System.out.println("Access denied!!!!!!");
    		 
    	 }
       
    	  
    	   
    	   
       }
}
