package skiVerleih;

public class Ski extends Sportausrüstung {
	private float länge;
	
	public Ski(float länge, String marke, SkillEnum skillLevel) { 
		super(marke, skillLevel); //Aufruf Konstruktor Sportausrüstung 
		this.länge = länge;
	}
	@Override
	public String toString() {
		return länge + " " + super.getMarke() + " " + super.getSkillLevel();
	}
	
	public float getLänge() {
		return länge;
	}
	public void setLänge(float länge) {
		this.länge = länge;
	}
	

}
