Feature: Test all the functionalities of Skinfiri Lotto Slot Game
   

 	Scenario: To check the transferred amount is added to Skinfiri Lotto game
    Given Chrome browser, valid URL, valid login details, Skinfiri Lotto game, balance, text field to transfer balance and Ok button
    When Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then The exact amount entered in the transfer page should transfer to Skinfiri Lotto game and same amount should get displayed on the balance section
	
	
#	Scenario: Check whether the player is able to transfer the amount more than the available balance
    #Given Chrome browser, valid URL, valid login details, Skinfiri Lotto game, balance greater than available balance, text field to transfer balance, Ok button and validation message
    #When Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
    #Then Player should be blocked from loading the Skinfiri Lotto game when the amount entered in the transfer page is more than the available balance
#	
#	
#	Scenario: Check whether balance field is accepting null valuess in the transfer page of Skinfiri Lotto game
    #Given Chrome browser, valid URL, valid login details, Skinfiri Lotto game, empty balance, text field to transfer balance, Ok button and validation message
    #When Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn
    #Then An error should be displayed if the balance field is empty and player should be blocked from loading the Skinfiri Lotto game
#	
#	
#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Skinfiri Lotto game
    #Given Chrome browser, valid URL, valid login details, Skinfiri Lotto game, zero balance, text field to transfer balance, Ok button and validation message
    #When Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn
    #Then An error should be displayed if balance entered was zero and player should be blocked from loading the Skinfiri Lotto game
