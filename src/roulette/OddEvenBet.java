package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {

	public OddEvenBet() {
		super("Odd or Even", 1);
	}

	@Override
	public boolean betIsMade (Wheel wheel, String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
}
