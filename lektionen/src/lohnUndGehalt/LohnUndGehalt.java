//Übung zur Objektorientierung
package lohnUndGehalt;

public class LohnUndGehalt {

	public static void main(String[] args) {

		Mitarbeiter mitarbeiter1 = new Mitarbeiter(1, "Hans"); //Konstruktoraufruf, erstellt ein Objekt aus der Klasse
		Mitarbeiter mitarbeiter2 = new Mitarbeiter(2, "Lisa");
		System.out.println(mitarbeiter1.toString());
	
		mitarbeiter1.setName("Peter");
		System.out.println(mitarbeiter1.getName());
	}

}
