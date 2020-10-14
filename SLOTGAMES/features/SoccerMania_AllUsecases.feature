Feature: Test all the functionalities of Soccer Mania Slot Game
   

 	Scenario: To check the transferred amount is added to Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, balance, text field to transfer balance and Ok button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then Player should be blocked from loading the Soccer Mania game when the amount entered in the transfer page is more than the available balance
	And The exact amount entered in the transfer page should transfer to Soccer Mania game and same amount should get displayed on the balance section
	And An error should be displayed if the balance field is empty and player should be blocked from loading the Soccer Mania game
	And An error should be displayed if balance entered was zero and player should be blocked from loading the Soccer Mania game
	



	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.3,0.6,1.5,3,6 in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01 and bet value as 0.3,0.6,1.5,3,6
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value should be 0.3,0.6,1.5,3,6
    Then Bet value should get changed to 0.3,0.6,1.5,3,6 if the bet type selected as 0.01 from the drop down in Soccer Mania slot game
	
	
	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.9,1.8,4.5,9 & 18 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, bet type as 0.03 and bet value as 0.9,1.8,4.5,9 & 18
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value should be 0.9,1.8,4.5,9 & 18
    Then Bet value should get changed to 0.9,1.8,4.5,9 & 18 if the bet type selected as 0.03 from the drop down 1 in Soccer Mania slot game
	
	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 1.5,3,7.5,15,30 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.05 from down 2 and bet value as 1.5,3,7.5,15,30
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from down  and check the bet value should be 1.5,3,7.5,15,30
    Then Bet value should get changed to 1.5,3,7.5,15,30 if the bet type selected as 0.05 from the drop down two in Soccer Mania slot game
	
	Scenario: Select the bet type as 0.2 from the drop down and check the bet value should be 6,12,30,60 & 120in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.2 from drop down and bet value as 6,12,30,60 & 120
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 from drop down and check the bet value should be 6,12,30,60 & 120
    Then Bet value should get changed to 6,12,30,60 & 120 if the bet type selected as 0.2 from the drop down three in Soccer Mania slot game
	
	

	
	Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as 0.3, balance and spin button, balance after spin
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.3, click on spin button and check the balance after spin
    Then Balance should get deducted by 0.3 after spin as bet type is selected as 0.01 and bet value as 0.3 in Soccer Mania game
	
	
	Scenario: Change the bet value as 0.6, do the spin and check whether balance is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, bet type as 0.01, bet value as 0.6, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, click on spin button and check the balance
    Then Balance should get deducted by 0.6 as bet type is selected as 0.01 in Soccer Mania game
	
	
	Scenario: Change the bet value to 1.50, click on spin button and check whether current balance is deducting according to changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as 1.50, balance, spin button and win amount
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 1.50, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by 1.50 as bet type is selected as 0.01 and bet value as 1.50 in Soccer Mania game
	
	
	Scenario: Change the bet value as THREE, do the spin and check whether balance is deducting according to changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as THREE, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THREE, click on spin button and check the balance
    Then Current Balance should get deducted by THREE as bet type is selected as 0.01 and bet value as 3 in Soccer Mania game
	
	
	Scenario: Change the bet value as SIX, click on spin and check whether existing balance is deducting according to changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, bet type as 0.01, bet value as SIX, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to SIX, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by SIX as bet type is selected as 0.01 and bet value as SIX in Soccer Mania slot game
	

	
	
	

	Scenario: Change the bet value as 0.9, do the spin and check whether balance is deducting according to the changed bet type in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, 0.03 as bet type , 0.9 as bet value, balance, spin button and balance after spin
    When Open the Soccer Mania game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.9, click on spin button and check the balance
    Then Balance should get deducted by 0.9 as bet type is selected as 0.03 and bet value as 0.9 in Soccer Mania game
	
	
	Scenario: Change the bet type as 0.03 from drop down & bet value to 1.8 do the spin and check whether balance is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type & bet value drop down, bet type as 0.03, bet value as 1.8, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 from drop down, bet value to 1.8 click on spin button and check the balance after spin
    Then Balance should get deducted by 1.8 if the bet type is selected as 0.03 and bet value as 1.8 in Soccer Mania hot game
	
	
	Scenario: Change the bet value as 4.5, do the spin and check whether balance is deducting according to changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.03, bet value as 4.5, balance and spin button & balance after spin
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 4.5, click on spin button and check the balance
    Then Current Balance should get deducted by 4.5 as bet type is selected as 0.03 & bet value as 4.5 in Soccer Mania game
	
	
	Scenario: Change the bet value to NINE, click on spin button and check whether current balance is deducting according to changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.03, bet value as NINE, bet type & bet values drop down, balance, spin button and balance amount
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to NINE, click on spin button and check the balance
    Then Current Balance should get deducted by 9 as bet type is selected as 0.03 & bet type as NINE in Soccer Mania game
	
	Scenario: Change the bet value as 18, click on spin and check whether existing balance is deducting according to changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, bet type as 0.03, bet value as 18, bet value drop down, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to 18, click on spin button and check the Soccer Mania slot game balance
    Then Existing Balance should get deducted by 18 as bet type is selected as 0.03 & bet value as 18 in Soccer Mania slot game
	
	

	
	
	
	Scenario: Change the bet value as one point five, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.05 from drop down, bet value as one point five, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as one point five from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by one point five if bet type is selected as 0.05 in Soccer Mania game
	
	
	Scenario: Change the bet value as three, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.05 from drop down, bet value as three, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as three from drop down, click on spin button and check the balance
    Then Balance should get deducted by three if bet type is selected as 0.05 & bet value as three in Soccer Mania game
	
	
	Scenario: Change the bet value as seven point five, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.05 from drop down, bet value as seven point five from drop down, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, select the bet vale as seven point five from down, click on spin button and check the balance
    Then Balance should get deducted by seven point five if bet type is selected as 0.05 & bet value as 7.5 in Soccer Mania game
	
	
	Scenario: Change the bet value as 15, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.05 from drop down, bet value as 15, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 15 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 15 if bet type is selected as 0.05 & bet value as 15 in Soccer Mania game
	
	
	Scenario: Change the bet value as thirty, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.05 from drop down, bet value as thirty, balance, spin button and balance after spin
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as thirty from bet type drop down, click on spin button and check the balance after spin
    Then Balance should get deducted by 30 if bet type is selected as 0.05 & bet value as thirty in Soccer Mania slot game
	
	
	
	
	
	Scenario: Change the bet value as SIX(6), do the spin and check whether balance is deducting according to the changed bet type 0.2 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.2, bet value as SIX(6), balance and spin buttone
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as SIX(6), click on spin button and check the balance
    Then Balance should get deducted by SIX(6) as bet type is selected as 0.2 in Soccer Mania game
	
	
	Scenario: Change the bet value as TWELVE(12), do the spin and check whether balance is deducting according to the changed bet type 0.2 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.2, bet value as TWELVE(12), balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as TWELVE(12), click on spin button and check the balance
    Then Balance should get deducted by TWELVE(12) as bet type is selected as 0.2 in Soccer Mania game
	
	
	Scenario: Change the bet value as THIRTY(30), do the spin and check whether balance is deducting according to the changed bet type 0.2 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.2, bet value as THIRTY(30), balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as THIRTY(30), click on spin button and check the balance
    Then Balance should get deducted by THIRTY(30) as bet type is selected as 0.2 in Soccer Mania game
	
	Scenario: Change the bet value as SIXTY, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.2, bet value as SIXTY, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as SIXTY, click on spin button and check the balance
    Then Balance should get deducted by SIXTY as bet type is selected as 0.2 in Soccer Mania game
	
	Scenario: Change the bet value as ONE TWENTY, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.2, bet value as ONE TWENTY, balance and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as ONE TWENTY, click on spin button and check the balance
    Then Balance should get deducted by ONE TWENTY as bet type is selected as 0.2 in Soccer Mania game

	



	
	
   	 Scenario: Change the bet value as THIRTY do the spin and check whether balance in credits is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as THIRTY, balance in credits and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THIRTY, click on spin button and check the balance in credits
    Then Balance should get deducted by THIRTY as bet type is selected as 0.01 and bet value as 30 in Soccer Mania game
    
   	Scenario: Change the bet value as SIXTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as SIXTY, balance in credits and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as SIXTY, click on spin button and check the balance in credits
    Then Balance should get deducted by SIXTY as bet type is selected as 0.01 and bet value as 60 in Soccer Mania game
	
	 Scenario: Change the bet value as ONE FIFTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as ONE FIFTY, balance in credits and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE FIFTY, click on spin button and check the balance in credits
    Then Balance should get deducted by ONE FIFTY, as bet type is selected as 0.01 and bet value as 150 in Soccer Mania game
	
	 Scenario: Change the bet value as THREE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, 20 Blazing slot game, bet type as 0.01, bet value as THREE HUNDRED, balance in credits and spin button
    When Open the Soccer Mania game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THREE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by THREE HUNDRED, as bet type is selected as 0.01 and bet value as 300 in Soccer Mania game
	
	 Scenario: Change the bet value as SIX HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, bet value as SIX HUNDRED, balance in credits and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as SIX HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by SIX HUNDRED, as bet type is selected as 0.01 and bet value as 600 in Soccer Mania game
	
	
	
	
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, credits and denomination as 0.01 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in Soccer Mania slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, credits, denomination drop down and denomination as 0.03 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.03 and check the balance
    Then Balance amound should be same as denomination 0.03 multiplies by credit in Soccer Mania game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game window, balance, credits, denomination drop down and denomination as 0.05 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.05 and compare the balance
    Then Balance amound should be same as denomination 0.05 multiplies by credit balance in Soccer Mania slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.2 in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, credits and denomination drop down & value as 0.2 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.2 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 0.2 by credit in Soccer Mania slot game
	

	
		
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Soccer Mania slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Soccer Mania slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Soccer Mania slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Soccer Mania slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Soccer Mania slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, transfer button, spin button and win amount
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Soccer Mania slot game
    Then Win amount should get added to the balance after win and balance should get increased with win amount in Soccer Mania slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the main balance in credits
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, transfer button, credit balance form, spin button and win amount in credits
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
    Then Win amount should get added to the credit field after win and credit should get increased with win amount in Soccer Mania slot game
	
	

	Scenario: Check whether user able to play the game when there is insufficiant balance in balance counter the bet and credit values are decreased to equal or less than available balance which enables player to resume the game in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance counter, Auto spin button, validation message, credit types and bet types
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Auto spin button till balance counter turns less than betvalues and check the insufficient validation message and reduce the bet and credit values to resume the play.
    Then Player should be blocked from playing the game when there is less amount in balance counter and reducing the credit and bet types player is enable to continue slot game in Soccer Mania game
	

	Scenario: Check user instruction messages before and after spin in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button and user instruction message
    When Open the Soccer Mania hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
	And User instruction message 'Good Luck' should be displayed after spin button is clicked in Soccer Mania slot game

	
	Scenario: Navigate to home screen from Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game and home button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    Then System should take the player to Home page after clicking on home button from Soccer Mania game
	
	
	Scenario: Check the functionality of maximize and minimize button in Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, maximize button and minimize button
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Soccer Mania slot game
	
	
	
	
	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the Soccer Mania  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in Soccer Mania slot game
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Soccer Mania slot game
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins in Soccer Mania slot game
	
	
	
	

	Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
    When Open the Soccer Mania game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable in Soccer Mania slot game
	And Home and Info buttons should not be clickable in Soccer Mania slot game
	And Spin button should not visible & Stop button should be visible and clickable in Soccer Mania slot game
	And Spin button should be visble after clicking on stop button in Soccer Mania slot game
    
    
    Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page
    Then Bet value & Credit value buttons should not be clickable after navigating from gamble page
	And Win amount should get added to the balance during autoplay
 
    
    Scenario: Check whether auto spin is continued even after switching between the tabs inside a browser session of Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, spin button, auto spin button, browser tabs.
    When Open the Soccer Mania slot game by entering the valid URL in browser, click on auto wait for the reel spin, open new browser tabs and redirect to game tab and check the spin functionality
    Then Auto spin should be continued even after switching between the tabs in Soccer Mania slot game
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination 0.3 in Soccer Mania slot game on mobile
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, icon to open payout table, all symbols, max amount on each symbol like ten, hand, back button, bet type 0.01 and deominations 0.3 
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like ten, hand, click on back button, select bet type as 0.01 & deominations as 0.3 and check payout amount
    Then System should display the Payout max amount on each symbol like ten, hand and payout max amount should get changed whenever player changes the bet type to 0.01 and deomination to 0.3 in Soccer Mania slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like A, J as per the bet type 0.01 and denomination 0.6 in Soccer Mania slot game on mobile
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, icon to open payout table, all symbols, max amount on each symbol like A, J, back button, bet type 0.01 and  denomination value as 0.6
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like A, J, click on back button, select bet type as 0.01 & denomination  values as 0.6 and check payout amount
    Then System should display the Payout max amount on each symbol like A, J and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value as 0.6 in Soccer Mania slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like A, K, 10 as per the bet type 0.01 and denomination as 1.5 in Soccer Mania slot game on mobile
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, icon to open payout table, all symbols, max amount on each symbol like A, K, 10 n etc, back button, bet type 0.01 and denomination as 1.5 on mobile
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like A, K, 10 n etc, click on back button, select bet type as 0.01 & denomination as 1.5 and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like A, K, 10 n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination to 1.5 in Soccer Mania slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like J, Wild as per the bet type 0.01 and denomination Three in Soccer Mania slot game on mobile
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, icon to open payout table, all symbols, max amount on each symbol like J, Wild n etc, back button, bet type 0.01 and denomination as Three on mobile
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like J, Wild n etc, click on back button, select bet type as 0.01 & denomination value as Three and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like J, Wild n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to Three in Soccer Mania slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like J, Wild as per the bet type 0.01 and denomination SIX in Soccer Mania slot game on mobile
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, icon to open payout table, all symbols, max amount on each symbol like J, Wild n etc, back button, bet type 0.01 and denomination as SIX on mobile
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like J, Wild n etc, click on back button, select bet type as 0.01 & denomination value as SIX and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like J, Wild n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to SIX in Soccer Mania slot game on mobile
	
	
	



		
	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Soccer Mania slot game 
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Soccer Mania slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Soccer Mania slot game 
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Soccer Mania slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Soccer Mania slot game 
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Soccer Mania slot game 
	

	
	
	
	Scenario: Check whether gamble color win options and game play in landscape mode and verify the win amount in win meter in Soccer Mania slot game 
	Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status 
	When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount
	Then Verify the home button is enabled on the game screen after returning from gamble page
	Then Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in Soccer Mania slot game 
	

	Scenario: Check whether gamble credit win amount is getting added to the balance after win in Soccer Mania game 
	Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
	When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
	Then verify the credit form of currency in gamble page on all fields 
	Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Soccer Mania slot game
	

	Scenario: Check whether resume feature is enabled in Gamble screen, when user collect amount in gamble screen without playing Gamble attempts in Soccer Mania slot game
	Given chrome browser, valid URL, valid login details, Soccer Mania slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect
	When Open the Soccer Mania slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game 
	Then  Resume feature should not be enabled and land on the game screen of Soccer Mania slot game
	
	
	Scenario: Check whether resume feature is enabled in Gamble screen of Soccer Mania slot game
	Given Chrome browser, valid URL, valid login details, Soccer Mania slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session.
	When Open the Soccer Mania slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
	Then  Resume feature should enabled and land on the gamble screen of Soccer Mania slot game
	Then  On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in  Soccer Mania slot game
	
	
	Scenario: Check whether on resume feature is enabled in Gamble screen, user can play further left over attempts and check the attempts before and after resuming to gamble screen in Soccer Mania slot game
	Given chrome browser, valid URL, valid login details, Soccer Mania slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play
	When Open the Soccer Mania slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser
	Then  Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of Soccer Mania slot game
	Then Left over attempts should be  between 4 to 1 and the user is enabled to play the remaining attempts
	
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.3 in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, bet type as 0.01, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.3 in Soccer Mania game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.6 in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as 0.6, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as 0.6, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.6 Soccer Mania game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination one point five in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as one point five, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as one point five, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination one point five in Soccer Mania game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination three in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, transfer button, bet type as 0.01, denomination as three, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.01 & denomination as three, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination three in Soccer Mania game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination six in Soccer Mania game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as six, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as six, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination six in Soccer Mania game

	
	
	
	
	
	Scenario: Check whether system is providing balance in try now feature of Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, try now button and balance to play
    When Open the Soccer Mania slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Soccer Mania slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, try now button, balance to play and spin button
    When Open the Soccer Mania slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Soccer Maniaslot game
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Soccer Mania slot game
    Given Chrome browser, valid URL, valid login details, Soccer Mania slot game, try now button, balance to play, spin button and win amount
    When Open the Soccer Mania slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Soccer Mania slot game