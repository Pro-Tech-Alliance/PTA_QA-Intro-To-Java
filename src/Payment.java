
public class Payment {

	public static void main(String[] args) {
		// create a person object
		My_Project_Work_Person person = new My_Project_Work_Person();
		person.setFirstName("Francis");
		person.setLastName("Kyereh");
		person.setHourlyRate(60);
		
		//print the state of the person object
		System.out.println(person.toString());
		//get and print the weekly payment
		System.out.println(person.getPayment(40));
			
		

	}

}
