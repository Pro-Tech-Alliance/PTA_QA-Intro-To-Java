package GroupC;

public class Ecole {
	
	public static double mathematiques(double x,double y){
		 if(x>y){
		 return x-y;
		 }else{
		 return x+y;
		 }
	}
	public static void main(String[] args) {
	System.out.println(mathematiques(4,8));
	System.out.println(mathematiques(10,5));

	}

}
