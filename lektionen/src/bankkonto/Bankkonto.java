package bankkonto;

public class Bankkonto {
	private String name;
	private int kontonummer;
	private double kontostand;
	private double limit;
	
	public Bankkonto(String name, int kontonummer, double kontostand, double limit) { //Konstrutkor um ein Objekt der Klasse Bankkonto zu erzeugen der die Startwerte übergeben bekommt.
		this.name = name;															//Konstruktor = macht aus einen Bauplan ein Objekt
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.limit = limit;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + ", limit: " + limit;
	}
	
	public double einzahlen(double bargeld) {
		kontostand = kontostand + bargeld;
		return kontostand;
	}
	public double auszahlen(double auszahlungsbetrag) {
		kontostand = kontostand - auszahlungsbetrag;
		return kontostand;
	}
	public double abfragenKontostand() {
		return kontostand;
	}
}
