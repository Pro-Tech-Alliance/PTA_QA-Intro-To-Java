package Practice1;

public class CreateCalculationFunctions {//START
	
public static void main(String[] args) {
		
		System.out.println(moneyaddition(2,3));
		System.out.println(moneySubstration(2,3));
		System.out.println(moneyDivision(6,3));
		System.out.println(moneyMulitipication(2,3));
		}
	
	static double moneyaddition (double value1, double value2){
		return value1+value2;
	}
	static double moneySubstration (double value1, double value2){
		return value1-value2;
	}
	static double moneyDivision (double value1, double value2){
		return value1/value2;
	}
	static double moneyMulitipication (double value1, double value2){
			return value1*value2;
	}
	
}//END
