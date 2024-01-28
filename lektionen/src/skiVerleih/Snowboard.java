package skiVerleih;

public class Snowboard extends Sportausrüstung {
	private float breite;
	
	public Snowboard(float breite, String marke, SkillEnum skillLevel) { 
		super(marke, skillLevel); //Aufruf Konstruktor Sportausrüstung 
		this.breite = breite;
	}
	public float getBreite() {
		return breite;
	}
	public void setBreite(float breite) {
		this.breite = breite;
	}

}
