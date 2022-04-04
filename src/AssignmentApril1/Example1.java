package AssignmentApril1;

public class Example1 {

	public static void main(String[] args) {
		
		ExampleFunction exampleFunctionObject =new ExampleFunction();
		
	int answer1=exampleFunctionObject.addTwoNumbers(5, 5);
	int answer2 =exampleFunctionObject.addThreeNumber(6, 6,2 );

		
			System.out.println(answer1);
			System.out.println(answer2);
		
		
		AdditionFunction AdditionFunctionObject =new AdditionFunction();
			
		int number1=AdditionFunctionObject.addTwoNumbers(12, 50);
		int number2 =AdditionFunctionObject.addFourNumber(12,22, 6,2 );
		int number3 =AdditionFunctionObject.addFiveNumber(6,12,22, 6,2 );
		int number4 =AdditionFunctionObject.addSixNumber(11,7,4,69,2,76 );
			System.out.println("\n");
			System.out.println(number1);
			System.out.println(number2);
			System.out.println(number3);
			System.out.println(number4);
			
		DivisionFunction DivisionFunctionObject =new DivisionFunction();
		
		int division1 =DivisionFunctionObject.dividTwoNumbers(50,50 );
		int division2 =DivisionFunctionObject.dividFourNumbers(100,3,6,2 );
		int division3 =DivisionFunctionObject.dividFiveNumbers(96,3,12,1,2 );
		int division4 =DivisionFunctionObject.dividSixNumbers(259,7,4,20,2,16 );
			System.out.println("\n");
			System.out.println(division1);
			System.out.println(division2);
			System.out.println(division3);
			System.out.println(division4);
		
		MultiplicationFunction MultiplicationFunctionObject =new MultiplicationFunction();
			
		int multiply1 =MultiplicationFunctionObject.multiplyTwoNumbers(50,50 );
		int multiply2 =MultiplicationFunctionObject.multiplyFourNumbers(100,3,6,2 );
		int multiply3 =MultiplicationFunctionObject.multiplyFiveNumbers(96,3,12,1,2 );
		int multiply4 =MultiplicationFunctionObject.multiplySixNumbers(259,7,4,20,2,16 );
			System.out.println("\n");
			System.out.println(multiply1);
			System.out.println(multiply2);
			System.out.println(multiply3);
			System.out.println(multiply4);
			
			SubtractionFunction SubtractionFunctionObject =new SubtractionFunction();
			
		int sub1 =SubtractionFunctionObject.subTwoNumbers(50,50 );
		int sub2 =SubtractionFunctionObject.subFourNumbers(100,3,6,2 );
		int sub3 =SubtractionFunctionObject.subFiveNumbers(96,3,12,1,2 );
		
			System.out.println("\n");
			System.out.println(sub1);
			System.out.println(sub2);
			System.out.println(sub3);
			
	}

}
