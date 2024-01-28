package skiVerleih;

public class Sportausrüstung { //Klasse mit Atributen
	private String marke;
	private SkillEnum skillLevel;
	
	public Sportausrüstung(String marke, SkillEnum skillLevel) { //Konstruktor mit Funktionsargumente
		this.marke = marke;
		this.skillLevel = skillLevel;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public SkillEnum getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(SkillEnum skillLevel) {
		this.skillLevel = skillLevel;
	}
	
}
