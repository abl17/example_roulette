# example_roulette
Program to refactor that plays a game of roulette

Written by: Austin Liu (abl17) and Sung-Hoon Kim (sk342)

###What code needs to be added to Game to allow the user to make another kind of bet?
To add a bet to the user's bet choice, the only code needed to be added into the *Game* class is to add to the array *myPossibleBets*. However,  we can get around this by making a new class that contains the possible bets, such as a *PossibleBetList*, so that we don't have to add anything to the main.

###What methods would make sense as behaviors of a Bet hierarchy (i.e. make bets open to extension?)

The methods that would make sense would be to have two classes: *betIsMade*, and *placeBet*. Essentially, because each bet has a winning and losing condition, it makes sense to have a betIsMade because all subclasses of *Bet* will use this functionality. Similar for *placeBet*.

###What methods would help improve the code in the Game's method (i.e. Close it for modification)

Removing *betIsMade* and *placeBet* makes additional extensions not touch the Game class much. Another thing we could do is to create a class that represents the Bet array, so that we don't have to modify Game at all when we're adding new bets.

###What methods can be completely implemented in the Bet super class? And which completely in the Bet sub-classes?

The two methods that can be completely implemented in the Bet super class are getOdds and getDescription. The methods that can be completely implemented in the Bet sub-classes are: betIsMade and placeBet.

###How should the Game class create the correct Bet subclass
The Game creates all the bet subclasses, and the user simply just picks one according to its array index.


##Add New Features:

###In what ways is the refactored code simpler?
It is simpler in extending functionality and adding Bet types. It also makes reading the code simpler.

###In what ways is the refactored code more complex?
There are more classes to go through.

###What trade-offs did you make when refactoring your old code?
One of the trade-offs was creating a dependency between the bets and the wheel. However, this was ultimately a necessary option in order to create inheritance hierarchy.

###Which code do you prefer and why?
We preferred the refactored code, because it allowed a strong independence in the bets. Furthermore, it freed up many of the dirty if-statements. Based on analyzing the different trade-offs, we decided that it was worth it to extract some of the Game methods into the bet super-class and its sub-classes.

