Feature: Test all the functionalities of Frizzling Hot Slot Game
   

	Scenario: Check whether system is providing balance in try now feature of Frizzling Hot slot game
    Given Chrome browser, valid URL, valid login details, Frizzling Hot slot game, try now button and balance to play
    When Open the Frizzling Hot slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Frizzling Hot slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Frizzling Hot slot game
    Given Chrome browser, valid URL, valid login details, Frizzling Hot slot game, try now button, balance to play and spin button
    When Open the Frizzling Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Frizzling Hotslot game
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Frizzling Hot slot game
    Given Chrome browser, valid URL, valid login details, Frizzling Hot slot game, try now button, balance to play, spin button and win amount
    When Open the Frizzling Hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Frizzling Hot slot game 