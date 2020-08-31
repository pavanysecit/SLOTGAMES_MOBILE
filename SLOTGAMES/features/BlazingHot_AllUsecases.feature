Feature: Test all the functionalities of Blazing Hot Slot Game
   
     
     
    Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Blazing Hot game
    Given Chrome browser, valid URL, valid login details, Blazing Hot slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page
    When Open the Blazing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page
    Then Bet value & Credit value buttons should not be clickable after navigating from gamble page
	And Win amount should get added to the balance during autoplay