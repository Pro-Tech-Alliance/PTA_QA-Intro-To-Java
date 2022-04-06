    package March2022;
    import java.util.Scanner;  

    public class saphsHospitalFinalProject {
   
    static String PatientfirstName, PatientLastName, PatientAddress, NameOfMedication,NameOfInsurance,PatientGender;
    static int PatientAge;
	static int PriceOfMenMedication,PriceOfWomenMedication;
     
     
     
     static Scanner scan = new Scanner(System.in);
	private static Object Patientgender; 

    public static void PatientInformation() {
    
    	
    System.out.println(" plase what is the Patient firs Name ?");
    PatientfirstName=scan.nextLine();
    
    System.out.println("please what is the Patient Last Name?");
    PatientfirstName=scan.nextLine();
    
    System.out.println("please what is the Patient ASddress?");
    PatientAddress=scan.nextLine();
    
    System.out.println("please what is the name of the medication?");
    NameOfMedication=scan.nextLine();
    
    System.out.println("please what is the name of insurance?");
    NameOfInsurance=scan.nextLine();
    
    System.out.println("please enter your age");
    PatientAge=scan.nextInt();
    
    
    System.out.println("please what is the prices of Menmedication?");
    PriceOfMenMedication=scan.nextInt();
    
    System.out.println("please what is the price of Womenmedication?");
    PriceOfWomenMedication=scan.nextInt();
    
    
    System.out.println("please what is the patient gender?");
    PatientGender=scan.nextLine();
    }
    
    
	public static void PriceOfMedicationCalculation() {
		
    	PriceOfMenMedication=PatientAge*PriceOfMenMedication;
        PriceOfWomenMedication=PatientAge*PriceOfWomenMedication;
    	int TotalPriceOfMedication = PriceOfMenMedication+PriceOfWomenMedication;
    	
    	if(PriceOfMenMedication>=18*7500) {
    	}else if(PriceOfMenMedication >=135000) {
        
    	if(PriceOfWomenMedication>=18*1500) {
    	}else if(PriceOfWomenMedication >=27000) {
    		
    	}else {
    	int TotalPricetOfMedication = 135000+27000;

    	
    	}
    	
    	}
    	  
	 }
	
	
	
     public static void  output() {
     
     System.out.println("Patient First Name........"+PatientLastName);
     System.out.println("Patient last Name........."+PatientLastName);
     System.out.println("Patient Address........"+PatientAddress);
     System.out.println("Name of the mediaction........"+NameOfMedication);
     System.out.println("name of insurance........"+NameOfInsurance);
     System.out.println("Patient Age........"+PatientAge);
     System.out.println("price of Menmedication........"+PriceOfMenMedication);
     System.out.println("price of Womenmedication........"+PriceOfWomenMedication);
     System.out.println("patient gender.............."+Patientgender);
     
     
     }
     
     
  
    }

    
    
    
    
    
    
    

