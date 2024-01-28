//Erstelle eine Funktion. Sie bekommt zwei Parameter übergeben, die erste davon ist ein boolean 
//und heißt "happy". Die zweite ist auch ein boolean und heißt "You know it". Sie gibt zurück 
//einen String. Wenn happy und you know it true sind kommt zurück "clap your Hands" ansonsten ein 
//leerer String. Tip: Man kann in einen if mehrere Dinkge abfragen.

package happyAndYouKnowIt;

public class HappyAndYouKnowIt {
	public static void main(String[] args) {
		boolean happy = true;
		boolean youKnowIt = true; 
		System.out.println(HappyAndYouKnowIt.clapOrNot(happy, youKnowIt));
		
	}
	public static String clapOrNot(boolean happy, boolean youKnowIt) {
//		if(happy && youKnowIt) { Andis Lösung beide OK
		if(happy==youKnowIt && happy==true) { //Kristins Lösung: beide ok
			return "Clap you hands";
		} 
		else {
			return "";
		}
	}
	
}
