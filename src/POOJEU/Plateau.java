package POOJEU;

import java.util.Random;
import java.util.ArrayList;

public class Plateau {
	private static int num = 0;
	private int ID;
	private int caseActuelle = 0;
	private Case[] cases = new Case[100];

	public Plateau() {
		ID = num;
		num++;
		Random random;
		int caseNumber;
		boolean jobDone = false;
		cases[0]=new CaseDepart();
		for (int i = 0; i < 5; i++) {
			while (!jobDone) {
				random = new Random();
				caseNumber = random.nextInt(100);
				if (cases[caseNumber]==null) {
					cases[caseNumber]=new CaseBonus(caseNumber);
					jobDone = true;
				}
			}
			jobDone = false;
			while (!jobDone) {
				random = new Random();
				caseNumber = random.nextInt(100);
				if (cases[caseNumber]==null) {
					cases[caseNumber]=new CaseImage(caseNumber);
					jobDone = true;
				}
			}
			jobDone = false;
			while (!jobDone) {
				random = new Random();
				caseNumber = random.nextInt(100);
				if (cases[caseNumber]==null) {
					cases[caseNumber]=new CaseDefinition(caseNumber);
					jobDone = true;
				}
			}
			jobDone = false;
			while (!jobDone) {
				random = new Random();
				caseNumber = random.nextInt(100);
				if (cases[caseNumber]==null) {
					cases[caseNumber]=new CaseMallus(caseNumber);
					jobDone = true;
				}
			}
			jobDone = false;
			while (!jobDone) {
				random = new Random();
				caseNumber = random.nextInt(100);
				if (cases[caseNumber]==null) {
					cases[caseNumber]=new CaseSaut(caseNumber);
					jobDone = true;
				}
			}
			jobDone = false;
		}

		for (int i = 1; i != 99; i++) {
			if (cases[i]==null) {
				cases[i]=new CaseParcours(i);
			}
		}
		cases[99] = new CaseFin();

	} // init

	public void sauvgardeFichier() {
	}

	public Case getCase(int nbCase) {
		return cases[nbCase];
	}

	public int getCaseActuelle() {
		return caseActuelle;
	}

	public void setCaseActuelle(int caseActuelle) {
		this.caseActuelle = caseActuelle;
	}

	public void getPlateau(){
		for (int i=0;i!=100;i++) {
			System.out.println(i+1+" :"+cases[i].getClass());
		}
	}


}
