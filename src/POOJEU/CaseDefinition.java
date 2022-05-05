package POOJEU;

import java.util.Scanner;

public class CaseDefinition extends CaseQuestion {

		   private  final String couleur= "bleu";
		   private String definition ;
		   
		   @Override
		   public void action(Plateau plateau , Joueur joueur ) {
			   Scanner sc = new Scanner(System.in ) ;
			   if ( dejaParcourue= true ) { nouvelleQuestion() ;}
				   //affichage de la déf 
			   if ((sc.nextLine()).toUpperCase() == mot ) {
				 joueur.setScoreActuel(joueur.getScoreActuel()+20);
				 plateau.setCaseActuelle(plateau.getCaseActuelle()+4);
			    } 
			   else { joueur.setScoreActuel(joueur.getScoreActuel()-10); }
				   
			  
			   
		   };
		   public void nouvelleQuestion() {};
		   //public void verifieReponse() {} ;
}
