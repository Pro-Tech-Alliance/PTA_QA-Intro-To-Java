package March2022;

public class MyFuctionAssignment {

public static void main(String[] args) {
	
MyFunctionMethods RudolfFunction=new MyFunctionMethods();

Student Rudolf=new Student();//Just trying something different 
Rudolf.studentInfo();
Rudolf.studentGrades();
Rudolf.studentFile();
System.out.println("End Of Student Class \n");

RudolfFunction.AddingNumberOfGirls(50, 25);
RudolfFunction.SubtractingNumberOfboys(100, 25);
RudolfFunction.MultiplyNumOfCoins(25, 5, 10, 4);


int OutPut1=RudolfFunction.AddingNumberOfGirls(50, 25);
int OutPut2=RudolfFunction.SubtractingNumberOfboys(100, 250);
double OutPut3=RudolfFunction.MultiplyNumOfCoins(25, 5, 10, 4);

System.out.println("My Function Assignment \n");

System.out.println(OutPut1);
System.out.println(OutPut2);
System.out.println(OutPut3);



	}

}
