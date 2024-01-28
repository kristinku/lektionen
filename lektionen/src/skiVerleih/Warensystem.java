package skiVerleih;

import skiVerleih.SkillEnum.skillLevel;

public class Warensystem {
	public static void main(String[] args) {
		Ski diamondSki = new Ski(2.0f, "Diamond", SkillEnum.Fortgeschritten);
		Kunde neuerKunde = new Kunde("Olaf Snow", 25, diamondSki, 5, 123456);
		System.out.println(neuerKunde.getAusgeliehen());
		neuerKunde.zurückgeben();
		System.out.println(neuerKunde.getAusgeliehen());
		neuerKunde.ausleihen(diamondSki, 10);
		System.out.println(neuerKunde.getRestlicheLeihtage());


	}
		
}
