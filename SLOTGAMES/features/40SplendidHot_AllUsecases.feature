Feature: Test all the functionalities of 40 Splendid Hot Slot Game
   

 	
	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.4,0.8,2,4,8 in 40 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot slot game, bet type as 0.01 and bet value as 0.4,0.8,2,4,8
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value should be 0.4,0.8,2,4,8
    Then Bet value should get changed to 0.4,0.8,2,4,8 if the bet type selected as 0.01 from the drop down in 40 Splendid Hot slot game
	
	
	