Feature: Test all the functionalities of Skinfiri Lotto Slot Game
   

		Scenario: Check whether system is providing balance in try now feature of Skinfiri Lotto slot game
    Given Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, try now button and balance to play
    When Open the Skinfiri Lotto slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Skinfiri Lotto slot game
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Skinfiri Lotto slot game
    Given Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, try now button, balance to play and spin button
    When Open the Skinfiri Lotto slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Skinfiri Lottoslot game
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Skinfiri Lotto slot game
    Given Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, try now button, balance to play, spin button and win amount
    When Open the Skinfiri Lotto slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Skinfiri Lotto slot game