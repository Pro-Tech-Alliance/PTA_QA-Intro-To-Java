
import java.util.Scanner;
public class williamProject2022 {
	
	static String DealersFirstName,DealersLastName,DealersAddress,DealersMaritalStatus, Heading= "Walle's Cocoa LLC";
	static int DealersAge,Weight;
	 
	static String DealersGender;
	static double DealersPrice1,DealersPrice2,DealersPrice3;
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void DealersInput(){
		
		
	System.out.println("please what do we call your first name");
	DealersFirstName =scanner.nextLine();	
	
	System.out.println("please what do we call your last name");
	DealersLastName =scanner.nextLine();
	
	System.out.println("please are you married or single");
	DealersMaritalStatus=scanner.nextLine();	
	
	System.out.println("please how old are you");
	DealersAge =scanner.nextInt();
	
	System.out.println("please are you a Male or Female");
	DealersGender =scanner.next();
	
	System.out.println("please where are you located");
	DealersAddress =scanner.next();
	
	System.out.println("please how much do you sell a bag of cocoa");
	DealersPrice1 =scanner.nextDouble();
	
}
	
	public static void DealerPriceCalculation(){
		
		if (DealersPrice1>=75000) {
			Weight=500;
		}else if (DealersPrice2>=50000) {
			Weight=250;
		}else {Weight=100;}
	
		}
	
     public static void DealersOutput(){
    	 
      System.out.println(Heading); 
      System.out.println("Name : ................"+DealersFirstName.toUpperCase()+" "+  DealersLastName.toUpperCase());
      System.out.println("Marital status: ......."+DealersMaritalStatus.toUpperCase()); 
      System.out.println("Gender: ..............."+DealersGender.toUpperCase());
	  System.out.println("Age: .................."+DealersAge+"years old"); 
	  System.out.println("Weight................."+Weight+"kg"); 
	  
   }
     
     public static void main(String[] args) {
		
		DealersInput();
		DealerPriceCalculation();
		DealersOutput();
	}

}
