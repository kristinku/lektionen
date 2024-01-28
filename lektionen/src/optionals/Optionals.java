package optionals;

import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		Optional<String> maybe = Optionals.giveString("hello");
		System.out.println(maybe.orElse("kristin"));
		
	}
	
	private static Optional<String> giveString(String input) {
		return input.equals("hello") ? Optional.of("schatz") : Optional.empty();
	}
}
