package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	
	private Innlegg[] innleggtabell;
	private int nesteLedige;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteLedige = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {

		return nesteLedige;

	}

	public Innlegg[] getSamling() {

		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < innleggtabell.length; i++) {

			if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				return i;

			}
		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {
		boolean Finnes = false;

		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				Finnes = true;
				
			}

		}
		return Finnes;

	}

	public boolean ledigPlass() {
		boolean Ledig = false;

		if (nesteLedige < innleggtabell.length) {
			Ledig = true;
		}

		return Ledig;

	}

	public boolean leggTil(Innlegg innlegg) {
		boolean LeggTil = false;
		if (finnes(innlegg)) {
			LeggTil = false;
		} else if (ledigPlass() && innlegg != null) {
			innleggtabell[nesteLedige] = innlegg;
			nesteLedige++;
			LeggTil = true;
		}

		return LeggTil;

	}



	public String toString() {
		
			String txt = nesteLedige + "\n";
			for( int i =0; i < nesteLedige; i++) {
				txt += innleggtabell[i].toString();
				
			}return txt; 
//			
//		
	}

	
	public void utvid() {
		Innlegg[] tempTabell = new Innlegg[innleggtabell.length * 2]; 
		
		
		for ( int i = 0; i< nesteLedige; i ++) {
			tempTabell[i] = innleggtabell[i]; 
		}
		
		innleggtabell = tempTabell; 
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}