/*
 * Ce program demande l'age d'un enfant a un utilisateur et lui informe de sa categorie
 * vous etes poussin de 6 a 7 ans ; pupille de 8 a 9 ans ; minime de 10 a 11 ans 
 * et en fin cadet apres 12 ans***/

package GroupC;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Entrez votre age : ");
int age = s.nextInt();
Boolean case1 = (age >= 6 && age <= 7 );
Boolean case2 = (age >= 8 && age <= 9 );
Boolean case3 = (age >= 10 && age <= 11);
Boolean case4 = ( age >= 12);


if ( case1){
	System.out.println("Vous etes poussin ");
} else if (case2) {
	System.out.println("Vous etes pupile ");
} else if (case3) {
	System.out.println("Vous etes minime ");
	
} else if ( case4) {
	System.out.println("vous etes cadet ");
}

	}

}
