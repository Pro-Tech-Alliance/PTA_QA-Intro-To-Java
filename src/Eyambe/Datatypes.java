package Eyambe;


/*
 * GROUP C PARTICIPANTS
 * 
 * 1) LAVOISIER BLERIOT
 * 2) EYAMBE RIGOBERT
 * 3) WATRE ZIBI ROBERT MICHAEL
 * 4) FORSAB
 * 
 * */



public class Datatypes {

	 static int Age = 25;//Global integer variable "Age"
	 static	String	Name = "groupe_c";//Global string variable "Name"
	 
	public static void main(String[] args) {
		
		//LOCAL VARIABLES
		String _Name = "Lavoisier Bleriot";
		
		int _Age = 25;
		
		int Age = 15;
		
		int Forsab=Age;
		
		int Result = Age+Forsab;
		
		//BOOLEAN DATATYPE
		boolean isTrue = true;
		

		System.out.println("My Age is" + Result);
		
		
		if(_Name != "" && _Age == 25 && isTrue)
		{
			System.out.println(" HEllo!!!, my name is " + _Name + ".I am " + _Age + " years old.");
			
			System.out.println("My name is "+Name +",i am "+Age+" years old.");
			
			System.out.println("The state of the (Not) '!isTrue' boolean is : "+!isTrue);//Displays the state of the boolean variable true or false;
			
			System.out.println("The state of the 'isTrue' boolean is : "+isTrue);//Result = True
			
			System.out.println("My name is Forsab and i am " + Result + " years old.");
		}
		else
		{
			System.out.println("Intruder alert!!!");
		}
		
		
		
		
		
		

	}

}
