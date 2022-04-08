package March2022;
import java.util.Scanner; 
public class Ptacarfinalproject {
	
	static String Carname,Carmade,Carcolor,Cartaxe,CarAddress;
	static int CarAge=50;
	static int pricenofCarinfo,priceoFCartaxe;
	private static int Carprice;
	static Scanner scan=new Scanner(System.in);
  
    public static void Carinfo(){
    System.out.println("what is the Carname");
    Carname=scan.nextLine();
    
    System.out.println("what is the Carmade");
    Carmade=scan.nextLine();
    
    System.out.println("what is the Carcolor");
    Carcolor=scan.nextLine();
    
    System.out.println("what is the CarAddres");
    CarAddress=scan.nextLine();
    
    System.out.println("what is the CarAge");
    CarAge=scan.nextInt();
    
    System.out.println("what is the CarPrice");
    Carprice=scan.nextInt();
    
    System.out.println("what is the Cartaxe");
    Cartaxe=scan.nextLine();
          	
  }
    
	private static void CarAge(int i) {
	System.out.println("what is the Carprice");
	Carprice=scan.nextInt();
    if(Carprice>=0 && Carprice <=50) {
    	System.out.println("50");
    	
    }else if (Carprice >=40 && Carprice<=45)
    	System.out.println("45");
    	
    }
		
	public static void main(String[] args) {
	Carinfo();
	
	
	}	   
     public static void output() {
	 System.out.println("Carname...+Carname");
	 System.out.println("Carmade...+Carmade");
	 System.out.println("Carcolor...+Carcolor");
	 System.out.println("Cartaxe...+Cartaxe");
	 System.out.println("Caraddress...+Caraddress");
	 System.out.println("Carage...+Carage");
	 System.out.println("priceoFCarinfo...priceoFCarinfo");
	 System.out.println("priceoFCartaxe...+priceoFCartaxe");
 }
   	   
}
//End of class