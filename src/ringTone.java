package java_Inheritance;

//MY USER DEFINED CLASS
public class ringTone {
	
	//METHOD TO SET DEFAULT RINGTONE
	
	
	private static String[] Ringstate = {"Loud Ringing Sate","Vibration State","Silence State"}; 
	private static String Message;
	//private static String State;
	
	public void SetRingTone(int Index)
	{
		Message = Ringstate[Index];
		System.out.println("Ring setting set to "+ Message);
	}
	
}




