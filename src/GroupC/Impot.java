/**
 * Les habitants de Melam paient l'impot selon les regles suivantes:
 * - Les hommes de plus de 20 ans paient l'impot
 * - les femmes paient l'impot si elles ont entre 18 et 35 ans
 * - les autres ne paient pas l'impot
 * Le programme demandera donc l'age et le sexe de l'habitant et lui dira s'il paie ou non l'impot*/

        package GroupC;
        import java.util.Scanner;

        public class Impot {
	    public static void main(String[] args) {
	    	String sexe1 = "Homme";
	    	String sexe2 = "Femme";
		Scanner scr = new Scanner(System.in);
		System.out.print(" Quel votre age? : ");
		int age = scr.nextInt();
		scr.nextLine();
		System.out.print("Quel est votre sexe ?: ");
		String sexe = scr.nextLine();
		Boolean case1 = (sexe == sexe1 && age > 20)|| ( sexe == sexe2 && (age >= 18 && age <= 35));
		if (case1) {
			System.out.println("Vous etes imposable ");
		} else {
			System.out.println("Vous n'etes pas imposable");
		}

	}

}
