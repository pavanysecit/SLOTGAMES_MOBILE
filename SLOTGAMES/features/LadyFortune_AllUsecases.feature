Feature: Test all the functionalities of Lady Fortune Slot Game


		Scenario: Change the bet value as 0.5, do the spin and check whether balance is deducting according to the changed bet type in Lady Fortune slot game
    Given Chrome browser, valid URL, valid login details, Lady Fortune game, 0.05 as bet type , 0.5 as bet value, balance, spin button and win amount
    When Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.5, click on spin button and check the balance
    Then Balance should get deducted by 0.5 as bet type is selected as 0.05 in Lady Fortune slot game
	