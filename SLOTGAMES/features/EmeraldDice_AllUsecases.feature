Feature: Test all the functionalities of Emerald Dice Slot Game
   

 	Scenario: To check the transferred amount is added to Emerald Dice game
    Given Chrome browser, valid URL, valid login details, Emerald Dice game, balance, text field to transfer balance and Ok button
    When Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then The exact amount entered in the transfer page should transfer to Emerald Dice game and same amount should get displayed on the balance section
	
	
	Scenario: Check whether the player is able to transfer the amount more than the available balance
    Given Chrome browser, valid URL, valid login details, Emerald Dice game, balance greater than available balance, text field to transfer balance, Ok button and validation message
    When Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
    Then Player should be blocked from loading the Emerald Dice game when the amount entered in the transfer page is more than the available balance
	
	
	Scenario: Check whether balance field is accepting null valuess in the transfer page of Emerald Dice game in mobile
    Given Chrome browser, valid URL, valid login details, Emerald Dice game, empty balance, text field to transfer balance, Ok button and validation message in mobile
    When Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn in mobile
    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Emerald Dice game in mobile
	
	
	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Emerald Dice game
    Given Chrome browser, valid URL, valid login details, Emerald Dice game, zero balance, text field to transfer balance, Ok button and validation message
    When Open the Emerald Dice slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn
    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Emerald Dice game