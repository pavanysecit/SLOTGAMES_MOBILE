Feature: Test all the functionalities of Deluxe Fruits Slot Game
   

	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Deluxe Fruits slot game
    Given Chrome browser, valid URL, valid login details, Deluxe Fruits slot game, balance, credits and denomination as 0.01 
    When Open the Deluxe Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in Deluxe Fruits slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in Deluxe Fruits game
    Given Chrome browser, valid URL, valid login details, Deluxe Fruits slot game, balance, credits, denomination drop down and denomination as 0.02 
    When Open the Deluxe Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.02 and check the balance
    Then Balance amound should be same as denomination 0.02 multiplies by credit in Deluxe Fruits game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Deluxe Fruits slot game
    Given Chrome browser, valid URL, valid login details, Deluxe Fruits slot game window, balance, credits, denomination drop down and denomination as 0.05 
    When Open the Deluxe Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.05 and compare the balance
    Then Balance amound should be same as denomination 0.05 multiplies by credit balance in Deluxe Fruits slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.5 in Deluxe Fruits slot game
    Given Chrome browser, valid URL, valid login details, Deluxe Fruits slot game, balance, credits and denomination drop down & value as 0.5
    When Open the Deluxe Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.5 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 0.5 by credit in Deluxe Fruits slot game