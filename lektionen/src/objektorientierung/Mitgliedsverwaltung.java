package objektorientierung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mitgliedsverwaltung {
	public static void main(String[] args) {
		Sportmitglied hans = new Sportmitglied("Hans", "Wurst", 26, Geschlecht.MÄNNLICH, 54689);//Konstruktor Aufruf
		Sportmitglied lila = new Sportmitglied("Lila", "Krebs", 45 , Geschlecht.WEIBLICH, 66892);//Konstruktor Aufruf
		Sportmitglied kai = new Sportmitglied("Kai", "Pflanze", 20 , Geschlecht.DIVERS, 78964);//Konstruktor Aufruf
		Sportmitglied andi = new Sportmitglied("Andi", "Herbst", 30 , Geschlecht.MÄNNLICH, 12345);//Konstruktor Aufruf
		Sportmitglied carmen = new Sportmitglied("Carmen", "Wegge", 50 , Geschlecht.WEIBLICH, 56874);//Konstruktor Aufruf
		Sportmitglied kurt = new Sportmitglied("Kurt", "Glas", 78 , Geschlecht.DIVERS, 23456);//Konstruktor Aufruf
		
		List<Sportmitglied> alle = Arrays.asList(hans, lila, kai, andi, carmen, kurt);
		List<Sportmitglied> filter = Mitgliedsverwaltung.filterAlleUeber40(alle);
		System.out.println(hans);
		System.out.println(filter);		
	}
	
	public static List<Sportmitglied> filterAlleUeber40(List<Sportmitglied> alleMitglieder) {
		List<Sportmitglied> ü40 = new ArrayList();
		for(Sportmitglied sportmitglied : alleMitglieder) {
			if(sportmitglied.getAlter() >= 40) {
				ü40.add(sportmitglied);
			}
		}
		return ü40;
		
	}
	
	// Funktion um Namen von Sportmitlgied zu ändern:
//	System.out.println(hans.getVorname() +" " + hans.getNachname());
//	hans.setNachname("Käse");
//	System.out.println(hans.getVorname() +" " + hans.getNachname());

}
