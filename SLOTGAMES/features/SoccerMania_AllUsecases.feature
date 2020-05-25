Feature: Test all the functionalities of Soccer Mania Slot Game

		Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.3 in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.3 in Soccer Mania game