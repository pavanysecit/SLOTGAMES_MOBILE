Feature: Test all the functionalities of Fruit Club Slot Game
   

	Scenario: Change the bet value as 0.1, do the spin and check whether balance is deducting according to the changed bet type in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, bet type as 0.02, bet value as 0.1, balance and spin button, balance after spin
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as 0.1, click on spin button and check the balance after spin
    Then Balance should get deducted by 0.1 after spin as bet type is selected as 0.02 and bet value as 0.1 in Fruit Club game
	
	
	Scenario: Change the bet value as 0.2, do the spin and check whether balance is deducting according to the changed bet type in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club game, bet type as 0.02, bet value as 0.2, balance and spin button
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as 0.2, click on spin button and check the balance
    Then Balance should get deducted by 0.2 as bet type is selected as 0.02 in Fruit Club game
	
	
	Scenario: Change the bet value to 0.5, click on spin button and check whether current balance is deducting according to changed bet type in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, bet type as 0.02, bet value as 0.5, balance, spin button and win amount
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as 0.5, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by 0.5 as bet type is selected as 0.02 and bet value as 0.5 in Fruit Club game
	

	Scenario: Change the bet value as ONE, click on spin and check whether existing balance is deducting according to changed bet type in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club game, bet type as 0.02, bet value as ONE, balance and spin button
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to ONE, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by ONE as bet type is selected as 0.02 and bet value as ONE in Fruit Club slot game

	
	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to changed bet type in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, bet type as 0.02, bet value as TWO, balance and spin button
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TWO, click on spin button and check the balance
    Then Current Balance should get deducted by TWO as bet type is selected as 0.02 and bet value as 2 in Fruit Club game
    