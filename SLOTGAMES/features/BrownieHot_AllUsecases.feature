Feature: Test all the functionalities of Brownie Hot Slot Game
   

	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Brownie Hot slot game 
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Brownie Hot slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Brownie Hot slot game 
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Brownie Hot slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Brownie Hot slot game 
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Brownie Hot slot game 
	

	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.3 in Brownie Hot game
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.3 in Brownie Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.6 in Brownie Hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as 0.6, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as 0.6, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.6 Brownie Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination one point five in Brownie Hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as one point five, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as one point five, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination one point five in Brownie Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination three in Brownie Hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, transfer button, bet type as 0.01, denomination as three, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.01 & denomination as three, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination three in Brownie Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination six in Brownie Hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as six, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as six, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination six in Brownie Hot game

	
	
	
	
	
	Scenario: Check whether system is providing balance in try now feature of Brownie Hot slot game
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, try now button and balance to play
    When Open the Brownie Hot slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Brownie Hot slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Brownie Hot slot game
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, try now button, balance to play and spin button
    When Open the Brownie Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Brownie Hotslot game
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Brownie Hot slot game
    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, try now button, balance to play, spin button and win amount
    When Open the Brownie Hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Brownie Hot slot game