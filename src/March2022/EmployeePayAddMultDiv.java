package March2022;

public class EmployeePayAddMultDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeePayCheck EmployeePayAddMulDivObj = new EmployeePayCheck();
		
		EmployeePayAddMulDivObj.AdditionPayWeekly(1300, 1300);
		EmployeePayAddMulDivObj.MultiplicatePayWeekly(1300, 700);
		EmployeePayAddMulDivObj.SubtractPayWeekly(1000, 900);
		EmployeePayAddMulDivObj.DivisionPayweekly(2000, 800);
		
		
		int Output1=EmployeePayAddMulDivObj.AdditionPayWeekly(1300, 1300);
		int Output2=EmployeePayAddMulDivObj.MultiplicatePayWeekly(1300, 700);
		int Output3=EmployeePayAddMulDivObj.SubtractPayWeekly(1000, 900);
		int Output4=EmployeePayAddMulDivObj.DivisionPayweekly(2000, 800);
		
		
		System.out.println(Output1);
		System.out.println(Output2);
		System.out.println(Output3);
		System.out.println(Output4);
		
		
		
				
	}

}
