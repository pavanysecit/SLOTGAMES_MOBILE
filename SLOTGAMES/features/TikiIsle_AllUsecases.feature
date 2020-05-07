Feature: Test all the functionalities of Tiki Isle Slot Game
   

		Scenario: Check whether the max payout amount for each symbol like J, Wild as per the bet type 0.02 and denomination EIGHT in Tiki Isle slot game on mobile
    Given Chrome browser, valid URL, valid login details, Tiki Isle slot game, icon to open payout table, all symbols, max amount on each symbol like J, Wild n etc, back button, bet type 0.02 and denomination as EIGHT on mobile
    When Open the Tiki Isle slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like J, Wild n etc, click on back button, select bet type as 0.02 & denomination value as EIGHT and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like J, Wild n etc and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination value to EIGHT in Tiki Isle slot game on mobile