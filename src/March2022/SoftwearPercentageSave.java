package March2022;
import java.util.Scanner;  // Import the Scanner class

public class SoftwearPercentageSave {

	public static void main(String[] args) {
		
		double softwear1=0;  //500*10/100, save $50
		      
		double softwear2=0;  //1000*10/100, save $100
		
Scanner scanObj = new Scanner(System.in);  // Create a Scanner object Example

System.out.println("Please Enter Price of Softwear1");
softwear1 = scanObj.nextDouble();
				 
System.out.println("Please Enter Price of Softwear2");
softwear2 = scanObj.nextDouble();
		
Double Answer = softwear1+softwear2;
System.out.println(Answer);
				

SoftwearPercentageSave softObj = new SoftwearPercentageSave();  // Create a Scanner object


double softwear3=0;  //500*10/100, save $50
double softwear4=0;  //1000*10/100, save $100
		
Double Answer1 = softwear3+softwear2;
System.out.println(Answer1);
		



				
	}

}
