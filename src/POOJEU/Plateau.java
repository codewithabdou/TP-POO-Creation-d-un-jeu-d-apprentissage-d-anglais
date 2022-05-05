package POOJEU;

public class Plateau {
	private static int num =0 ;
	private int ID ;
	private int caseActuelle = 0;
	private Case[] cases= new Case[100] ;
	
	public Plateau() {
		ID= num ;
		num++ ;
		cases[0]= new CaseDepart() ;
		cases[99]= new CaseFin();
	
		
	} // init
	public void sauvgardeFichier() {}
	public Case getCase(int nbCase) {
		return cases[nbCase];
	}	
	public int getCaseActuelle() {
		return caseActuelle;
	}
	public void setCaseActuelle(int caseActuelle) {
		this.caseActuelle = caseActuelle;
	}
	
	


}
