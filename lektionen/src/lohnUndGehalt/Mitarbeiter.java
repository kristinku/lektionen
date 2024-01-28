package lohnUndGehalt;

public class Mitarbeiter {
	private int id;
	private String name;
	
	Mitarbeiter(int id, String name){ //Beschreibt wie der Konstruktor aufgerufen wird und was er macht!
		this.id = id;
		this.name = name;
	}
	
	public int getId() { 
		return id;
	}
	
	public void setName(String name) { // Bei setter kommt immer nichts zurück also void, weil sie nur etwas setzen nicht zurück geben
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	
	@Override // Wir überschreiben von Java vererbte Funktion, damit wir den mitarbeiter1 als String ausgeben können.
	public String toString() {
		return "Die ID ist " + id + ". Der Name der Person ist " + name; 
	}
}
