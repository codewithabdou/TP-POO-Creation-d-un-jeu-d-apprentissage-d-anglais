package POOJEU;

import java.util.Scanner;

public class CaseDefinition extends CaseQuestion {

	private final String couleur = "bleu";
	private String definition;
    private static int nbr =0 ; 
	@Override
	public void action(Plateau plateau, Joueur joueur) {
		Scanner sc = new Scanner(System.in);
		if (dejaParcourue = true) {
			nouvelleQuestion( plateau);
		}
		 System.out.println("la definition :" + this.definition);
		 System.out.println("Entrer le mot : " );
		if (this.mot.equalsIgnoreCase(sc.nextLine())) {
			joueur.setScoreActuel(joueur.getScoreActuel() + 20);
			plateau.setCaseActuelle(plateau.getCaseActuelle() + 4);
			System.out.println("vous venez de gagner +20 points " );
			System.out.println("vous venez d'avancer de +4 cases " );
		} else {
			joueur.setScoreActuel(joueur.getScoreActuel() - 10);
			System.out.println("vous venez de perdre -10 points " );
		   }
		dejaParcourue = true;
       
	};

	public void nouvelleQuestion(Plateau plateau) {
      
		this.definition=plateau.getDefinitions(nbr+4);
		this.mot= plateau.getMotDefinitions(nbr+4);
		nbr++ ;
	};

	// public void verifieReponse() {} ;
	public CaseDefinition(int num ,String def,String mot ) {
		this.numero = num;
		this.definition =def ;
	    this.mot = mot ;
	}
	@Override
	public String toString() {
		return "CaseDefinition [couleur=" + couleur + "]";
	}
	
}
