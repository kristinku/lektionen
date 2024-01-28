package whileSchleife;

import java.util.ArrayList;
import java.util.List;

public class WhileSchleife {
	public static void main(String[] args) {
		List<Buch> buecher = List.of(
				new Buch("5556464", "Der Dieb", 50.00f), //Konstruktoraufruf
				new Buch("6987432", "Robin Hood", 15.00f),
				new Buch("7458665", "Rotkaeppchen", 5.00f)
				);
	List<String> ergebnisWhileSchleife = WhileSchleife.doWhileSchleifeÜbung(buecher);
	System.out.println(ergebnisWhileSchleife);
	}
	
    public static List<String> forSchleifeÜbung(List<Buch> buecher)  {
    	List<String> buchStrings = new ArrayList();
    	for(Buch buch : buecher) {
    		buchStrings.add("Isbn: " + buch.getIsbn() + " Titel: " + buch.getTitel() + " Preis: " + buch.getPreis());
    	}
    	return buchStrings;
    }
    
    public static List<String> whileSchleifeÜbung(List<Buch> buecher)  {
    	List<String> buchStrings = new ArrayList();
    	int zähler = 0;
    	while(zähler < buecher.size()) { //while Schleife bekommt nur die Bedingung wie lange etwas gemacht werden soll.
    		Buch buch = buecher.get(zähler);
    		buchStrings.add("Isbn: " + buch.getIsbn() + " Titel: " + buch.getTitel() + " Preis: " + buch.getPreis());
    		zähler++;
    	}
    	return buchStrings;
    }
    
    public static List<String> whileSchleifeÜbungMitStringFormat(List<Buch> buecher)  { //Gleiche while Lösung aber mit String Format in Zeile 41
    	List<String> buchStrings = new ArrayList();
    	int zähler = 0;
    	while(zähler < buecher.size()) { 
    		Buch buch = buecher.get(zähler);
    		buchStrings.add(String.format("Isbn: %s Titel: %s Preis: %f", buch.getIsbn(), buch.getTitel(), buch.getPreis()));
    		zähler++;
    	}
    	return buchStrings;
    }
    
    public static List<String> doWhileSchleifeÜbung(List<Buch> buecher)  { //Do-While schleife, verwendet man wenn man etwas mindestens 1 mal ausgeführt werden
    	List<String> buchStrings = new ArrayList();
    	int zähler = 0;
    	do { 
    		Buch buch = buecher.get(zähler);
    		buchStrings.add(String.format("Isbn: %s Titel: %s Preis: %f", buch.getIsbn(), buch.getTitel(), buch.getPreis()));
    		zähler++;
    	} while(zähler < buecher.size());
    	return buchStrings;
    }
}
