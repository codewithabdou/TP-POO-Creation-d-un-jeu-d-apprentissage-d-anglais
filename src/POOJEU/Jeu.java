package POOJEU;

import java.io.File;
import java.util.*;

public class Jeu {

    private ArrayList<Joueur> joueurs= new ArrayList<Joueur>() ;
    private Plateau plateau ;
    private Joueur joueurCourant ;
    private File definitionsFile;
    private File imagesFile;
    private int meilleureScore ;

    public void inscrire(){};

    public void identifier(){};

    public void commencer(){
        
       plateau =new Plateau();
       joueurCourant = new Joueur("haha", 122);
       int d;
       Scanner sc = new Scanner(System.in);
       System.out.println("Appuyer sur entrer pour lancer les Dès" ) ;
       while (plateau.getCaseActuelle()!=99) {
         sc.nextLine() ;
         d= joueurCourant.lancerDes() ;
    	

         if (plateau.getCaseActuelle()+d> 99){
             int valSupp =plateau.getCaseActuelle()+d -100 ;
             plateau.setCaseActuelle(plateau.getCaseActuelle() - valSupp );
          }
         else  {plateau.setCaseActuelle(plateau.getCaseActuelle()+d);}
          System.out.println(" votre score est  : "+joueurCourant.getScoreActuel()) ;
          System.out.println("le lancer de dés est :"+d ) ;
          System.out.println("le case actuelle est "+ plateau.getCase(plateau.getCaseActuelle()).toString()+"  le num :"+plateau.getCaseActuelle()) ;
          plateau.getCase(plateau.getCaseActuelle()).action(plateau ,joueurCourant);
    
        }
        System.out.println("Vous avez gagné" ) ;
        if (joueurCourant.getMeilleurScore()< joueurCourant.getScoreActuel()) {joueurCourant.setMeilleurScore(joueurCourant.getScoreActuel());}
    
    }

    public void enregistrer(){};

    public void quitter(){};

    public void update(){

    };

}
