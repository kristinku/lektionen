package wohnadresse;

public class Person {
	private String name;
	private String telefonnummer;
	private String eMail;
	
	public Person (String _name, String _telefonnummer, String _eMail) { //Zur veranschaulichung der Argumente verwenden wir die Unterstriche. Ansonsten wird im Konstruktor z.B. this.name = name verwendet
		name = _name; 													//der Konstruktor erstellt ein Objekt, mit den übergebenen Werten als Werte für die Attribute.
		telefonnummer = _telefonnummer;		//Wert _telefonnummer den der übergeben wird, wir in das attribut telefonnummer gespeichert
		eMail = _eMail;
	}
	@Override //@Override to String brauchen wir damit, das Objekt schön als String ausgegeben werden kann
	public String toString() {
		return name + " " + telefonnummer + " " + eMail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		this.name = aName;
	}
	public String getTelefonnummer() {
		return telefonnummer;  //Ausgabe des attributwertes telefonnummer 
	}
	public void setTelefonnummer(String aTelefonnummer) {
		this.telefonnummer = aTelefonnummer;
	}
	public String getEmail() {
		return eMail;
	}
	public void setEmail(String aEmail) {
		this.eMail = aEmail;
	}
}
