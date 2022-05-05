package POOJEU;

import java.util.Random;

public class Joueur {
	
	private String nom ;
	private int meilleurScore=0 ;
	private int ID ;
	private int scoreActuel=0;
	
   
	public Joueur(String nom, int iD) {
		super();
		this.nom = nom;
		ID = iD;
	}


	public int  lancerDes() {
		Random random = new Random(); 
		int  de1 = random.nextInt(6) +1  ;
		int  de2 = random.nextInt(6) +1  ;
		return (de1+de2) ;
	} ;
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getMeilleurScore() {
		return meilleurScore;
	}


	public void setMeilleurScore(int meilleurScore) {
		this.meilleurScore = meilleurScore;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getScoreActuel() {
		return scoreActuel;
	}


	public void setScoreActuel(int scoreActuel) {
		this.scoreActuel = scoreActuel;
	}
	
}
