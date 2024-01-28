//Erstelle eine Funktion die eine übergebene Zahl so oft mal drei multipliziert bis die Zahl größer ist als 123456789.
package whileSchleife;

public class ExtraUebungWhile {
	public static void main(String[] args) {
		int ersteZahlGroeßer = ExtraUebungWhile.multiplizieren(10);
		System.out.println(ersteZahlGroeßer);
	}

	public static int multiplizieren(int zahl) {
		while (zahl < 123456789) {
			zahl = zahl * 3;
		}
		return zahl;

	}

	public static int multiplizierenDoWhile(int zahl) {
		do {
			zahl = zahl*3;
		}while(zahl < 123456789);
			
		return zahl;
	}
}
