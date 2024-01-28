//https://www.informatikzentrale.de/_files/09oopuml/oopuml02_uml_klassendiagramme_klassendiagramm_KREDITKARTE.png
package kreditkarte;

public class Kreditkarte {
	private int geheimzahl;
	private String typ;
	private double verfuegungsrahmen = 2000;
	
	public Kreditkarte () {
		//Standard Konstruktor, ist leer weil das Objekt ohne Werte für die Atribute erstellt werden soll.
	}
	
	public void geheimzahlAnzeigen() { //void = die Funktion gibt nichts zurück, es gibt kein return
		System.out.println(geheimzahl);
	}
	
	public void verfuegungsrahmenAnzeigen() {
		System.out.println(verfuegungsrahmen);
		
	}
	
	public int getGeheimzahl() { //Getter bekommen nie etwas als Funktionsargument in die ()
		return geheimzahl;
	}
	
	public void setGeheimzahl(int geheimzahl) { //Setter geben nie etwas zurück deswegen void, bekommen aber ein Funktionsargument rein
		this.geheimzahl = geheimzahl;
	} //Restliche getter und setter Funktionen für typ und verfuegungsrahmen habe ich weggelassen, da nur übung
}
