package projectApril07th;
/**This class deduces the best treatment to be offered to the waste after it is collected and equally tells the color 
*the color of the bin where the user can deposit the waste before treatment
*/

public class WasteManagement {
	static String treatment;
	
	static String management(String partition) {
		
		if(partition == "Plastics Waste" || partition == "Metallic Waste" || partition == "Glass/textile/paper") {
			
			treatment = "Recycle";
			
		}else if(partition == "Food Waste") {
			
			 treatment = "Composting Plant";
			
		}else  {
			
			 treatment = "Landfill";
		}
		
		return treatment;
	}

}
