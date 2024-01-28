package skiVerleih;

public class Kunde { //Klasse mit Atributen
	private String name;
	private int alter;
	private Sportausrüstung ausgeliehen;
	private int restlicheLeihtage;
	private int identifikationsnummer;
	
	public Kunde(String name, int alter, Sportausrüstung ausgeliehen, int restlicheLeihtage, int identifikationsnummer) { //Konstruktor mit Funktionsargumente
		this.name = name;
		this.alter = alter;
		this.ausgeliehen = ausgeliehen;
		this.restlicheLeihtage = restlicheLeihtage;
		this.identifikationsnummer = identifikationsnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Sportausrüstung getAusgeliehen() {
		return ausgeliehen;
	}

	public void setAusgeliehen(Sportausrüstung ausgeliehen) {
		this.ausgeliehen = ausgeliehen;
	}

	public int getRestlicheLeihtage() {
		return restlicheLeihtage;
	}

	public void setRestlicheLeihtage(int restlicheLeihtage) {
		this.restlicheLeihtage = restlicheLeihtage;
	}

	public int getIdentifikationsnummer() {
		return identifikationsnummer;
	}

	public void setIdentifikationsnummer(int identifikationsnummer) {
		this.identifikationsnummer = identifikationsnummer;
	}
	public void sendenNewsletter() {
		System.out.println("Newsletter ist verschickt");
	}
	public void ausleihen(Sportausrüstung sportausrüstung, int leihdauer) {
		this.ausgeliehen = sportausrüstung;
		this.restlicheLeihtage = leihdauer;
	}
	public void zurückgeben() {
		this.ausgeliehen = null;
		this.restlicheLeihtage = 0;
	}
}
