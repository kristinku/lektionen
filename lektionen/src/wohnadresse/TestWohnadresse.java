package wohnadresse;

public class TestWohnadresse {
	public static void main(String[] args) {
		Student hansPeter = new Student("123456", 1.7f , "Hans Peter", "0800 5555", "hans.peter@aol.com");
		Wohnadresse hansWohnadresse = new Wohnadresse(hansPeter, "Wohnstraße 10", "9999", "Hamburg", "Deutschland", true);
		hansWohnadresse.drucken();
		
		Professor viktorVoll = new Professor(5000.00f, "Viktor Voll", "0800 4444", "vitkor.voll@aol.com");
		hansWohnadresse.setBewohner(viktorVoll);
		hansWohnadresse.drucken();
	}
}
