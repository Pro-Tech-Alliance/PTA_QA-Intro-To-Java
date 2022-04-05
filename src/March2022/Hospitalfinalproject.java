     package March2022;
     import java.util.Scanner;
     public class Hospitalfinalproject {


	
		
	 static String PatientLastName, PatientFirstName, PatientGender,heading="Patients information in a hospital";
	 static double Patmedprices=0,Patienttaxowed=0;
	 static int PatientAge;
	 static Scanner scanner = new Scanner(System.in);//Create an object of the Scanner class
			
			
	 public static void getPatientsInputs(){
	 System.out.println("Please Enter your Last Name");
	 PatientLastName =scanner.nextLine();
				 
	 System.out.println("Please Enter your First Name: ");
	 PatientFirstName =scanner.nextLine();
				
	 

	 System.out.println("Are you a Male/Female/ Others please specify: ");
	 PatientGender =scanner.nextLine();
				
	System.out.println("Please tell us how old you are: ");
	PatientAge =scanner.nextInt();
				
	System.out.println("please tell us the medication prices" );
	Patmedprices =scanner.nextDouble();
			
			}	 
			 
			
			public static void main(String[] args) {//Main method start
				getPatientsInputs();
				Calculation();
				output();

			}//main method end
			
			private static void Calculation() {
				// TODO Auto-generated method stub
				
			}


			public static void taxCalculation() {
				//logical operator AND &&
				//logical operator OR ||
				
				if(Patmedprices >=35000 && Patmedprices <= 50000){
					Patienttaxowed=Patmedprices * 0.1;			
				}else if(Patmedprices >= 50000) {
					Patienttaxowed=Patmedprices * 0.24;
				}else {
					Patienttaxowed=Patmedprices * 0.05;
				}
			}
			
			public static void output() {
				System.out.println(heading);
				System.out.println("Name : ................"+PatientFirstName.toUpperCase()+" "+  PatientLastName.toUpperCase());
				System.out.println("Gender: ..............."+PatientGender.toUpperCase());
				System.out.println("Age: .................."+PatientAge+"years old");
				System.out.println("Prices: ...............$"+Patmedprices);
				System.out.println("Tax: ..................$"+Patienttaxowed);
			}
			
			
			
			
			

     

		

	}


