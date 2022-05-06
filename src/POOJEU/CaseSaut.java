package POOJEU;

import java.util.Random;

public class CaseSaut extends Case {
	private final String couleur = "orange";

	public CaseSaut(int num){
		numero=num;
	}

	public void action(Plateau plateau, Joueur joueur) {
		Random random = new Random();
		int nb = random.nextInt(100);
		plateau.setCaseActuelle(nb);
	};

	// aficher le num de la case

}
