package objektorientierung;

public class Sportmitglied {
	private String vorname; //Atribute
	private String nachname;//Atribute
	private int alter; //Atribute
	private Geschlecht geschlecht; //Atribute
	private int mitgliedsnummer; //Atribute
	
	Sportmitglied(String v, String n, int a, Geschlecht g, int m) { //Konstruktor: erstellt ein Objekt von der Klasse mit den angegebenen Atributswerten
		vorname = v;
		nachname = n; 
		alter = a; 
		geschlecht = g; 
		mitgliedsnummer = m;
	}
	
	public String getVorname() { //getter: Funktion um privaten Atribute zurück zu geben
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String n) {//setter: Funktion um private Atrbute zu ändern z.B. Perosn heiratet bekommt anderen Nachnamen
		nachname = n; 
	}
	public int getAlter() {
		return alter;
	}
    public String toString() { //ToString wird benötigt weil Java sonst nicht weiß wie die eigene Classe als String dargestellt werdens soll.
        return vorname + " " + nachname + " " +"Alter " + alter;
    }
	
}

