Feature: Test all the functionalities of Golden Hot Slot Game
   
    Scenario: Load the website with valid URL
    Given Chrome browser, valid URL and Go button 
    When Open the chrome browser, Enter the valid URL and click on Go button
    Then User should be able to see the welcome page of the website
	
	Scenario: Load the website with invalid URL
    Given Chrome browser, Invalid URL and Go button 
    When Open the chrome browser, Enter the Invalid URL and click on Go button
    Then User should not be able to login to the website
	
	Scenario: Login with valid Online account details for authentication
    Given Chrome browser, valid URL, Go button, valid account id, valid password and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter valid account id & password and click on Login butotn
    Then User should be able to login website successfully post entering valid online account details and online account balance should be displayed
	
	Scenario: Login with Invalid Online account details for authentication
    Given Chrome browser, valid URL, Go button, Invalid account id, valid password and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter invalid account id & password and click on Login butotn
    Then User should be failed to login the website post entering invalid account details
	
	
	
	
	
	
	Scenario: Login with valid Email account details for authentication
    Given Chrome browser, valid URL, Go button, valid email id, valid password and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter valid email id & password and click on Login butotn
    Then User should be able to login to website successfully post entering valid email account details and balance should be displayed
	
	Scenario: Login with Invalid email account details for authentication
    Given Chrome browser, valid URL, Go button, Invalid email id, valid password and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter invalid email id & password and click on Login butotn
    Then User should be failed to login to the website post entering invalid email id
	
	Scenario: Login with valid mobile number for authentication
    Given Chrome browser, valid URL, Go button, valid mobile number, valid password and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter valid mobile number & password and click on Login butotn
    Then User should be able to login to website successfully post entering valid mobile number and balance should be displayed
	
	Scenario: Login with Invalid mobile number for authentication
    Given Chrome browser, valid URL, Go button, Invalid mobile number, valid password and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter invalid mobile number & password and click on Login butotn
    Then User should be failed to login to the website post entering invalid mobile number
	
	Scenario: Login with valid card details for authentication
    Given Chrome browser, valid URL, Go button, valid card number, valid card pin and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter valid card number & valid card pin and click on Login butotn
    Then User should be able to login to website successfully post entering valid card details and card balance should be displayed
	
	Scenario: Login with Invalid card details for authentication
    Given Chrome browser, valid URL, Go button, Invalid card number, card pin and login button
    When Open the chrome browser, Enter the valid URL, click on Go button, click on golden hot game, enter invalid card number & card pin and click on Login butotn
    Then User should be failed to login to the website post entering invalid card details
	
	
	Scenario: To check the transferred amount is added to game
    Given Chrome browser, valid URL, valid login details, balance, text field to transfer balance and Ok button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then The exact amount entered in the transfer page should transfer to game and same amount should get displayed on the balance section
	
	
	Scenario: Check whether the player is able to transfer the amount more than the available balance
    Given Chrome browser, valid URL, valid login details, balance greater than available balance, text field to transfer balance, Ok button and validation message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
    Then Player should be blocked from loading the game when the amount entered in the transfer page is more than the available balance
	
	
	Scenario: Check whether balance field is accepting null valuess in the transfer page 
    Given Chrome browser, valid URL, valid login details, empty balance, text field to transfer balance, Ok button and validation message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok butotn
    Then An error should be displayed if the balance field is empty and player should be blocked from loading the game
	
	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page
    Given Chrome browser, valid URL, valid login details, zero balance, text field to transfer balance, Ok button and validation message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn
    Then An error should be displayed if balance entered was zero and player should be blocked from loading the game
	

		
	Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, transfer button, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
    Then Win amount should get added to the balance after win and balance should get increased with win amount
	

	
	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.15 in golden hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.03 and bet value 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value
    Then Bet value should get changed to 0.15 if the bet type selected as 0.03 from the drop down in golden hot game
	
	
	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.25 in golden hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.05 and bet value as 0.25
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 and check the bet value should be 0.25
    Then Bet value should get changed to 0.25 if the bet type selected as 0.05 from the drop down 1 in golden hot game
	
	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 0.5 in golden hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.1 from down 2 and bet value as 0.5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from down 2 and check the bet value should be 0.5
    Then Bet value should get changed to 0.5 if the bet type selected as 0.1 from the drop down two in golden hot game
	
	Scenario: Select the bet type as ONE from the drop down and check the bet value should be FIVE in golden hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as ONE from drop down and bet value as FIVE
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE from drop down and check the bet value should be FIVE
    Then Bet value should get changed to FIVE if the bet type selected as ONE from the drop down two in golden hot game
	
	
	
	Scenario: Change the bet value as 0.15, do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.03, bet value as 0.15, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, click on spin button and check the balance
    Then Balance should get deducted by 0.15 as bet type is selected as 0.03 in golden hot game
	
	
	Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.03, bet value as 0.3, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.3, click on spin button and check the balance
    Then Balance should get deducted by 0.3 as bet type is selected as 0.03 and bet value as 0.3 in golden hot game
	
	Scenario: Change the bet value to 0.75, click on spin button and check whether current balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.03, bet value as 0.75, balance, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.75, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by 0.75 as bet type is selected as 0.03 and bet value as 0.75 in golden hot game
	
	Scenario: Change the bet value as 1.5, click on spin and check whether existing balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot game, bet type as 0.03, bet value as 1.5, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to 1.5, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by 1.5 as bet type is selected as 0.03 and bet value as 1.5 in golden hot slot game
	
	Scenario: Change the bet value as THREE, do the spin and check whether balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.03, bet value as THREE, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as THREE, click on spin button and check the balance
    Then Current Balance should get deducted by THREE as bet type is selected as 0.03 and bet value as 3 in golden hot game
	
	

	
	Scenario: Change the bet type as 0.05 from drop down & bet value to 0.25 do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type drop down, bet type as 0.05, bet value as 0.25, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, bet value to 0.25 click on spin button and check the balance
    Then Balance should get deducted by 0.25 if the bet type is selected as 0.05 in golden slot hot game
	
	
	Scenario: Change the bet value as 0.5, do the spin and check whether balance is deducting according to the changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot game, 0.05 as bet type , 0.5 as bet value, balance, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.5, click on spin button and check the balance
    Then Balance should get deducted by 0.5 as bet type is selected as 0.05 in golden hot slot game
	
	Scenario: Change the bet value to 1.25, click on spin button and check whether current balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.05, bet value as 1.25, bet type & bet values drop down, balance, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to 1.25, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by 1.25 as bet type is selected as 0.05 & bet type as 1.25 in golden hot game
	
	Scenario: Change the bet value as 2.5, click on spin and check whether existing balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot game, bet type as 0.05, bet value as 2.5, bet value drop down, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to 2.5, click on spin button and check the golden hot slot game balance
    Then Existing Balance should get deducted by 2.5 as bet type is selected as 0.05 & bet value as 2.5 in golden hot slot game
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to changed bet type
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.05, bet value as FIVE, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value as FIVE, click on spin button and check the balance
    Then Current Balance should get deducted by FIVE as bet type is selected as 0.05 & bet value as 5 in golden hot game
	

	
	
	
	
	Scenario: Change the bet value as 0.50, do the spin and check whether balance is deducting according to the changed bet type 0.1
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.1 from drop down, bet value as 0.50, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.50 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 0.50 if bet type is selected as 0.1 in golden hot game
	
	Scenario: Change the bet value as 1, do the spin and check whether balance is deducting according to the changed bet type 0.1
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.1 from drop down, bet value as 1, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 1 if bet type is selected as 0.1 & bet value as 1 in golden hot game
	
	Scenario: Change the bet value as 2.5, do the spin and check whether balance is deducting according to the changed bet type 0.1
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.1 from drop down, bet value as 2.5 from drop down, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, select the bet vale as 2.5 from down, click on spin button and check the balance
    Then Balance should get deducted by 2.5 if bet type is selected as 0.1 & bet value as 2.5 in golden hot game
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.1
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.1 from drop down, bet value as FIVE, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as FIVE from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by FIVE if bet type is selected as 0.1 & bet value as 5 in golden hot game
	
	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.1
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.1 from drop down, bet value as TEN, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TEN from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by TEN if bet type is selected as 0.1 & bet value as 10 in golden hot game
	
	
	
	
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type One
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as ONE, bet value as FIVE, balance and spin buttone
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE, click on spin button and check the balance
    Then Balance should get deducted by FIVE as bet type is selected as ONE in golden hot game
	
	
	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type ONE
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as ONE, bet value as TEN, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as TEN, click on spin button and check the balance
    Then Balance should get deducted by TEN as bet type is selected as ONE in golden hot game
	
	
	Scenario: Change the bet value as twenty five, do the spin and check whether balance is deducting according to the changed bet type ONE
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as ONE, bet value as twenty five, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as twenty five, click on spin button and check the balance
    Then Balance should get deducted by twenty five as bet type is selected as ONE in golden hot game
	
	Scenario: Change the bet value as FIFTY, do the spin and check whether balance is deducting according to the changed bet type ONE
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as ONE, bet value as FIFTY, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as FIFTY, click on spin button and check the balance
    Then Balance should get deducted by FIFTY as bet type is selected as ONE in golden hot game
	
	Scenario: Change the bet value as HUNDRED, do the spin and check whether balance is deducting according to the changed bet type ONE
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as ONE, bet value as HUNDRED, balance and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as HUNDRED, click on spin button and check the balance
    Then Balance should get deducted by HUNDRED as bet type is selected as ONE in golden hot game

	
	
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in golden hot
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, credits and denomination as 0.03 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and check the balance
    Then Balance amound should be same as denomination 0.03 multiplies by credit in golden hot
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in golden hot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, credits, denomination drop down and denomination as 0.05 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
    Then Balance amound should be same as denomination 0.05 multiplies by credit in golden hot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game window, balance, credits, denomination drop down and denomination as 0.1 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
    Then Balance amound should be same as denomination 0.1 multiplies by credit in golden hot slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination ONE in golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, credits and denomination as ONE 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by ONE and check the balance
    Then Balance amound should be same as denomination ONE multiplies by credit
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency 
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency 
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency 
	
	
	
	
	
	Scenario: Check whether user able to play the game when there is insufficiant balance in account in golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button and validation message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
    Then Player should be blocked from playing the game when there is no balance in the account in golden hot game
	
	
	Scenario: Check user instruction messages before and after spin in golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button and user instruction message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
	And User instruction message 'Good Luck' should be displayed after spin button is clicked
	
	
	
	
	Scenario: Navigate to home screen from golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game and home button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game and click on home button
    Then System should take the player to Home page after clicking on home button
	
	Scenario: Check the functionality of maximize and minimize button in golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, maximize button and minimize button
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button
	
	
	
	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins 
	


	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination 0.15 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.03 and denomination value 0.15
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.03 & denomination  value 0.15 and check payout amount
    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 0.15
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 0.3 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like cherry n etc, back button, bet type 0.03 and denomination value 0.3
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like cherry n etc, click on back button, select bet type as 0.03 & denomination  value 0.3 and check payout amount
    Then System should display the Payout max amount on each symbol like cherry n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 0.3
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 0.75 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like stars n etc, back button, bet type 0.03 and denomination value 0.75
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like stars n etc, click on back button, select bet type as 0.03 & denomination  value 0.75 and check payout amount
    Then System should display the Payout max amount on each symbol like stars n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 0.75
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 1.5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon n etc, back button, bet type 0.03 and denomination value 1.5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like lemon n etc, click on back button, select bet type as 0.03 & denomination  value 0.75 and check payout amount
    Then System should display the Payout max amount on each symbol like lemon n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 1.5
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination value 3 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange n etc, back button, bet type 0.03 and denomination value 3
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like orange n etc, click on back button, select bet type as 0.03 & denomination  value 3 and check payout amount
    Then System should display the Payout max amount on each symbol like orange n etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value 3
	
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and denomination 0.25 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like bell n etc, back button, bet type 0.05 and denomination value 0.25
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like bell, click on back button, select bet type as 0.05 & denomination  value 0.25 and check payout amount
    Then System should display the Payout max amount on each symbol like bell and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination value 0.25
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and denomination value 0.5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange n etc, back button, bet type 0.05 and denomination value 0.5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like orange n etc, click on back button, select bet type as 0.05 & denomination  value 0.5 and check payout amount
    Then System should display the Payout max amount on each symbol like orange n etc and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination value 0.5
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and denomination value 1.25 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like bar n etc, back button, bet type 0.05 and denomination value 1.25
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like bar n etc, click on back button, select bet type as 0.05 & denomination  value 1.25 and check payout amount
    Then System should display the Payout max amount on each symbol like bar n etc and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination value 1.25
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and denomination value 2.5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven n etc, back button, bet type 0.05 and denomination value 2.5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like seven n etc, click on back button, select bet type as 0.05 & denomination  value 2.5 and check payout amount
    Then System should display the Payout max amount on each symbol like seven n etc and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination value 2.5
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and denomination value 5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like plum n etc, back button, bet type 0.05 and denomination value 5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like plum n etc, click on back button, select bet type as 0.05 & denomination  value 5 and check payout amount
    Then System should display the Payout max amount on each symbol like plum n etc and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination value 5
	
	
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.1 and denomination 0.5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven and etc, back button, bet type 0.1 and denomination value 0.5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like seven, click on back button, select bet type as 0.1 & denomination  value 0.5 and check payout amount
    Then System should display the Payout max amount on each symbol like seven and payout max amount should get changed whenever player changes the bet type to 0.1 and denomination value 0.5
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.1 and denomination value 1 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like bar n etc, back button, bet type 0.1 and denomination value 1
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like bar n etc, click on back button, select bet type as 0.1 & denomination  value 1 and check payout amount
    Then System should display the Payout max amount on each symbol like bar n etc and payout max amount should get changed whenever player changes the bet type to 0.1 and denomination value 1
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.1 and denomination value 2.5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like star n etc, back button, bet type 0.1 and denomination value 2.5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like star n etc, click on back button, select bet type as 0.1 & denomination  value 2.5 and check payout amount
    Then System should display the Payout max amount on each symbol like star n etc and payout max amount should get changed whenever player changes the bet type to 0.1 and denomination value 2.5
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.1 and denomination value 5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon n etc, back button, bet type 0.1 and denomination value 5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like lemon n etc, click on back button, select bet type as 0.1 & denomination  value 5 and check payout amount
    Then System should display the Payout max amount on each symbol like lemon n etc and payout max amount should get changed whenever player changes the bet type to 0.1 and denomination value 5
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 0.1 and denomination value 10 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange and etc, back button, bet type 0.1 and denomination value 10
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like orange and etc, click on back button, select bet type as 0.1 & denomination  value 10 and check payout amount
    Then System should display the Payout max amount on each symbol like orange and etc and payout max amount should get changed whenever player changes the bet type to 0.1 and denomination value 10
	
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 1 and denomination 5 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange and etc, back button, bet type 1 and denomination value 5
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like orange, click on back button, select bet type as 1 & denomination  value 5 and check payout amount
    Then System should display the Payout max amount on each symbol like orange and payout max amount should get changed whenever player changes the bet type to 1 and denomination value 5
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 1 and denomination value 10 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon n etc, back button, bet type 1 and denomination value 10
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like lemon n etc, click on back button, select bet type as 1 & denomination  value 10 and check payout amount
    Then System should display the Payout max amount on each symbol like lemon n etc and payout max amount should get changed whenever player changes the bet type to 1 and denomination value 10
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 1 and denomination value 25 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like plum n etc, back button, bet type 1 and denomination value 25
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like plum n etc, click on back button, select bet type as 1 & denomination  value 25 and check payout amount
    Then System should display the Payout max amount on each symbol like plum n etc and payout max amount should get changed whenever player changes the bet type to 1 and denomination value 25
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 1 and denomination value 50 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like seven n etc, back button, bet type 1 and denomination value 50
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like seven n etc, click on back button, select bet type as 1 & denomination  value 50 and check payout amount
    Then System should display the Payout max amount on each symbol like seven n etc and payout max amount should get changed whenever player changes the bet type to 1 and denomination value 50
	
		Scenario: Check whether the max payout amount for each symbol as per the bet type 1 and denomination value 100 in golden hot slot game 
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, icon to open payout table, all symbols, max amount on each symbol like cherry and etc, back button, bet type 1 and denomination value 100
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on icon to open payout table, check payout amount on each symbol like cherry and etc, click on back button, select bet type as 1 & denomination  value 100 and check payout amount
    Then System should display the Payout max amount on each symbol like cherry and etc and payout max amount should get changed whenever player changes the bet type to 1 and denomination value 100
	

	
	
	
	
	Scenario: Checking whether wim amount is displaying as gamble amount in gamble page
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the golden hot slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on golden hot slot game, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.15
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.03, denomination as 0.15, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.03 & denomination as 0.15, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.15
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 and denomination 0.30
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.03, denomination as 0.30, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.03 & denomination as 0.30, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.30
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.75
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.03, denomination as 0.75, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.03 & denomination as 0.75, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.75
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 1.5
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, transfer button, bet type as 0.03, denomination as 1.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.03 & denomination as 1.5, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.03 and denomination 1.5
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination THREE
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.03, denomination as THREE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as THREE & denomination as 0.30, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination THREE
	
	

	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 0.25
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.05, denomination as 0.25, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.05 & denomination as 0.25, click on spin button till user wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.05 & denomination 0.25
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 and denomination 0.5
    Given Chrome browser, valid URL, valid login details, golden hot slot game, transfer button, bet type as 0.05, denomination as 0.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer amount to slot game, select bet type as 0.05 & denomination as 0.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.5
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 1.25
    Given Godlen hot slot game, bet type as 0.05, denomination as 1.25, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on golden hot slot game, select bet type as 0.05 & denomination as 1.25, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of golden hot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.05 & denomination 1.25
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 2.5
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, amount to transfer, transfer button, bet type as 0.05, denomination as 2.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.05 & denomination as 2.5, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.05 and denomination 2.5
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination FIVE
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.05, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as FIVE & denomination as 0.30, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.05 & denomination FIVE
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination 0.5
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as 0.1, denomination as 0.5, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on golden hot slot game, select bet type as 0.1 & denomination as 0.5, click on spin button till user wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type 0.1 & denomination 0.5
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 and denomination ONE
    Given Chrome browser, valid URL, valid login details, golden hot slot game, transfer button, bet type as 0.1, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer amount to slot game, select bet type as 0.1 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.1 & denomination ONE
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination 2.5
    Given Chrome browser, valid URL, valid login details, golden hot slot game, transfer button, bet type as 0.1, denomination as 2.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on golden hot slot game, select bet type as 0.1 & denomination as 2.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.1 & denomination 2.5
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination FIVE
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, amount to transfer, transfer button, bet type as 0.1, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.1 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.1 and denomination FIVE
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination TEN
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as 0.1, denomination as TEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.1 & denomination as TEN, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.1 & denomination TEN
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination FIVE
    Given Chrome browser, valid URL, valid login details, golden hot slot game, bet type as ONE, denomination as FIVE, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on golden hot slot game, select bet type as ONE & denomination as FIVE, click on spin button till user wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type ONE & denomination FIVE
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE and denomination TEN
    Given Chrome browser, valid URL, valid login details, golden hot slot game, transfer button, bet type as ONE, denomination as TEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer amount to slot game, select bet type as ONE & denomination as TEN, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type ONE & denomination TEN
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination 25
    Given Chrome browser, valid URL, valid login details, golden hot slot game, transfer button, bet type as ONE, denomination as 25, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, click on golden hot slot game, select bet type as ONE & denomination as 25, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type ONE & denomination 25
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination FIFTY
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, amount to transfer, transfer button, bet type as ONE, denomination as FIFTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as ONE & denomination as FIFTY, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type ONE and denomination FIFTY
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination HUNDRED
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as ONE, denomination as HUNDRED, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as ONE & denomination as HUNDRED, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type ONE & denomination HUNDRED
	
	
	
	
	Scenario: Check whether system is providing balance in try now feature of golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, try now button and balance to play
    When Open the Golded hot slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in golden hot slot game
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, try now button, balance to play and spin button
    When Open the Golded hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of golden hot slot game
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of golden hot slot game
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, try now button, balance to play, spin button and win amount
    When Open the Golded hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of golden hot slot game