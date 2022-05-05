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
    
    //private Case[] cases ;

    public void inscrire(){};

    public void identifier(){};

    public void commencer(){
    plateau =new Plateau();
    while (plateau.getCaseActuelle()!=99) {
    	plateau.setCaseActuelle(plateau.getCaseActuelle()+joueurCourant.lancerDes()); 
        plateau.getCase(plateau.getCaseActuelle()).action(plateau ,joueurCourant)	;
    }
    
    };

    public void enregistrer(){};

    public void quitter(){};

    public void update(){

    };

}
