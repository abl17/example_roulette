package roulette.bets;

import java.util.List;

import roulette.Bet;

/**
 * After your programming pair completes each step below, please push the resulting code 
 * to your Roulette repository. Include everyone's name that helped with the code.

Create a Factory class that manages the Bet subclasses. Initially, use an array (or perhaps List :) 
of hard coded subclasses. It should also handle printing out the menu of choices rather than the Game class doing that. 

Change the Factory class to use reflection instead of creating them directly. Initially, hardcode
 the strings in your collection instead of instances.

Create a properties file that maps the complete Bet subclass name to its odds and description 
(on one line separated by a comma for east parsing). Read this property file to determine which subclasses your factory should create.
 * @author Austin
 *
 */

public class BetFactory {

	private static final Bet[] MY_POSSIBLE_BETS = {
			new RedBlack("Red or Black", 1),
			new OddEven("Odd or Even", 1),
			new ThreeConsecutive("Three in a Row", 11),
	};

	public static int getNumberOfBets () {
		return MY_POSSIBLE_BETS.length;
	}
	
	public static Bet getBet (int betIndex) {
		return MY_POSSIBLE_BETS[betIndex];
//		switch (betName) {
//		case "Red or Black":
//			return MY_POSSIBLE_BETS[0];
//		case "Odd or Even":
//			return MY_POSSIBLE_BETS[1];
//		case "Three in a Row":
//			return MY_POSSIBLE_BETS[2];
//		default: 
//			return null;
//		}
	}
}
