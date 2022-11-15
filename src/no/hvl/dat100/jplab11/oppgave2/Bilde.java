package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	
	public String url; 
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super (id, bruker, dato , tekst); 
		this.url = url; 
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url; 
	}
	
	public String getUrl() {
		return url; 

	}

	public void setUrl(String url) {
		this.url = url; 
	}
		
		

	@Override
	public String toString() {
		//BILDE\n1\nOle Olsen\n23-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
		
		String txt = "BILDE" + "\n"; 
		txt += Integer.toString(getId()) + "\n";
		txt += getBruker() + "\n";
		txt += getDato() + "\n";
		txt += Integer.toString(getLikes()) + "\n";
		txt += getTekst() + "\n";
		txt += url+ "\n";
		
		return txt; 
		
//		String txt = "Bilde" + "\n"; 
//		
//		return txt + super.toString() + url + "\n";
//		
		

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
