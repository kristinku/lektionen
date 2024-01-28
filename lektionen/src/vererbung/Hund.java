package vererbung;

public class Hund extends Tier { 	//Der Hund erbt alle Eigenschaften und Methoden von Tier
	private String fellfarbe; 		//Neben den Eigentschaften von Tier hat der Hund jedoch auch das Atribut Fellfarbe.
	
	Hund(String fellfarbe, int id, String name) { //Um einen neuen Hund zu erstellen müssen wir ihm alle Werte vom Hund und aber auch 
		super(id, name); 		//vom Tier mitgeben, weil der Hund vom Tier abstammt. Die Superfunktion ist der Konstuktor von Tier
		this.fellfarbe = fellfarbe; 
		}
	public String getFellfarbe() {
		return fellfarbe; 
	}
}
