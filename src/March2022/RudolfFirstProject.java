package March2022;
import java.util.Scanner;
import java.time.LocalDate;
import java.text.DecimalFormat;
public class RudolfFirstProject {
static double WeightOfApple=5.2,WeightOfOrange=10.2,WeightOfBanana=8.0,WeightOfMeat=9.3,PriceOfApple=0,PriceOfOrange=0,PriceOfBanana=0,PriceOfMeat=0,PriceOfIphone=0,PriceOfWatch=0,
TotalAmountOfApple=0,TotalAmountOfOrange=0,TotalAmountOfBanana=0,TotalAmountOfMeat=0,TotalAmountOfIphone=0,TotalAmountOfWatch=0,TotalAmountOfItems=0;
static int NumOfIphone=2,NumOfWatch=5;
static Scanner MyscannerObj=new Scanner(System.in);
static LocalDate myDateObj = LocalDate.now();
static DecimalFormat Mydecimal = new DecimalFormat("0");

public static void main(String[] args) {
	CustomerInput();
	MyCalculation();
	MyOutPut();
	}
             //Input
public static void CustomerInput() {
System.out.println("Please Enter Amount Of Apple");
PriceOfApple=MyscannerObj.nextDouble();
System.out.println("Please Enter Amount Of Orange");
PriceOfOrange=MyscannerObj.nextDouble();
System.out.println("Please Enter Amount Of Banana");
PriceOfBanana=MyscannerObj.nextDouble();
System.out.println("Please Enter Amount Of Meat");
PriceOfMeat=MyscannerObj.nextDouble();
System.out.println("Please Enter Amount Of Iphone");
PriceOfIphone=MyscannerObj.nextDouble();
System.out.println("Please Enter Amount Of Watch");
PriceOfWatch=MyscannerObj.nextDouble();
}

               //Calculation
public static void MyCalculation() {
TotalAmountOfApple=WeightOfApple*PriceOfApple;
TotalAmountOfOrange=WeightOfOrange*PriceOfOrange;
TotalAmountOfBanana=WeightOfBanana*PriceOfBanana;
TotalAmountOfMeat=WeightOfMeat*PriceOfMeat;
TotalAmountOfIphone=NumOfIphone*PriceOfIphone;
TotalAmountOfWatch=NumOfWatch*PriceOfWatch;
TotalAmountOfItems=TotalAmountOfApple+TotalAmountOfOrange+TotalAmountOfBanana+TotalAmountOfMeat+TotalAmountOfIphone+TotalAmountOfWatch;
	
}
                   //OutPut
public static void MyOutPut() {
System.out.println(".....Rudolf's African Market And Electronics");
System.out.println("Date............................."+myDateObj+"");
System.out.println("Total Amount Of Apple.................$"+TotalAmountOfApple);
System.out.println("Total Amount Of Orange................$"+TotalAmountOfOrange);
System.out.println("Total Amount Of Meat..................$"+TotalAmountOfMeat);
System.out.println("Total Amount Of Iphone................$"+TotalAmountOfIphone);
System.out.println("Total Amount Of Watch.................$"+TotalAmountOfWatch);
System.out.println("Total Amount Of Banana................$"+TotalAmountOfBanana);
System.out.println("Total Amount Of Items.................$"+TotalAmountOfItems);
System.out.println("  Thanks for visiting! Please, come again.");
}

































}
