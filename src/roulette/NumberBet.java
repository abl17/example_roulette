package roulette;

import util.ConsoleReader;

public abstract class NumberBet extends Bet {

	private int typeNumber;
	
	public NumberBet(String description, int odds, int number) {
		super(description, odds);
		typeNumber = number;
	}
	@Override
	public boolean betIsMade (Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + typeNumber);
    }
	
	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - typeNumber);
	}
}
