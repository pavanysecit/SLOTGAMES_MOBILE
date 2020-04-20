Feature: Test all the functionalities of 40 Glowing Hot Slot Game
   
 	Scenario: To check the transferred amount is added to fourty glowing hot game
    Given Chrome browser, valid URL, valid login details, fourty glowing hot game, balance, text field to transfer balance and Ok button
    When Open the fourty glowing slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then The exact amount entered in the transfer page should transfer to fourty glowing hot game and same amount should get displayed on the balance section
	
	
	Scenario: Check whether the player is able to transfer the amount more than the available balance
    Given Chrome browser, valid URL, valid login details, fourty glowing hot game, balance greater than available balance, text field to transfer balance, Ok button and validation message
    When Open the fourty glowing hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
    Then Player should be blocked from loading the fourty glowing hot game when the amount entered in the transfer page is more than the available balance
	
	
	Scenario: Check whether balance field is accepting null valuess in the transfer page of fourty glowing hot game
    Given Chrome browser, valid URL, valid login details, fourty glowing hot game, empty balance, text field to transfer balance, Ok button and validation message
    When Open the fourty glowing slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn
    Then An error should be displayed if the balance field is empty and player should be blocked from loading the fourty glowing hot game
	
	
	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of fourty glowing hot game
    Given Chrome browser, valid URL, valid login details, fourty glowing hot game, zero balance, text field to transfer balance, Ok button and validation message
    When Open the fourty glowing slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn
    Then An error should be displayed if balance entered was zero and player should be blocked from loading the fourty glowing hot game
	

		
	
	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.4 in 40 glowing hot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.01 and bet value 
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
    Then Bet value should get changed if the bet type selected as 0.01 from the drop down in 40 glowing hot slot game
	
	
	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.8, 1.6, 4,8,10 in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.02 and bet value as 0.8, 1.6, 4,8,10
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet value should be 0.8, 1.6, 4,8,10
    Then Bet value should get changed to 0.8, 1.6, 4,8,10 if the bet type selected as 0.02 from the drop down 1 in 40 glowing hot slot game
	
	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 1.2, 2.4, 6, 12, 24 in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.03 from down 2 and bet value as 1.2, 2.4, 6, 12, 24
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 from down  and check the bet value should be 1.2, 2.4, 6, 12, 24
    Then Bet value should get changed to 1.2, 2.4, 6, 12, 24 if the bet type selected as 0.03 from the drop down two in 40 glowing hot slot game
	
	Scenario: Select the bet type as 0.2 from the drop down and check the bet value should be 8, 16, 40, 80, 160 in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.2 from drop down and bet value as 8, 16, 40, 80, 160
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 from drop down and check the bet value should be 8, 16, 40, 80, 160
    Then Bet value should get changed to 8, 16, 40, 80, 160 if the bet type selected as 0.2 from the drop down two in 40 glowing hot slot game
	
	
	
	Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.01, bet value as 0.4, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, click on spin button and check the balance
    Then Balance should get deducted by 0.4 as bet type is selected as 0.01 in 40 Glowing Hot game
	
	
	Scenario: Change the bet value as 0.8, do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.01, bet value as 0.8, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.8, click on spin button and check the balance
    Then Balance should get deducted by 0.8 as bet type is selected as 0.01 and bet value as 0.8 in 40 glowing hot game
	
	Scenario: Change the bet value to TWO, click on spin button and check whether current balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.01, bet value as TWO, balance, spin button and win amount
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by TWO as bet type is selected as 0.01 and bet value as TWO in 40 glowing hot game
	
	Scenario: Change the bet value as FOUR, click on spin and check whether existing balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, glowing hot game, bet type as 0.01, bet value as FOUR, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to FOUR, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by FOUR as bet type is selected as 0.01 and bet value as FOUR in 40 glowing hot slot game
	
	Scenario: Change the bet value as Eight, do the spin and check whether balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.01, bet value as Eight, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as Eight, click on spin button and check the balance
    Then Current Balance should get deducted by Eight as bet type is selected as 0.01 and bet value as 8 in 40 glowing hot game
	
	

	
	Scenario: Change the bet type as 0.02 from drop down & bet value to 0.8 do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type drop down, bet type as 0.02, bet value as 0.8, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 from drop down, bet value to 0.8 click on spin button and check the balance
    Then Balance should get deducted by 0.8 if the bet type is selected as 0.02 in 40 glowing slot hot game
	
	
	Scenario: Change the bet value as 1.6, do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, 40 glowing hot game, 0.02 as bet type , 1.6 as bet value, balance, spin button and win amount
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 1.6, click on spin button and check the balance
    Then Balance should get deducted by 1.6 as bet type is selected as 0.02 in 40 glowing hot slot game
	
	Scenario: Change the bet value to FOUR, click on spin button and check whether current balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.02, bet value as FOUR, bet type & bet values drop down, balance, spin button and win amount
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to FOUR, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by FOUR as bet type is selected as 0.02 & bet type as 4 in 40 glowing hot game
	
	Scenario: Change the bet value as eight, click on spin and check whether existing balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, 40 glowing hot game, bet type as 0.02, bet value as eight, bet value drop down, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to eight, click on spin button and check the 40 glowing hot slot game balance
    Then Existing Balance should get deducted by eight as bet type is selected as 0.02 & bet value as 8 in 40 glowing hot slot game
	
	Scenario: Change the bet value as 16, do the spin and check whether balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.02, bet value as FIVE, balance and spin button
    When Open the 40 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as 16, click on spin button and check the balance
    Then Current Balance should get deducted by 16 as bet type is selected as 0.02 & bet value as 16 in 40 glowing hot game
	

	

	
	
	
	Scenario: Change the bet value as 1.2, do the spin and check whether balance is deducting according to the changed bet type 0.03
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.03 from drop down, bet value as 1.2, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1.2 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 1.2 if bet type is selected as 0.03 in glowing hot game
	
	Scenario: Change the bet value as 2.4, do the spin and check whether balance is deducting according to the changed bet type 0.03
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, bet type as 0.03 from drop down, bet value as 2.4, balance and spin button
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 2.4 from drop down, click on spin button and check the balance
    Then Balance should get deducted by 2.4 if bet type is selected as 0.03 & bet value as 2.4 in glowing hot game
	
	Scenario: Change the bet value as SIX, do the spin and check whether balance is deducting according to the changed bet type 0.03
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.03 from drop down, bet value as SIX from drop down, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 from drop down, select the bet vale as SIX from down, click on spin button and check the balance
    Then Balance should get deducted by SIX if bet type is selected as 0.03 & bet value as 6 in glowing hot game
	
	Scenario: Change the bet value as twelve, do the spin and check whether balance is deducting according to the changed bet type 0.03
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.03 from drop down, bet value as twelve, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as twelve from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by twelve if bet type is selected as 0.03 & bet value as 12 in glowing hot game
	
	Scenario: Change the bet value as 24, do the spin and check whether balance is deducting according to the changed bet type 0.03
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.03 from drop down, bet value as 24, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 24 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 24 if bet type is selected as 0.03 & bet value as 24 in glowing hot game
	
	
	
	
	
	Scenario: Change the bet value as eight, do the spin and check whether balance is deducting according to the changed bet type 0.2
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.2, bet value as eight, balance and spin buttone
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2, click on spin button and check the balance
    Then Balance should get deducted by eight as bet type is selected as 0.2 in glowing hot game
	
	
	Scenario: Change the bet value as 16, do the spin and check whether balance is deducting according to the changed bet type 0.2
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.2, bet value as 16, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as 16, click on spin button and check the balance
    Then Balance should get deducted by 16 as bet type is selected as 0.2 in glowing hot game
	
	
	Scenario: Change the bet value as fourty, do the spin and check whether balance is deducting according to the changed bet type 0.2
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.2, bet value as fourty, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as fourty, click on spin button and check the balance
    Then Balance should get deducted by fourty as bet type is selected as 0.2 in glowing hot game
	
	Scenario: Change the bet value as eighty, do the spin and check whether balance is deducting according to the changed bet type 0.2
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.2, bet value as eighty, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as eighty, click on spin button and check the balance
    Then Balance should get deducted by eighty as bet type is selected as 0.2 in glowing hot game
	
	Scenario: Change the bet value as one sixty, do the spin and check whether balance is deducting according to the changed bet type 0.2
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, bet type as 0.2, bet value as one sixty, balance and spin button
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as one sixty, click on spin button and check the balance
    Then Balance should get deducted by one sixty as bet type is selected as 0.2 in glowing hot game

	
	
	
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in glowing hot slot game
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, balance, credits and denomination as 0.01 
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in glowing hot slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in glowing hot game
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, balance, credits, denomination drop down and denomination as 0.02 
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.02 and check the balance
    Then Balance amound should be same as denomination 0.02 multiplies by credit in glowing hot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in glowing hot slot game
    Given Chrome browser, valid URL, valid login details, glowing hot slot game window, balance, credits, denomination drop down and denomination as 0.03 
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and compare the balance
    Then Balance amound should be same as denomination 0.03 multiplies by credit in golden hot slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.2 in glowing hot slot game
    Given Chrome browser, valid URL, valid login details, glowing hot slot game, balance, credits and denomination drop down & value as 0.2 
    When Open the Glowing hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.2 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 0.2 by credit in 40 glowing hot slot game
	




	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency in 40 glowing hot slot game
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in 40 glowing hot slot game
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in 40 glowing hot slot game
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in 40 glowing hot slot game
	
	
	
		Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, transfer button, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win



	
	
	Scenario: Check whether user able to play the game when there is insufficiant balance in account in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button and validation message
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
    Then Player should be blocked from playing the game when there is no balance in the account in 40 glowing hot game
	
	
	Scenario: Check user instruction messages before and after spin in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button and user instruction message
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
	And User instruction message 'Good Luck' should be displayed after spin button is clicked
	
	
	
	
	Scenario: Navigate to home screen from 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game and home button
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game and click on home button
    Then System should take the player to Home page after clicking on home button from 40 glowing hot game
	
	Scenario: Check the functionality of maximize and minimize button in 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, maximize button and minimize button
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button



	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on 40 glowing hot slot game, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in 40 glowing hot slot game
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in 40 glowing hot slot game
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the 40 glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins in 40 glowing hot slot game
	




	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination 0.4 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.01 and denomination value 0.4
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.01 & denomination  value 0.4 and check payout amount
    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value 0.4 in 40 glowing hot slot game
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination value 0.8 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like cherry n etc, back button, bet type 0.01 and denomination value 0.8
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like cherry n etc, click on back button, select bet type as 0.01 & denomination  value 0.8 and check payout amount
    Then System should display the Payout max amount on each symbol like cherry n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value 0.8 in 40 glowing hot slot game
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination value 2 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like scatter n etc, back button, bet type 0.01 and denomination value 2
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like scatter n etc, click on back button, select bet type as 0.01 & denomination  value 2 and check payout amount
    Then System should display the Payout max amount on each symbol like scatter n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value 2 in 40 glowing hot slot game
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination value 4 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like 777 n etc, back button, bet type 0.01 and denomination value 4
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like 777 n etc, click on back button, select bet type as 0.01 & denomination  value 4 and check payout amount
    Then System should display the Payout max amount on each symbol like 777 n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value 4 in 40 glowing hot slot game
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination value 8 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange n etc, back button, bet type 0.01 and denomination value 8
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange n etc, click on back button, select bet type as 0.01 & denomination  value 8 and check payout amount
    Then System should display the Payout max amount on each symbol like orange n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value 8 in 40 glowing hot slot game
	
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and denomination 0.8 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like bell n etc, back button, bet type 0.02 and denomination value 0.8
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bell, click on back button, select bet type as 0.02 & denomination  value 0.8 and check payout amount
    Then System should display the Payout max amount on each symbol like bell and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination value 0.8 in 40 glowing hot slot game
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and denomination value 1.6 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange n etc, back button, bet type 0.02 and denomination value 1.6
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange n etc, click on back button, select bet type as 0.02 & denomination  value 1.6 and check payout amount
    Then System should display the Payout max amount on each symbol like orange n etc and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination value 1.6 in 40 glowing hot slot game
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and denomination value 4 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like watermelon n etc, back button, bet type 0.02 and denomination value 4
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like watermelon n etc, click on back button, select bet type as 0.02 & denomination  value 4 and check payout amount
    Then System should display the Payout max amount on each symbol like watermelon n etc and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination value 4 in 40 glowing hot slot game
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and denomination value 8 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven n etc, back button, bet type 0.02 and denomination value 8
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like seven n etc, click on back button, select bet type as 0.02 & denomination  value 8 and check payout amount
    Then System should display the Payout max amount on each symbol like seven n etc and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination value 8 in 40 glowing hot slot game
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and denomination value 16 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like cherry n etc, back button, bet type 0.02 and denomination value 16
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like cherry n etc, click on back button, select bet type as 0.02 & denomination  value 16 and check payout amount
    Then System should display the Payout max amount on each symbol like cherry n etc and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination value 16 in 40 glowing hot slot game
	
	
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination 1.2 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven and etc, back button, bet type 0.03 and denomination value 1.2
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like seven, click on back button, select bet type as 0.03 & denomination  value 1.2 and check payout amount
    Then System should display the Payout max amount on each symbol like seven and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 1.2 in 40 glowing hot slot game
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 2.4 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like bar n etc, back button, bet type 0.03 and denomination value 2.4
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bar n etc, click on back button, select bet type as 0.03 & denomination  value 2.4 and check payout amount
    Then System should display the Payout max amount on each symbol like bar n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 2.4 in 40 glowing hot slot game
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value SIX in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange n etc, back button, bet type 0.03 and denomination value SIX
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange n etc, click on back button, select bet type as 0.03 & denomination  value SIX and check payout amount
    Then System should display the Payout max amount on each symbol like orange n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value SIX in 40 glowing hot slot game
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 12 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon n etc, back button, bet type 0.03 and denomination value 12
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like lemon n etc, click on back button, select bet type as 0.03 & denomination  value 12 and check payout amount
    Then System should display the Payout max amount on each symbol like lemon n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 12 in 40 glowing hot slot game
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 24 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like watermelon and etc, back button, bet type 0.03 and denomination value 24
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watermelon and etc, click on back button, select bet type as 0.03 & denomination  value 24 and check payout amount
    Then System should display the Payout max amount on each symbol like watermelon and etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 24 in 40 glowing hot slot game
	
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.2 and denomination EIGHT in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange and etc, back button, bet type 0.2 and denomination value eight
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, click on back button, select bet type as 0.2 & denomination  value eight and check payout amount
    Then System should display the Payout max amount on each symbol like orange and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination value eight in 40 glowing hot slot game
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.2 and denomination value 16 in 40 glowing hot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot game, icon to open payout table, all symbols, max amount on each symbol like scatter n etc, back button, bet type 0.2 and denomination value 16
    When Open the 40 Glowing hot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like scatter n etc, click on back button, select bet type as 0.2 & denomination  value 16 and check payout amount
    Then System should display the Payout max amount on each symbol like scatter n etc and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination value 16 in 40 glowing hot game
	

	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.2 and denomination value 40 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like bell n etc, back button, bet type 0.2 and denomination value 40
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bell n etc, click on back button, select bet type as 0.2 & denomination  value 40 and check payout amount
    Then System should display the Payout max amount on each symbol like bell n etc and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination value 40 in 40 glowing hot slot game
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.2 and denomination value eighty in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven n etc, back button, bet type 0.2 and denomination value eighty
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like seven n etc, click on back button, select bet type as 0.2 & denomination  value eighty and check payout amount
    Then System should display the Payout max amount on each symbol like seven n etc and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination value eighty in 40 glowing hot slot game
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.2 and denomination value 160 in 40 glowing hot slot game 
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, icon to open payout table, all symbols, max amount on each symbol like watermilon and etc, back button, bet type 0.2 and denomination value 160
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watermilon and etc, click on back button, select bet type as 0.2 & denomination  value 160 and check payout amount
    Then System should display the Payout max amount on each symbol like watermilon and etc and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination value 160 in 40 glowing hot slot game
	



	
	Scenario: Check whether system is providing balance in try now feature of Emerald Dice slot game
    Given Chrome browser, valid URL, valid login details, Emerald Dice slot game, try now button and balance to play
    When Open the Emerald Dice slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in 40 glowing hot slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, try now button, balance to play and spin button
    When Open the 40 glowing hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of 40 glowing hotslot game
	
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of 40 glowing hot slot game
    Given Chrome browser, valid URL, valid login details, 40 glowing hot slot game, try now button, balance to play, spin button and win amount
    When Open the 40 glowing hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of 40 glowing hot slot game