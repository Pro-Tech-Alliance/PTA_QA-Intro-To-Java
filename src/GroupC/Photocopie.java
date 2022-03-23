/** Un magasin de reprographie facture 0.10cent les dix premieres photocopies, 0.09ent les vingt
 * suivantes et 0.08cent au dela. Ecrivez un algorithme qui demande a l'utilisateur le nombre de photocopies
 * effectuees et qui affiche la facture correspondante **/

package GroupC;
import java.util.Scanner;
public class Photocopie {

	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
	System.out.print("Combien de photocopies voulez vous effectuer? : ");
	int nbr = scr.nextInt();
	Boolean case1 = (nbr >=1 && nbr <= 10);
	Boolean case2 = (nbr >= 11 && nbr <= 30);
	Boolean case3 = (nbr > 30);
	
	if (case1) {
		double x = nbr*0.1;
		System.out.print("Votre facture sera de : " + x );
	} else if (case2) {
		double y = 10*0.1 + (nbr - 10)*0.09;
		System.out.println("Votre facture sera de : " + y);
	} else if (case3) {
		double z = 10*0.1 + 20*0.09 + (nbr - 30)*0.08;
		System.out.println("Votre facture sera de : " + z);
	}

	}

}
