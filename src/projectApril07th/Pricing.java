/**
 * This class handles prices for the collected waste portions per kilogram kg 
 * construction waste and unsorted waste is taken for free while for the others money is paid to the user
 * */

package projectApril07th;



public class Pricing {
	static double price;
	
	static double priceperkg(String partition,double mass) {
		
		if(partition == "Plastics Waste") {// 
			 price = 300 * mass;// 300 is the price per kg of plastic waste
		}else if(partition == "Metallic Waste") {
			price = 200 * mass;// 200 is the price per kg of Metal waste
		}else if(partition == "Glass/textile/paper") {
			price = 50 * mass;// 50 is the price per kg of Glass/textile/paper waste;
		}else if(partition == "Food Waste") {
			price = 400 * mass;// 400 is the price per kg of Food Waste 
		}else
		{
			price = 0 * mass;// construction waste and unsorted waste are free is take for free
			System.out.println("You have unsorted waste, construction waste or wrong density");
		}
		return price;
	}

}
