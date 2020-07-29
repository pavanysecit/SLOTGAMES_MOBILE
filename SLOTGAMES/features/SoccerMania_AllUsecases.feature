Feature: Test all the functionalities of Soccer Mania Slot Game
   

	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, credits, denomination drop down and denomination as 0.02 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.02 and check the balance
    Then Balance amound should be same as denomination 0.02 multiplies by credit in Soccer Mania game