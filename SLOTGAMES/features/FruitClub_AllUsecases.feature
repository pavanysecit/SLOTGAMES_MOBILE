Feature: Test all the functionalities of Fruit Club Slot Game
   

	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Fruit Club slot game 
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Fruit Club slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Fruit Club slot game 
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Fruit Club slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Fruit Club slot game 
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Fruit Club slot game 
	