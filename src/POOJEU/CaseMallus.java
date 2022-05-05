package POOJEU;

public class CaseMallus extends  Case{
	   private  final String couleur= "rouge";
	   public void action(Plateau plateau , Joueur joueur) {
		   joueur.setScoreActuel(joueur.getScoreActuel()-10);
		   plateau.setCaseActuelle(plateau.getCaseActuelle()-2) ;
		  
	   };

}
