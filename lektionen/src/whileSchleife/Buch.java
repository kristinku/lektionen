package whileSchleife;

public class Buch {
	private String isbn;
	private String titel;
	private float preis;
	
	public Buch(String isbn, String titel, float preis) { //Erstellt initial ein Objekt der Klasse Buch.
		this.isbn = isbn;
		this.titel = titel;
		this.preis = preis; //Setzt den Startwert des Attributs(oben bei Klasse) im erstellten Objekt
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn; //Setter wird benutzt um einen bestimmten Attributwert des Objekts zu verändern.
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}
	
}
