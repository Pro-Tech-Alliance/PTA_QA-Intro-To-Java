/**
 * This is a solid waste management project where by a user is paid for the waste deposited at a waste management facility
 * Payment depends on the type of waste and the quantity of the waste deposited.
 * The user has to specify the if the waste is Food waste, metallic waste, Glass/textile/paper, plastic or unsorted waste
 * The price per kilogramme of waste is calculated using the pricing class
 * the bin colour where the user deposits the waste before treatment is determined by the waste partion in Bin color class
 * The WasteMangement class determines the type of treatment the waste has to undergo after the user deposits his waste 
 * The WasteType class determines the waste partition according to the density of the waste from weighing but here the user
 * has to specify a density from 60 up to any value
 * */

package projectApril07th;

import java.util.Scanner;

public class WasteDischarge {
	
	

	public static void main(String[] args) {
		
		double density,volume, mass,price;
		String name, address, wasteType, treatment,binColor;
		WasteType wtObj = new WasteType();
		WasteManagement wmObj = new WasteManagement();
		BinColor bcObj = new BinColor();
		Pricing priceObj = new Pricing();
		Scanner scObj = new Scanner(System.in);
		
		System.out.println("Welcome to the waste management page ");
		
		System.out.println("Enter full name:  ");
		name = scObj.nextLine().toUpperCase();
		
		System.out.println("Enter address or location:  ");
		address = scObj.nextLine().toUpperCase();
		
		System.out.println("What is the density of your waste? Note density starts from 60 up:  ");
		
		density = scObj.nextDouble();
		
		System.out.println("What Volume of your waste you brought in? :  ");
		
		volume= scObj.nextDouble();
		
		mass = wtObj.massOfWaste(density, volume);// get the mass of the waste
		
		wasteType = wtObj.partition(density); // get the waste partition to know if it is food waste, construction waste etc
		
		treatment = wmObj.management(wasteType);// get the treatment type required
		
		binColor= bcObj.thrashCanColor(wasteType); // get the bin color to keep the waste temporarily before treatment
		
		price = priceObj.priceperkg(wasteType, mass); // get the amount to be earned by the waste disposer
		
		System.out.println("*******Waste Disposal Personal Information Updates*******");
		System.out.println();
		System.out.println("Name of disposer:..........."+name);
		System.out.println("Address:...................."+address);
		System.out.println("Type of Waste:.............."+wasteType);
		System.out.println("Quantity deposited:.........."+mass);
		System.out.println("Volume deposited:..........."+volume);
		System.out.println("Color of Bin used:.........."+binColor);
		System.out.println("Appropriate treatment:......."+treatment);
		System.out.println("Your earnings:............."+price+"FCFA");
		
		
		
		
		
		
		
		
		///static void userRegister() {
			
			
			
			
			
		//}
		
		
		
		
		
		
		
		
		

	}

}
