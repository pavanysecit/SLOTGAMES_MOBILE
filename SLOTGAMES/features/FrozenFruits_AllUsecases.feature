Feature: Test all the functionalities of Frozen Fruits Slot Game

  
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Frozen Fruits slot game
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, credits and denomination as 0.01 
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in Frozen Fruits slot game
    