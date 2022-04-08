package projectApril07th;

//This class classifies waste into different types according to densities of the waste

import java.util.Scanner; // import the scanner class to take input

public class WasteType {
	static double mass;
	
	static double massOfWaste(double density,double volume) {// determines the mass of waste
		return mass = density*volume;
		
	}
	
	static String partition(double density) {// determine the waste portion that is if it is made up of food waste
		//plastics, metals,glass , textile, paper, or construction waste
		
		if(density >=60 && density<=100) {// 
			return "Plastics Waste";
			
		}else if(density>100 && density<=250) {
			return "Metalic Waste";
			
		}else if(density>250 && density<=500) {
			return "Glass/textile/paper";
			
		}else if(density>500 && density<=700) {
			return "Food Waste";
			
		}else if(density>700 ) {
			return "Construction Waste";
			
		}else if(density>=1 && density<60 ) {
			return "Unsorted Waste";
		}else  {
			return "Undefined";
		}
	
	}
	
	

}
