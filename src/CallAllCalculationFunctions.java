package Practice1;

import java.util.Scanner;

public class CallAllCalculationFunctions {private static final char[] Answer = null;

//Start
	//User should enter their deposit amount and 
	//current bank balance and should get a total displayed 
	
public static void main(String[] args) {
		double depositAmount=0;
		double currentblankBlance=0;
		
Scanner scanner = new Scanner(System.in);//using java instantiation
CreateCalculationFunctions calobj = new CreateCalculationFunctions();
		
		System.out.println("Please enter your deposit amount");
		depositAmount = scanner.nextDouble();
		 
		System.out.println("Please enter your current bank balance");
		currentblankBlance = scanner.nextDouble();
		
		//System.out.println(depositAmount+currentblankBlance);
		 
		
		//double Answer = depositAmount+currentblankBlance;
		    //System.out.println(Answer);
		 
		
		 //double answer = CreateCalculationFunctions.moneyAddition(depositAmount,currentblankBlance);
		// System.out.println("current balance is $"+answer);
		 
		 //double answer = CreateCalculationFunctions.moneySubstration(depositAmount,currentblankBlance);
		// System.out.println("current balance is $"+Answer);
		 
		 //double answer = CreateCalculationFunctions.moneyDivision(depositAmount,currentblankBlance);
		//System.out.println("current balance is $"+answer);
		 
		 double answer = CreateCalculationFunctions.moneyMulitipication(depositAmount,currentblankBlance);
		 System.out.println("current balance is $"+answer);
	}

}//End
