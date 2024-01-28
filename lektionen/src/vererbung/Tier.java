package vererbung;

public class Tier {
	private int id;
	private String name;
	
	Tier(int id, String name){
		this.id = id; 
		this.name = name; 
	
	}
	
	public int getId() {
		return id; 
	}
	public String getName() {
		return name; 
	}
}
