package wohnadresse;

public class Student extends Person {
	private String matrikelnummer;
	private float durchschnittsnote;
	
	public Student(String matrikelnummer, float durchschnittsnote, String _name, String _telefonnummer, String _eMail) { //Erstellung und Definition eines Student mit Konstruktor, ruft bei extends(vererbung)den Konstruktor von Person auf
		super(_name, _telefonnummer, _eMail); //Aufruf Konstruktor Person 
		this.durchschnittsnote = durchschnittsnote;
		this.matrikelnummer = matrikelnummer;
		
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public float getDurchschnittsnote() {
		return durchschnittsnote;
	}

	public void setDurchschnittsnote(float durchschnittsnote) {
		this.durchschnittsnote = durchschnittsnote;
	}
	public void einschreiben() {
		System.out.println("Du bist jetzt eingeschrieben");
	}
	
}
