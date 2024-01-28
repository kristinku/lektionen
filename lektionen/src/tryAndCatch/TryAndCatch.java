package tryAndCatch;

public class TryAndCatch {
	public static void main(String[] args) {
		try {
			String endresult = TryAndCatch.oeffnen("passwort123");
			System.out.println(endresult);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static String oeffnen(String kennwort) {
		if(kennwort.equals("passwort123")) {
			return "Willkommen";
		}
		throw new IllegalArgumentException("Falsches Passwort");
	}
}
