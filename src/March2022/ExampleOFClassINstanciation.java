package March2022;

public class ExampleOFClassINstanciation {

	public static void main(String[] args) {
	//	ClassName objName = new ClassName(); 
		//Instantiation;
		Student getAccess = new Student();
		getAccess.studentInfo();
		getAccess.studentGrades();
		getAccess.studentFile();
		System.out.println("\n");
		EmployeeRecords borrowam = new EmployeeRecords();
		borrowam.getEmlpoyeeInputs();
		borrowam.taxCalculation();
		borrowam.output();;
		
		
		
	}

}
