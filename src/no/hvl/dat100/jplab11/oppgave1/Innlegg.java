package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {

	private int id, likes;
	private String bruker, dato;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {
		// Konstruktør der Likes = 0;

		this(id, bruker, dato, 0);

	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		// Konstruktør med alle parameter
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}

	public void doLike() {
		likes = likes + 1;
	}

	public boolean erLik(Innlegg innlegg) {
		return (this == innlegg); }

	
	
	public String toString() {

		/*String str = "";

		str += Integer.toString(id) + "\n";
		str += bruker + "\n";
		str += dato + "\n";
		str += Integer.toString(likes) + "\n";
		return str;*/
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n"; 

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
