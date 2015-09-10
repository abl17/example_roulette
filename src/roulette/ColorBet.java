package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {
	
	public ColorBet() {
		super("Red or Black", 1);
	}
	@Override
	public boolean betIsMade (Wheel wheel, String betChoice) {
        return wheel.getColor().equals(betChoice);
    }
	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

}
