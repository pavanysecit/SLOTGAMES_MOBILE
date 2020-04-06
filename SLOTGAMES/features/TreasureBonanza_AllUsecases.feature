Feature: Test all the functionalities of Treasure Bonanza Slot Game
   

		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and all the denominations in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.01 and all denomination values 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.01 & all denomination  values and check payout amount
    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination values in Treasure Bonanza slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and all the denominations in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.02 and  denomination values like 0.6, 1.2, 3, 6 & 12
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.02 & denomination  values like 0.6, 1.2, 3, 6 & 12 and check payout amount
    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination values like 0.6, 1.2, 3, 6 & 12 in Treasure Bonanza slot game on mobile
	
	Scenario: Check whether the max payout amount for each symbol like Q, K, 10 as per the bet type 0.05 and all denomination values in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like Q, K, 10 n etc, back button, bet type 0.05 and all denomination values  on mobile
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like Q, K, 10 n etc, click on back button, select bet type as 0.05 & all denomination  values and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like Q, K, 10 n etc and payout max amount should get changed whenever player changes the bet type to 0.05 and all denomination values in Treasure Bonanza slot game on mobile
	
	Scenario: Check whether the max payout amount for each symbol like A, Wild as per the bet type 0.5 and all denomination values in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like A, Wild n etc, back button, bet type 0.5 and denomination values like 15, 30, 75, 150 & 300 on mobile
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like A, Wild n etc, click on back button, select bet type as 0.5 & denomination  values like 15, 30, 75, 150 & 300 and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like A, Wild n etc and payout max amount should get changed whenever player changes the bet type to 0.5 and denomination values like 15, 30, 75, 150 & 300 in Treasure Bonanza slot game on mobile
	
	
	

		
	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Treasure Bonanza slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Treasure Bonanza slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Treasure Bonanza slot game 
	
	Scenario: Checking whether suit win amount is getting added to balance if it is win else it should not get added in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page
    Then Suit Win amount(4x) should get added to the main balance after win else it should not get added to main balance in the Treasure Bonanza slot game

	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.2 in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, denomination as 0.2, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as 0.2, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.2 in Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.4 in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as 0.4, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as 0.4, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.4 Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination ONE in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination ONE in Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination TWO in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, transfer button, bet type as 0.01, denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.01 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination TWO in Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FOUR in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination FOUR in Treasure Bonanza game