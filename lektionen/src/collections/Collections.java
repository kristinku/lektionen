package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;


public class Collections {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(); // Liste kann doppelte Werte beinhalten. Kann immer verwendet werden.
		names.add("Kristin");
		names.add("Uwe");
		names.add("Kristin");
		
		names.forEach(name -> System.out.println(name));
		
		Set<String> namesSet = new HashSet<>(); // Set beinhaltet Werte nur einmal, das zweite Kristin wird nicht gespeichert.
		namesSet.add("Kristin");				// Nutzt man wenn, keine doppelten Werte in einer Liste haben mag. 
		namesSet.add("Uwe");
		namesSet.add("Kristin");
		
		namesSet.forEach(name -> System.out.println(name));
		
		
		Map<Integer, String> users = new HashMap<>(); //Ist eine Liste von Key Value (ID und Wert), der Key ist der Schlüssel an den gewünschten Wert zu kommen, hier 123 um Kristin auszugeben. (Kann auch ein String sein oder etwas anders)  
		users.put(123, "Kristin");					//Nutzt man wenn man schnell auf Werte mit bekannten IDs zugreifen will.
		users.put(789, "Uwe");						//Maps kann einen bestimmten Wert aus der Liste ausgeben
		users.put(789, "Mark");
		
		System.out.println(users.get(789));		
	}
}
