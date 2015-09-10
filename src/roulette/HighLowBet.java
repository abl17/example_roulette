package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet{

	public HighLowBet() {
		super("High or Low", 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel wheel, String betChoice) {
		// TODO Auto-generated method stub
		return wheel.getNumber() >= 19 && betChoice.equals("high") ||
				wheel.getNumber() < 19 && betChoice.equals("low");
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		return ConsoleReader.promptOneOf("Please bet", "high", "low");
	}

}
