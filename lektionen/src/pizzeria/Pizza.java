package pizzeria;

// Neuer Bauplan für Pizza
public class Pizza {
	private String groesse;
	private boolean vegan;
	private int preis;
	
	Pizza(String groesseInput, boolean veganInput, int preisInput) {
		groesse = groesseInput;
		vegan = veganInput;
		preis = preisInput;
	}
	
	public void setGroesse(String groesseNeu) {
		groesse = groesseNeu;
	}
	
	public int getPreis() {
		return preis;
	}
	
	public void beschreibe() {
		System.out.println("Die Größe ist: " + groesse);
		beschreibeObVegan();
		System.out.println("Der Preis dafür ist: " + preis + "€");
	}
	
	private void beschreibeObVegan() {
		if (vegan) {
			System.out.println("Sie ist vegan");
		} else {
			System.out.println("Sie ist nicht vegan");
		}
	}
}
