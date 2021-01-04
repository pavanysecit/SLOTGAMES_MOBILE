Feature: Test all the functionalities of Fruit Club Slot Game
   

	Scenario: Transfer balance with decimal value and check whether balance deducting with decimal value in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, bet type as 0.01, mimimum bet value, balance in decimal value and spin button
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.2, click on spin button and check the balance in decimal
    Then Balance should get deducted by decimal value, as bet type is selected as 0.01 and bet value as 0.2 in Fruit Club game
	And After deducting balance, switch to credit mode and spin and check balance is deducting according to credit value in Fruit Clubgame
	
	