Feature: Test all the functionalities of 100 Splendid Hot Slot Game
   

  	Scenario: To check the transferred amount is added to 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, balance, text field to transfer balance and Ok button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then Player should be blocked from loading the 100 Splendid Hot game when the amount entered in the transfer page is more than the available balance
	And The exact amount entered in the transfer page should transfer to 100 Splendid Hot game and same amount should get displayed on the balance section
	And An error should be displayed if the balance field is empty and player should be blocked from loading the 100 Splendid Hot game
	And An error should be displayed if balance entered was zero and player should be blocked from loading the 100 Splendid Hot game
	



	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 1,2,3,4 & 5 in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01 and bet value as 1,2,3,4 & 5
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value should be 1,2,3,4 & 5
    Then Bet value should get changed to 1,2,3,4 & 5 if the bet type selected as 0.01 from the drop down in 100 Splendid Hot slot game
	
	
	Scenario: Select the bet type as 0.04 from the drop down and check the bet value should be 4,8,12,16 & 20 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, bet type as 0.04 and bet value as 4,8,12,16 & 20
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04 and check the bet value should be 4,8,12,16 and 20
    Then Bet value should get changed to 4,8,12,16 & 20 if the bet type selected as 0.04 from the drop down 1 in 100 Splendid Hot slot game
	
	
	Scenario: Select the bet type as 0.06 from the drop down and check the bet value should be 6,12,18,24 & 30 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.06 from down 2 and bet value as 6,12,18,24 & 30
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid logi., n details, select the bet type as 0.06 from down  and check the bet value should be 6,12,18,24 & 30
    Then Bet value should get changed to 6,12,18,24 & 30 if the bet type selected as 0.06 from the drop down two in 100 Splendid Hot slot game
	
	
	Scenario: Select the bet type as 0.4 from the drop down and check the bet value should be 40,80,120,160 & 200 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.4 from drop down and bet value as 40,80,120,160 & 200
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 from drop down and check the bet value should be 40,80,120,160 & 200
    Then Bet value should get changed to 40,80,120,160 & 200 if the bet type selected as 0.4 from the drop down three in 100 Splendid Hot slot game
	
	

	
	Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as ONE, balance and spin button, balance after spin
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE, click on spin button and check the balance after spin
    Then Balance should get deducted by ONE after spin as bet type is selected as 0.01 and bet value as ONE in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, bet type as 0.01, bet value as TWO, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO, click on spin button and check the balance
    Then Balance should get deducted by TWO as bet type is selected as 0.01 in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as THREE, click on spin and check whether existing balance is deducting according to changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, bet type as 0.01, bet value as THREE, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to THREE, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by THREE as bet type is selected as 0.01 and bet value as THREE in 100 Splendid Hot slot game
	
	
	Scenario: Change the bet value to FOUR, click on spin button and check whether current balance is deducting according to changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as FOUR, balance, spin button and win amount
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by FOUR as bet type is selected as 0.01 and bet value as FOUR in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as FIVE, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FIVE, click on spin button and check the balance
    Then Current Balance should get deducted by FIVE as bet type is selected as 0.01 and bet value as FIVE in 100 Splendid Hot game
	
	
	
	

	
	Scenario: Change the bet value as FOUR, do the spin and check whether balance is deducting according to the changed bet type in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, 0.04 as bet type , FOUR as bet value, balance, spin button and balance after spin
    When Open the 100 Splendid Hot game by entering the valid URL in browser, enter the valid login details, select the bet value to FOUR, click on spin button and check the balance
    Then Balance should get deducted by FOUR as bet type is selected as 0.04 and bet value as FOUR in 100 Splendid Hot game
	
	
	Scenario: Change the bet type as 0.04 from drop down & bet value to EIGHT do the spin and check whether balance is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type & bet value drop down, bet type as 0.04, bet value as EIGHT, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04 from drop down, bet value to EIGHT click on spin button and check the balance after spin
    Then Balance should get deducted by EIGHT if the bet type is selected as 0.04 and bet value as EIGHT in 100 Splendid Hot hot game
	
	
	Scenario: Change the bet value as TWELVE, click on spin and check whether existing balance is deducting according to changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, bet type as 0.04, bet value as TWELVE, bet value drop down, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04, select the bet value to TWELVE, click on spin button and check the 100 Splendid Hot slot game balance
    Then Existing Balance should get deducted by TWELVE as bet type is selected as 0.04 & bet value as TWELVE in 100 Splendid Hot slot game
	
	
	Scenario: Change the bet value to SIXTEEN, click on spin button and check whether current balance is deducting according to changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.04, bet value as SIXTEEN, bet type & bet values drop down, balance, spin button and balance amount
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04, select the bet value to SIXTEEN, click on spin button and check the balance
    Then Current Balance should get deducted by SIXTEEN as bet type is selected as 0.04 & bet type as SIXTEEN in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as TWENTY, do the spin and check whether balance is deducting according to changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, bet type as 0.04, bet value as TWENTY, balance, spin button and balance after spin
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04, select the denomination as TWENTY, click on spin button and check the balance
    Then Current Balance should get deducted by TWENTY as bet type is selected as 0.04 & bet value as TWENTY in 100 Splendid Hot game

	
	
	
	
	
	
	Scenario: Change the bet value as 0.06, do the spin and check whether balance is deducting according to the changed bet type ONE in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as ONE from drop down, bet value as 0.06, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.06 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 0.06 if bet type is selected as ONE in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to the changed bet type 0.06 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, bet type as 0.06 from drop down, bet value as TWO, balance and spin button
    When Open the 100 Splendid Hot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.06 from drop down, click on spin button and check the balance
    Then Balance should get deducted by TWO after spin if bet type is selected as 0.06 & bet value as TWO in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.06 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.06 from drop down, bet value as FIVE from drop down, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.06 from drop down, select the bet vale as FIVE from down, click on spin button and check the balance
    Then Balance should get deducted by FIVE if bet type is selected as 0.06 & bet value as FIVE in 100 Splendid Hot game
	
		
	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.06 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.06 from drop down, bet value as TEN, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TEN from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by TEN if bet type is selected as 0.06 & bet value as TEN in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as TWENTY, do the spin and check whether balance is deducting according to the changed bet type 0.06 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.06 from drop down, bet value as TWENTY, balance, spin button and balance after spin
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TWENTY from bet type drop down, click on spin button and check the balance after spin
    Then Balance should get deducted by TWENTY if bet type is selected as 0.06 & bet value as 20 in 100 Splendid Hot slot game
	


	
	
	
	Scenario: Change the bet value as FOURTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.4, bet value as FOURTY, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as FOURTY, click on spin button and check the balance
    Then Balance should get deducted by FOURTY as bet type is selected as 0.4 in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as EIGHTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.4, bet value as EIGHTY, balance and spin buttone
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as EIGHTY, click on spin button and check the balance
    Then Balance should get deducted by EIGHTY as bet type is selected as 0.4 in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as ONE TWENTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.4, bet value as ONE TWENTY, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as ONE TWENTY, click on spin button and check the balance
    Then Balance should get deducted by ONE TWENTY as bet type is selected as 0.4 in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as ONE SIXTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.4, bet value as ONE SIXTY, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as ONE SIXTY, click on spin button and check the balance
    Then Balance should get deducted by ONE SIXTY as bet type is selected as 0.4 in 100 Splendid Hot game
	
	
	Scenario: Change the bet value as TWO HUNDRED, do the spin and check whether balance is deducting according to the changed bet type 0.4 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.4, bet value as TWO HUNDRED, balance and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as TWO HUNDRED, click on spin button and check the balance
    Then Balance should get deducted by TWO HUNDRED as bet type is selected as 0.4 in 100 Splendid Hot game
	
	

	

	
	Scenario: Change the bet value as ONE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as ONE HUNDRED, balance in credits and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by ONE HUNDRED as bet type is selected as 0.01 and bet value as 100 in 100 Splendid Hot game
	
	
	 Scenario: Change the bet value as TWO HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as TWO HUNDRED, balance in credits and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by TWO HUNDRED, as bet type is selected as 0.01 and bet value as 200 in 100 Splendid Hot game
	
	
	 Scenario: Change the bet value as THREE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid slot game, bet type as 0.01, bet value as THREE HUNDRED, balance in credits and spin button
    When Open the 100 Splendid Hot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THREE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by THREE HUNDRED, as bet type is selected as 0.01 and bet value as 300 in 100 Splendid Hot game
	
	
	 Scenario: Change the bet value as FOUR HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as FOUR HUNDRED, balance in credits and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by FOUR HUNDRED, as bet type is selected as 0.01 and bet value as 400 in 100 Splendid Hot game
	
	
	 Scenario: Change the bet value as FIVE HUNDRED do the spin and check whether balance in credits is deducting according to the changed bet type in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, bet value as FIVE HUNDRED, balance in credits and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FIVE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by FIVE HUNDRED as bet type is selected as 0.01 and bet value as 500 in 100 Splendid Hot game
	
	


	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, credits and denomination as 0.01 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in 100 Splendid Hot slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.04 in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, credits, denomination drop down and denomination as 0.04 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.04 and check the balance
    Then Balance amound should be same as denomination 0.04 multiplies by credit in 100 Splendid Hot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.06 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game window, balance, credits, denomination drop down and denomination as 0.06 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.06 and compare the balance
    Then Balance amound should be same as denomination 0.06 multiplies by credit balance in 100 Splendid Hot slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.4 in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, credits and denomination drop down & value as 0.4
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.4 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 0.4 by credit in 100 Splendid Hot slot game
	


	
		
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on 100 Splendid Hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency in 100 Splendid Hot slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in 100 Splendid Hot slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in 100 Splendid Hot slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in 100 Splendid Hot slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, transfer button, spin button and win amount
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in 100 Splendid Hot slot game
    Then Win amount should get added to the balance after win and balance should get increased with win amount in 100 Splendid Hot slot game
	
	
	Scenario: Check whether winning amount is getting added to the main balance in credits
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, transfer button, credit balance form, spin button and win amount in credits
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
    Then Win amount should get added to the credit field after win and credit should get increased with win amount in 100 Splendid hot game
	
	
	
	
	 Scenario: Check whether user able to play the game when there is insufficiant balance in balance counter the bet and credit values are decreased to equal or less than available balance which enables player to resume the game in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance counter, Auto spin button, validation message, credit types and bet types
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Auto spin button till balance counter turns less than betvalues and check the insufficient validation message and reduce the bet and credit values to resume the play.
    Then Player should be blocked from playing the game when there is less amount in balance counter and reducing the credit and bet types player is enable to continue slot game in 100 Splendid Hot game
	

	Scenario: Check user instruction messages before and after spin in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button and user instruction message
    When Open the 100 Splendid Hot hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
	And User instruction message 'Good Luck' should be displayed after spin button is clicked in 100 Splendid Hot slot game

	
	Scenario: Navigate to home screen from 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game and home button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    Then System should take the player to Home page after clicking on home button from 100 Splendid Hot game
	
	
	Scenario: Check the functionality of maximize and minimize button in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, maximize button and minimize button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in 100 Splendid Hot slot game
	
	

	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the 100 Splendid Hot  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in 100 Splendid Hot slot game
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in 100 Splendid Hot slot game
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins in 100 Splendid Hot slot game
	
	
	Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
    When Open the 100 Splendid Hot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable
	And Home and Info buttons should not be clickable
	And Spin button should not visible & Stop button should be visible and clickable
	And Spin button should be visble after clicking on stop button
    
    
    Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page
    Then Bet value & Credit value buttons should not be clickable after navigating from gamble page
	And Win amount should get added to the balance during autoplay
 
    
    Scenario: Check whether auto spin is continued even after switching between the tabs inside a browser session of 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, spin button, auto spin button, browser tabs.
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, click on auto wait for the reel spin, open new browser tabs and redirect to game tab and check the spin functionality
    Then Auto spin should be continued even after switching between the tabs in 100 Splendid Hot slot game
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol like seven & scatter as per the bet type 0.01 and denomination ONE in 100 Splendid Hot slot game on mobile
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven & scatter, back button, bet type 0.01 and denomination as ONE on mobile
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like seven & scatter, click on back button, select bet type as 0.01 & denomination value as ONE and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like seven & scatter and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to ONE in 100 Splendid Hot slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination TWO in 100 Splendid Hot slot game on mobile
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon & etc, back button, bet type 0.01 and deominations TWO 
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like lemon & etc, click on back button, select bet type as 0.01 & deominations as TWO and check payout amount
    Then System should display the Payout max amount on each symbol like lemon & etc and payout max amount should get changed whenever player changes the bet type to 0.01 and deomination to TWO in 100 Splendid Hot slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like watermelon & etc as per the bet type 0.01 and denomination THREE in 100 Splendid Hot slot game on mobile
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like watermelon & etc, back button, bet type 0.01 and denomination value as THREE
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watermelon & etc, click on back button, select bet type as 0.01 & denomination  values as THREE and check payout amount
    Then System should display the Payout max amount on each symbol like watermelon & etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value as THREE in 100 Splendid Hot slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like grapes, cherry & etc as per the bet type 0.01 and denomination FOUR in 100 Splendid Hot slot game on mobile
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, cherry & etc etc, back button, bet type 0.01 and denomination as FOUR on mobile
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, cherry & etc etc, click on back button, select bet type as 0.01 & denomination value as FOUR and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like orange, cherry & etc etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to FOUR in 100 Splendid Hot slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like grapes, plum & etc as per the bet type 0.01 and denomination as FIVE in 100 Splendid Hot slot game on mobile
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like grapes, plum & etc, back button, bet type 0.01 and denomination as FIVE on mobile
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like grapes, plum & etc, click on back button, select bet type as 0.01 & denomination as FIVE and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like grapes, plum & etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination to FIVE in 100 Splendid Hot slot game on mobile
	
	

	

		
	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of 100 Splendid Hot slot game 
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the 100 Splendid Hot slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of 100 Splendid Hot slot game 
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the 100 Splendid Hot slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in 100 Splendid Hot slot game 
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in 100 Splendid Hot slot game 
	


	Scenario: Check whether on resume feature is enabled in Gamble screen, user can play further left over attempts and check the attempts before and after resuming to gamble screen in 100 Splendid Hot slot game
	Given chrome browser, valid URL, valid login details, 100 Splendid Hot slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play
	When Open the 100 Splendid Hot slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser
	Then  Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of 100 Splendid Hot slot game
	Then Left over attempts should be  between 4 to 1 and the user is enabled to play the remaining attempts


	Scenario: Check whether gamble credit win amount is getting added to the balance after win in 100 Splendid Hot game 
	Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
	When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
	Then verify the credit form of currency in gamble page on all fields 
	Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in 100 Splendid Hot slot game 



	Scenario: Check whether gamble color win options and game play in landscape mode and verify the win amount in win meter in 100 Splendid Hot slot game 
	Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status 
	When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount
	Then Verify the home button is enabled on the game screen after returning from gamble page
	Then Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in 100 Splendid Hot slot game 


	Scenario: Check whether resume feature is enabled in Gamble screen, when user collect amount in gamble screen without playing Gamble attempts in 100 Splendid Hot slot game
	Given chrome browser, valid URL, valid login details, 100 Splendid Hot slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect
	When Open the 100 Splendid Hot slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game 
	Then  Resume feature should not be enabled and land on the game screen of 100 Splendid Hot slot game


	Scenario: Check whether resume feature is enabled in Gamble screen of 100 Splendid Hot slot game
	Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session.
	When Open the 100 Splendid Hot slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
	Then  Resume feature should enabled and land on the gamble screen of 100 Splendid Hot slot game
	Then  On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in 100 Splendid Hot slot game
	
	
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination ONE in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination ONE 100 Splendid Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination TWO in 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, transfer button, bet type as 0.01, denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.01 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination TWO in 100 Splendid Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination THREE in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, denomination as THREE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as THREE, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination THREE in 100 Splendid Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FOUR in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, denomination as FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination FOUR in 100 Splendid Hot game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FIVE in 100 Splendid Hot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, bet type as 0.01, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination FIVE in 100 Splendid Hot game



	
	
	Scenario: Check whether system is providing balance in try now feature of 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, try now button and balance to play
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in 100 Splendid Hot slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, try now button, balance to play and spin button
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of 100 Splendid Hotslot game
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of 100 Splendid Hot slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid Hot slot game, try now button, balance to play, spin button and win amount
    When Open the 100 Splendid Hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of 100 Splendid Hot slot game