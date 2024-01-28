package pizzeria;

public class Pizzeria {

	public static void main(String[] args) {
		// Pizza Eigenschaften:
		// Größe
		// Vegan?
		// Preis
		
		Pizza margherita = new Pizza("L", false, 5);
// 		So sah es davor aus. Wir verwenden jetzt aber besser einen neuen Konstruktor
//		margherita.groesse = "L";
//		margherita.vegan = false;
//		margherita.preis = 5;
		
		Pizza marinara = new Pizza("M", true, 4);
		marinara.setGroesse("L");
		
		System.out.println(marinara.getPreis());
		
//		margherita.beschreibe();
		
		marinara.beschreibe();
	}


}
