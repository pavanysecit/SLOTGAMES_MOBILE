Feature: Test all the functionalities of Treasure Bonanza Slot Game
   

	Scenario: To check the transferred amount is added to Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, balance, text field to transfer balance and Ok button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then Player should be blocked from loading the Treasure Bonanza game when the amount entered in the transfer page is more than the available balance
	And The exact amount entered in the transfer page should transfer to Treasure Bonanza game and same amount should get displayed on the balance section
	And An error should be displayed if the balance field is empty and player should be blocked from loading the Treasure Bonanza game
	And An error should be displayed if balance entered was zero and player should be blocked from loading the Treasure Bonanza game
	



	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.2,0.4,1,2,4 in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01 and bet value as 0.2,0.4,1,2,4
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
    Then Bet value should get changed to 0.2,0.4,1,2,4 if the bet type selected as 0.01 from the drop down in Treasure Bonanza slot game
	
	
	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.4,0.8,2,4,8 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, bet type as 0.02 and bet value as 0.4,0.8,2,4,8
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet value should be 0.4,0.8,2,4,8
    Then Bet value should get changed to 0.4,0.8,2,4,8 if the bet type selected as 0.02 from the drop down 1 in Treasure Bonanza slot game
	
	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 1,2,5,10,20 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.05 from down 2 and bet value as 1,2,5,10,20
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from down  and check the bet value should be 1,2,5,10,20
    Then Bet value should get changed to 1,2,5,10,20 if the bet type selected as 0.05 from the drop down two in Treasure Bonanza slot game
	
	Scenario: Select the bet type as 0.5 from the drop down and check the bet value should be 10,20,50,100,200 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.5 from drop down and bet value as 10,20,50,100,200
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 from drop down and check the bet value should be 10,20,50,100,200
    Then Bet value should get changed to 10,20,50,100,200 if the bet type selected as 0.5 from the drop down three in Treasure Bonanza slot game
	
	

	
	Scenario: Change the bet value as 0.2, do the spin and check whether balance is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as 0.3, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.2, click on spin button and check the balance
    Then Balance should get deducted by 0.2 as bet type is selected as 0.01 and bet value as 0.2 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, bet type as 0.01, bet value as 0.4, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, click on spin button and check the balance
    Then Balance should get deducted by 0.4 as bet type is selected as 0.01 in Treasure Bonanza game
	
	
	Scenario: Change the bet value to ONE, click on spin button and check whether current balance is deducting according to changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as ONE, balance, spin button and win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by ONE as bet type is selected as 0.01 and bet value as ONE in Treasure Bonanza game
	
	
	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as TWO, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO, click on spin button and check the balance
    Then Current Balance should get deducted by TWO as bet type is selected as 0.01 and bet value as 2 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as FOUR, click on spin and check whether existing balance is deducting according to changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, bet type as 0.01, bet value as FOUR, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to FOUR, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by FOUR as bet type is selected as 0.01 and bet value as FOUR in Treasure Bonanza slot game
	

	
	
	

	Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, 0.02 as bet type , 0.4 as bet value, balance, spin button and win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.4, click on spin button and check the balance
    Then Balance should get deducted by 0.4 as bet type is selected as 0.02 in Treasure Bonanza slot game
	
	
	Scenario: Change the bet type as 0.02 from drop down & bet value to 0.8 do the spin and check whether balance is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type drop down, bet type as 0.02, bet value as 0.8, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 from drop down, bet value to 0.8 click on spin button and check the balance
    Then Balance should get deducted by 0.8 if the bet type is selected as 0.02 in Treasure Bonanza hot game
	
	
	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, bet type as 0.02, bet value as TWO, balance and spin button
    When Open the Treasure Bonanzaslot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TWO, click on spin button and check the balance
    Then Current Balance should get deducted by TWO as bet type is selected as 0.02 & bet value as 2 in Treasure Bonanza game
	
	
	Scenario: Change the bet value to FOUR, click on spin button and check whether current balance is deducting according to changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.02, bet value as FOUR, bet type & bet values drop down, balance, spin button and win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to FOUR, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by FOUR as bet type is selected as 0.02 & bet type as FOUR in Treasure Bonanza game
	
	Scenario: Change the bet value as eight, click on spin and check whether existing balance is deducting according to changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, bet type as 0.02, bet value as eight, bet value drop down, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to eight, click on spin button and check the Treasure Bonanza slot game balance
    Then Existing Balance should get deducted by eight as bet type is selected as 0.02 & bet value as 8 in Treasure Bonanza slot game
	
	

	
	
	
	Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.05 from drop down, bet value as ONE, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by ONE if bet type is selected as 0.05 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as 2, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.05 from drop down, bet value as 2, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 2 from drop down, click on spin button and check the balance
    Then Balance should get deducted by 2 if bet type is selected as 0.05 & bet value as 2 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.05 from drop down, bet value as FIVE from drop down, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, select the bet vale as FIVE from down, click on spin button and check the balance
    Then Balance should get deducted by FIVE if bet type is selected as 0.05 & bet value as 5 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as ten, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.05 from drop down, bet value as ten, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ten from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by ten if bet type is selected as 0.05 & bet value as ten in Treasure Bonanza game
	
	
	Scenario: Change the bet value as twenty, do the spin and check whether balance is deducting according to the changed bet type 0.05 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.05 from drop down, bet value as twenty, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as twenty from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by twenty if bet type is selected as 0.05 & bet value as twenty in Treasure Bonanza game
	
	
	
	
	
	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.5, bet value as TEN, balance and spin buttone
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as TEN, click on spin button and check the balance
    Then Balance should get deducted by TEN as bet type is selected as 0.5 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as twenty, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.5, bet value as twenty, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as twenty, click on spin button and check the balance
    Then Balance should get deducted by twenty as bet type is selected as 0.5 in Treasure Bonanza game
	
	
	Scenario: Change the bet value as fifty, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.5, bet value as fifty, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as fifty, click on spin button and check the balance
    Then Balance should get deducted by fifty as bet type is selected as 0.5 in Treasure Bonanza game
	
	Scenario: Change the bet value as 100, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.5, bet value as 100, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as 100, click on spin button and check the balance
    Then Balance should get deducted by 100 as bet type is selected as 0.5 in Treasure Bonanza game
	
	Scenario: Change the bet value as two hundred, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.5, bet value as two hundred, balance and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as two hundred, click on spin button and check the balance
    Then Balance should get deducted by two hundred as bet type is selected as 0.5 in Treasure Bonanza game

	



	#Balance Deduction in credits
	
   	 Scenario: Change the bet value as TWENTY do the spin and check whether balance in credits is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as TWENTY, balance in credits and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWENTY, click on spin button and check the balance in credits
    Then Balance should get deducted by TWENTY as bet type is selected as 0.01 and bet value as 20 in Treasure Bonanza game
    
   	Scenario: Change the bet value as FOURTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as FOURTY, balance in credits and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOURTY, click on spin button and check the balance in credits
    Then Balance should get deducted by FOURTY as bet type is selected as 0.01 and bet value as 40 in Treasure Bonanza game
	
	 Scenario: Change the bet value as HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as HUNDRED, balance in credits and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by HUNDRED, as bet type is selected as 0.01 and bet value as 100 in Treasure Bonanza game
	
	 Scenario: Change the bet value as TWO HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, 20 Blazing slot game, bet type as 0.01, bet value as TWO HUNDRED, balance in credits and spin button
    When Open the Treasure Bonanza game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by TWO HUNDRED, as bet type is selected as 0.01 and bet value as 200 in Treasure Bonanza game
	
	 Scenario: Change the bet value as FOUR HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, bet value as FOUR HUNDRED, balance in credits and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by FOUR HUNDRED, as bet type is selected as 0.01 and bet value as 400 in Treasure Bonanza game
	
	
	
	
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, credits and denomination as 0.01 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in Treasure Bonanza slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, credits, denomination drop down and denomination as 0.02 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.02 and check the balance
    Then Balance amound should be same as denomination 0.02 multiplies by credit in Treasure Bonanza game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game window, balance, credits, denomination drop down and denomination as 0.05 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.05 and compare the balance
    Then Balance amound should be same as denomination 0.05 multiplies by credit balance in Treasure Bonanza slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.5 in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, credits and denomination drop down & value as 0.5 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.5 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 0.5 by credit in Treasure Bonanza slot game
	

	
		
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the 40 Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Treasure Bonanza slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Treasure Bonanza slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Treasure Bonanza slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Treasure Bonanza slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Treasure Bonanza slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, transfer button, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Treasure Bonanza slot game
    Then Win amount should get added to the balance after win and balance should get increased with win amount in Treasure Bonanza slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the main balance in credits
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, transfer button, credit balance form, spin button and win amount in credits
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
    Then Win amount should get added to the credit field after win and credit should get increased with win amount in Treasure Bonanza slot game
	
	


	
	 Scenario: Check whether user able to play the game when there is insufficiant balance in balance counter the bet and credit values are decreased to equal or less than available balance which enables player to resume the game in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance counter, Auto spin button, validation message, credit types and bet types
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Auto spin button till balance counter turns less than betvalues and check the insufficient validation message and reduce the bet and credit values to resume the play.
    Then Player should be blocked from playing the game when there is less amount in balance counter and reducing the credit and bet types player is enable to continue slot game in Treasure Bonanza game
	
	
	

	Scenario: Check user instruction messages before and after spin in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button and user instruction message
    When Open the Treasure Bonanza hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
	And User instruction message 'Good Luck' should be displayed after spin button is clicked in Treasure Bonanza slot game

	
	Scenario: Navigate to home screen from Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game and home button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    Then System should take the player to Home page after clicking on home button from Treasure Bonanza game
	
	
	Scenario: Check the functionality of maximize and minimize button in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, maximize button and minimize button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Treasure Bonanza slot game
	
	
	
	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the Treasure Bonanza  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in Treasure Bonanza slot game
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Treasure Bonanza slot game
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins in Treasure Bonanza slot game
	
	
	
	
	
		Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
    When Open the Treasure Bonanza game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable in Treasure Bonanza slot game
	And Home and Info buttons should not be clickable in Treasure Bonanza slot game
	And Spin button should not visible & Stop button should be visible and clickable in Treasure Bonanza slot game
	And Spin button should be visble after clicking on stop button in Treasure Bonanza slot game
    
    
    Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page
    Then Bet value & Credit value buttons should not be clickable after navigating from gamble page
	And Win amount should get added to the balance during autoplay
 
    
    Scenario: Check whether auto spin is continued even after switching between the tabs inside a browser session of Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, spin button, auto spin button, browser tabs.
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, click on auto wait for the reel spin, open new browser tabs and redirect to game tab and check the spin functionality
    Then Auto spin should be continued even after switching between the tabs in Treasure Bonanza slot game
	
	
	
	

	
	Scenario: Check whether the max payout amount for each symbol like necklase as per the bet type 0.01 and denomination 0.2 in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like necklase n etc, back button, bet type 0.01 and deominations 0.2 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like necklase n etc, click on back button, select bet type as 0.01 & deominations as 0.2 and check payout amount
    Then System should display the Payout max amount on each symbol like necklase n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and deomination to 0.2 in Treasure Bonanza slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like gold as per the bet type 0.01 and denomination 0.4 in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like gold n etc, back button, bet type 0.01 and  denomination value as 0.4
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like gold n etc, click on back button, select bet type as 0.01 & denomination  values as 0.4 and check payout amount
    Then System should display the Payout max amount on each symbol like gold n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value as 0.4 in Treasure Bonanza slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like ring as per the bet type 0.01 and denomination as ONE in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like ring n etc, back button, bet type 0.01 and denomination as ONE on mobile
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like ring n etc, click on back button, select bet type as 0.01 & denomination as ONE and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like ring n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination to ONE in Treasure Bonanza slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like watch as per the bet type 0.01 and denomination TWO in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like watch n etc, back button, bet type 0.01 and denomination as TWO on mobile
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watch n etc, click on back button, select bet type as 0.01 & denomination value as TWO and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like watch n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to TWO in Treasure Bonanza slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like cash as per the bet type 0.01 and denomination FOUR in Treasure Bonanza slot game on mobile
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like cash n etc, back button, bet type 0.01 and denomination as FOUR on mobile
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like cash n etc, click on back button, select bet type as 0.01 & denomination value as FOUR and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like cash n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to FOUR in Treasure Bonanza slot game on mobile
	
	
	
	
	

		
	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Treasure Bonanza slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Treasure Bonanza slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Treasure Bonanza slot game 
	
	Scenario: Checking whether suit win amount is getting added to balance if it is win else it should not get added in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page
    Then Suit Win amount(4x) should get added to the main balance after win else it should not get added to main balance in the Treasure Bonanza slot game




	Scenario: Check whether gamble color win options and game play in landscape mode and verify the win amount in win meter  in Treasure Bonanza slot game 
	Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status 
	When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount
	Then Verify the home button is enabled on the game screen after returning from gamble page
	Then Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in Treasure Bonanza slot game 
	

	Scenario: Check whether gamble credit win amount is getting added to the balance after win in Treasure Bonanza game 
	Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
	When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
	Then verify the credit form of currency in gamble page on all fields 
	Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Treasure Bonanza slot game
	

	Scenario: Check whether resume feature is enabled in Gamble screen, when user collect amount in gamble screen without playing Gamble attempts in Treasure Bonanza slot game
	Given chrome browser, valid URL, valid login details, Treasure Bonanza slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect
	When Open the Treasure Bonanza slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game 
	Then  Resume feature should not be enabled and land on the game screen of Treasure Bonanza slot game
	
	
	Scenario: Check whether resume feature is enabled in Gamble screen of Treasure Bonanza slot game
	Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session.
	When Open the Treasure Bonanza slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
	Then  Resume feature should enabled and land on the gamble screen of Treasure Bonanza slot game
	Then  On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in  Treasure Bonanza slot game
	
	
	Scenario: Check whether on resume feature is enabled in Gamble screen, user can play further left over attempts and check the attempts before and after resuming to gamble screen in Treasure Bonanza slot game
	Given chrome browser, valid URL, valid login details, Treasure Bonanza slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play
	When Open the Treasure Bonanza slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser
	Then  Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of Treasure Bonanza slot game
	Then Left over attempts should be  between 4 to 1 and the user is enabled to play the remaining attempts
	
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.2 in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type as 0.01, denomination as 0.2, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as 0.2, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.2 in Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.4 in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as 0.4, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as 0.4, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.4 Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination ONE in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination ONE in Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination TWO in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, transfer button, bet type as 0.01, denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.01 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination TWO in Treasure Bonanza game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FOUR in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.01, denomination as FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination FOUR in Treasure Bonanza game
	
	
	

	Scenario: Check whether win amount is displaying as per the gold symbols count configured on the payout table in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination as 0.2 & 4, balance, gold symbols, spin button, win amount, game info page and payout table
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination as 0.2 & 4, click on spin button till player wins, check the gold symbols and its count and navigate to payout table
    Then Win amount should be displayed based on gold symbols & its occurance and should be same as amount configured on the payout table in Treasure Bonanza game
	
	
	Scenario: Check whether win amount is displaying as per the ring symbol count configured on the payout table in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination as 0.2 & 4, balance, ring symbols, spin button, win amount, game info page and payout table
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination as 0.2 & 4, click on spin button till player wins, check the ring symbols and its count and navigate to payout table
    Then Win amount should be displayed based on ring symbols & its occurance and should be same as amount configured on the payout table in Treasure Bonanza game
	
	
	Scenario: Check whether win amount is displaying as per the watch symbol count configured on the payout table in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination as 0.2 & 4, balance, watch symbols, spin button, win amount, game info page and payout table
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination as 0.2 & 4, click on spin button till player wins, check the watch symbols and its count and navigate to payout table
    Then Win amount should be displayed based on watch symbols & its occurance and should be same as amount configured on the payout table in Treasure Bonanza game
	
	
	Scenario: Check whether win amount is displaying as per the necklace symbol count configured on the payout table in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination as 0.2 & 4, balance, necklace symbols, spin button, win amount, game info page and payout table
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination as 0.2 & 4, click on spin button till player wins, check the necklace symbols and its count and navigate to payout table
    Then Win amount should be displayed based on necklace symbols & its occurance and should be same as amount configured on the payout table in Treasure Bonanza game
	



	
#1. TreasureBonanza_AutoSpin_Check_WinAmount_AddedToBalance

	Scenario: Check whether in AutoSpin win amount is added to balance automatically when new spin starts in Treasure Bonanza slot game 
	Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, Autospin button, win amount added to balance
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select autospin, play till win triggers and observe win amount added to main balance in next spin itteration
    Then Automatically Win amount should get added to the main balance after win and balance should get increased with win amount and next spin should continue in Treasure Bonanza slot game
 
#2. TreasureBonanza_AutoSpin_Reload_Option 

 	Scenario: Check whether reload the game while playing Autospin is allowed in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, Autospin button, browser hamburger reload button valid session invalid error message.
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select autospin button, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and autospin should be terminated and informed with valid error message for session invalid in Treasure Bonanza slot game 
 

#3. TreasureBonanza_AutoSpin_Validations_NetworkInteruptions

 	Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, wifi turnOFF and ON, network messages 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin autospin and turn OFF wifi and check for valid message. and turn on wifi for autospin to continued
    Then User is addressed with valid error message 'No Internet' for network interuptions in Treasure Bonanza slot game 
    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interuptions in Treasure Bonanza slot game 


#4. TreasureBonanza_Balance_Check_MaxBet_WinAmount_AddedTo_Balance 
     
    Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, gamble collect, max credit and bet value, win amount added to balance
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble collect, win amount added to main balance
    Then MaxBet Win amount should get added to the main balance after win and balance should get increased with win amount in Treasure Bonanza slot game    

#5. TreasureBonanza_Balance_CreditBalance_For_IncrementalAndDecremental_CreditValue 
      
	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, increment, decrement and balance, balance in credit form, creditvalues
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Treasure Bonanza slot game 
 

#6. TreasureBonanza_Balance_FullAmount_AddedToGame_And_Reload_Option

 	Scenario: Check whether user is allowed to play with full amount in the account in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, Full amount transfer from account to game.
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select game and transfer full amount same amount has to reflect in game balance, play and reload the game 
    Then Remaining balance should be transfered to main account balance in Treasure Bonanza slot game 
 

#7. TreasureBonanza_Balance_InsufficiantBalance_Validation1 

 	Scenario: Check whether user able to play the game when there is insufficiant balance in account and verify when the insuffficient alert popup is displayed with the game buttons during behavior during alert popup in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button and validation message, button behavior, 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message with buttons behavior 
    Then Check the insufficient alert popop is displayed before the clicking on spin 
    Then Player should be blocked from playing the game when there is no balance in the account and buttons are inactive state in Treasure Bonanza game


#8. TreasureBonanza_Check_BetType_BetValue_DropDown_For_IncrementalAndDecremental_CreditValue
   
 	Scenario: Check whether incrementing and decrementing the creditvalue, betval amount are assigned respectively in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, increment, decrement and betvalue amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit and verify the betvalue assigned respectively 
    Then Bet amount for all credit values should be assigned respectively in Treasure Bonanza slot game 


#9. TreasureBonanza_Check_SessionExpired_Messages 
    
 	Scenario: Check whether error messages is displayed on game session is being idle for more than 20minutes in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, full screen, landscape mode ,session terminated messages 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, and full screen and change orientation of the screen, idle for more 20mins  
    Then User is addressed with valid error message on the screen 'Session Expired' in Treasure Bonanza slot game 
    Then Again relauch other slot game and verify user is able to continue gameplay
 

#10. TreasureBonanza_Gamble_GamblePage_NetworkInteruptions 

 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection resume to gamble session in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, gamble screen, wifi turnOFF and ON, network messages 
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin till player wins, selext any gamble option and turn OFF wifi and check for valid message and turn on wifi for gamble to resume if won or go back to game screen
    Then User is addressed with valid error message 'No Internet' for network interuptions in gamble page of Treasure Bonanza slot game 
 
 
#11. TreasureBonanza_Gamble_Reload_Option
 
 	Scenario: Check whether reload the game while playing gamble is allowed in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, gamble page, browser hamburger reload button valid session invalid error message.
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble should won,  click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message and again relauch the game and game session redirected to gamble page in Treasure Bonanza slot game 
 


#12. TreasureBonanza_ManualSpin_Validations_ButtonsBehavior

 	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, spin button and check for buttons behavior & functionality
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable under spin condition in Treasure Bonanza slot game
	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Treasure Bonanza slot game
	And Spin button should be disabled during reel spin in Treasure Bonanza slot game
	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Treasure Bonanza slot game
	And Gamble button behaviour under win triggered and disabled when next spin starts in Treasure Bonanza slot game
	

#13. TreasureBonanza_Reload_Option 

 	Scenario: Check whether reload the game is allowed in Treasure Bonanza slot game 
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, browser hamburger reload button valid session invalid error message.
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message in Treasure Bonanza slot game 


	
	
	
	
	Scenario: Check whether system is providing balance in try now feature of Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, try now button and balance to play
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Treasure Bonanza slot game
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, try now button, balance to play and spin button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Treasure Bonanzaslot game
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Treasure Bonanza slot game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, try now button, balance to play, spin button and win amount
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Treasure Bonanza slot game