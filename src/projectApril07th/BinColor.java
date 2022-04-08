package projectApril07th;
/**
 * This class determines the Bin color where the waste is temporary stored before treatment takes places subsequently
 * */

public class BinColor {
	static String bincolor;
	
	static String thrashCanColor(String partition) {
		
		if(partition == "Plastic Waste") {// 
			return bincolor = "Blue Bin";
		}else if(partition == "Metallic Waste") {
			
			return bincolor= "Black Bin";
			
		}else if(partition == "Glass/textile/paper") {
			
			return bincolor= "Yellow Bin";
			
		}else if(partition == "Food Waste") {
			
			return bincolor= "Green Bin";
			
		}else if(partition == "Construction Waste" ) {
			
			return bincolor= "Grey Bin";
			
		}else {
			return bincolor= "Brown Bin";
		}
		
	}

}
