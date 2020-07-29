Feature: Test all the functionalities of 40 Splendid Hot Slot Game
   

 	Scenario: To check the transferred amount is added to 40 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot game, balance, text field to transfer balance and Ok button
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then The exact amount entered in the transfer page should transfer to 40 Splendid Hot game and same amount should get displayed on the balance section
	
	
	Scenario: Check whether the player is able to transfer the amount more than the available balance
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot game, balance greater than available balance, text field to transfer balance, Ok button and validation message
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
    Then Player should be blocked from loading the 40 Splendid Hot game when the amount entered in the transfer page is more than the available balance
	
	
	Scenario: Check whether balance field is accepting null valuess in the transfer page of 40 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot game, empty balance, text field to transfer balance, Ok button and validation message
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn
    Then An error should be displayed if the balance field is empty and player should be blocked from loading the 40 Splendid Hot game
	
	
	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of 40 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot game, zero balance, text field to transfer balance, Ok button and validation message
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn
    Then An error should be displayed if balance entered was zero and player should be blocked from loading the 40 Splendid Hot game
	



	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.4,0.8,2,4,8 in 40 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot slot game, bet type as 0.01 and bet value as 0.4,0.8,2,4,8
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value should be 0.4,0.8,2,4,8
    Then Bet value should get changed to 0.4,0.8,2,4,8 if the bet type selected as 0.01 from the drop down in 40 Splendid Hot slot game
	
	
	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.8,1.6,4,8 & 16 in 40 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot game, bet type as 0.02 and bet value as 0.8,1.6,4,8 & 16
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet value should be 0.8,1.6,4,8 & 16
    Then Bet value should get changed to 0.8,1.6,4,8 & 16 if the bet type selected as 0.02 from the drop down 1 in 40 Splendid Hot slot game
	
	
	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 1.2,2.4,6,12 & 24 in 40 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot slot game, bet type as 0.03 from down 2 and bet value as 1.2,2.4,6,12 & 24
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid logi., n details, select the bet type as 0.03 from down  and check the bet value should be 1.2,2.4,6,12 & 24
    Then Bet value should get changed to 1.2,2.4,6,12 & 24 if the bet type selected as 0.03 from the drop down two in 40 Splendid Hot slot game
	
	
	Scenario: Select the bet type as 0.2 from the drop down and check the bet value should be 8,16,40,80 & 160 in 40 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 40 Splendid Hot slot game, bet type as 0.2 from drop down and bet value as 8,16,40,80 & 160
    When Open the 40 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 from drop down and check the bet value should be 8,16,40,80 & 160
    Then Bet value should get changed to 8,16,40,80 & 160 if the bet type selected as 0.2 from the drop down three in 40 Splendid Hot slot game
	