package wohnadresse;

public class Professor extends Person {
	private float lohn;
	
	public Professor(float lohn, String _name, String _telefonnummer, String _eMail) { //Erstellung und Definition eines Professor mit Konstruktor, ruft bei extends(vererbung)den Konstruktor von Person auf
		super(_name, _telefonnummer, _eMail); //Aufruf Konstruktor Person 
		this.lohn = lohn;
	}

	public float getLohn() {
		return lohn;
	}

	public void setLohn(float lohn) {
		this.lohn = lohn;
	}
	
}
