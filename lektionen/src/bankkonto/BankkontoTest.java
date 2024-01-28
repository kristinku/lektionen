package bankkonto;

public class BankkontoTest {
	public static void main(String[] args) {
		Bankkonto bastisKonto = new Bankkonto("Basti Müller", 123456789, 15000.15, -5000.00);
		bastisKonto.einzahlen(500.00);
		System.out.println(bastisKonto.abfragenKontostand());
		System.out.println(bastisKonto);
		
	}
}
