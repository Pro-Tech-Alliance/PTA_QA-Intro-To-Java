package AssignmentsApril1st;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
		double val1,val2;
		
		Scanner scObj = new Scanner(System.in);
		AdditionFunction addObj = new AdditionFunction();
		SubtractionFunction subtractionObj = new SubtractionFunction();
		MultiplicationFunction multObj = new MultiplicationFunction();
		DivisionFunction divObj = new DivisionFunction();
		
		System.out.println("Enter your first value: ");
		val1 = scObj.nextDouble();
		
		System.out.println("Enter your second value: ");
		val2 = scObj.nextDouble();
		
		
		
		System.out.println("The sum gives: "+ addObj.addDoubles(val1, val2));
		
		System.out.println("The subtraction gives: "+ subtractionObj.subtractDoubles(val1, val2));
		
		System.out.println("The multiplication gives: "+ multObj.multiplyDoubles(val1, val2));
		
		System.out.println("The subtraction gives: "+ divObj.divideDoubles(val1, val2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
