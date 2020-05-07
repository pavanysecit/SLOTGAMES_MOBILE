Feature: Test all the functionalities of Treasure Bonanza Slot Game
   

		Scenario: Check whether the max payout amount for each symbol like cash as per the bet type 0.01 and denomination FOUR in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like cash n etc, back button, bet type 0.01 and denomination as FOUR on mobile
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like cash n etc, click on back button, select bet type as 0.01 & denomination value as FOUR and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like cash n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to FOUR in Treasure Bonanza slot game on mobile