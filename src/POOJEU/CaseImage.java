package POOJEU;

import java.awt.Image;
import java.util.Scanner;

public class CaseImage extends CaseQuestion {
	private final String couleur = "rose";
	private Image[] images;
	private int imageCorrecte;

	public CaseImage(int num) {
		numero = num;
	}

	@Override
	public void action(Plateau plateau, Joueur joueur) {
		Scanner sc = new Scanner(System.in);
		if (dejaParcourue = true) {
			nouvelleQuestion(plateau);
		}
		// affichage du mot
		/*if (sc.nextInt() == imageCorrecte) {
			joueur.setScoreActuel(joueur.getScoreActuel() + 10);
			plateau.setCaseActuelle(plateau.getCaseActuelle() + 2);
		}*/
	}

	public void nouvelleQuestion(Plateau plateau) {
	}

	@Override
	public String toString() {
		return "CaseImage [couleur=" + couleur + "]";
	}
	
	// public void verifieReponse() {}

}
