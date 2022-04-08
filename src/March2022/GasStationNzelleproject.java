package March2022;
import java.util.Scanner;  // Import the Scanner class

import javax.naming.Name;

public class GasStationNzelleproject {//class start

	static String buyerLastName, buyerFirstName, buyerGender,heading="Nzele Gas station";
	static int buyerAge=0;
	static double gasPrice=0;
	static Scanner scanner = new Scanner(System.in);
    static double seniorsbuyerpays;
	 static double buyerGasprice;

	
	public static void gasbuyersinput() {
	    System.out.println("please enter LastName:");
	    buyerLastName =scanner.nextLine();
	   
	    System.out.println("please enter FristName");
	    buyerFirstName =scanner.nextLine();
	    
	     System.out.println("Are you a male or female");
	    buyerGender =scanner.nextLine();
	   
	    System.out.println("How old are you");
	    buyerAge=scanner.nextInt();
	   
	    System.out.println("What is gasPrice1");
	    gasPrice=scanner.nextDouble(); 
	   
	
	}
	

	
	public static void main(String[] args) {//main method start
		gasbuyersinput();
	    gascalculation();  
	    output(); 
	}
	     public static void gascalculation() {
	    	  
	    	   if(gasPrice>=4.99) {
	    		seniorsbuyerpays=4.99/2;
	    	   }else if (gasPrice>=2.50) {seniorsbuyerpays=2.50/2;
	           }else{gasPrice=2.00;
	    	   seniorsbuyerpays=2.00;}
	       
	    	  }           
	       public static void output() {
	       System.out.println("......."+heading+".....");
	       System.out.println("LastName:.........."+buyerLastName); 
	       System.out.println("FirstName:........."+buyerFirstName);
	       System.out.println("Age................" +buyerAge+ "years old");
	       System.out.println("Gender:............"+buyerGender);
	       System.out.println("Price.............."+seniorsbuyerpays);
	       
	      
	    	  }
	    	   
	   
	       }
	
	
	
	
	
	
	
	
	
	
	

		

	


		
	


