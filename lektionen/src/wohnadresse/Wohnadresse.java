//https://files.ifi.uzh.ch/rerg/amadeus/teaching/courses/inf_oek_2_hs10/uebungen/uebung_4_loesung.pdf

package wohnadresse;

public class Wohnadresse { //Attribute der Klasse
	private Person bewohner;
	private String straße;
	private String stadt;
	private String plz;
	private String land; 
	private boolean istBestätigt;
	
	public Wohnadresse(Person bewohner, String straße, String stadt, String plz, String land, boolean istBestätigt) { //Konstruktor mit Funktionsargumente
		this.bewohner = bewohner;
		this.straße = straße;
		this.stadt	= stadt;
		this.plz = plz;
		this.land = land; 
		this.istBestätigt = istBestätigt;
	}
	
	@Override
	public String toString() {
		return bewohner + " " + straße + " " + stadt + " " + plz + " " + land + " " + istBestätigt;
	}	
	public Person getBewohner() {
		return bewohner;
	}
	public void setBewohner(Person aBewohner) {
		this.bewohner = aBewohner;
	}
	public String getStraße() {
		return straße;
	}
	public void setStraße(String straße) {
		this.straße = straße;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public boolean isIstBestätigt() {
		return istBestätigt;
	}
	public void setIstBestätigt(boolean istBestätigt) {
		this.istBestätigt = istBestätigt;
	}
	public void drucken() { //nicht static wird immer auf dem Objekt aufgerufen, da das Objekt durch den Konstruktor schon werte besitzt müssen die bei der Funktion nicht nochmal übergeben werden () 
		System.out.println(bewohner + " " + straße + " " + stadt + " " + plz + " " + land + " " + istBestätigt);
	}
}
