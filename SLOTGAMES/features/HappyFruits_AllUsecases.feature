Feature: Test all the functionalities of Happy Fruits Slot Game
   

  	Scenario: To check the transferred amount is added to Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, text field to transfer balance and Ok button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then Player should be blocked from loading the Happy Fruits game when the amount entered in the transfer page is more than the available balance
	And The exact amount entered in the transfer page should transfer to Happy Fruits game and same amount should get displayed on the balance section
	And An error should be displayed if the balance field is empty and player should be blocked from loading the Happy Fruits game
	And An error should be displayed if balance entered was zero and player should be blocked from loading the Happy Fruits game
	



	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.15,0.3,0.75,1.5,3 in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03 and bet value as 0.15,0.3,0.75,1.5,3
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value should be 0.15,0.3,0.75,1.5,3
    Then Bet value should get changed to 0.15,0.3,0.75,1.5,3 if the bet type selected as 0.03 from the drop down in Happy Fruits slot game
	
	
	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.25,0.5,1.25,2.5 & 5 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.05 and bet value as 0.25,0.5,1.25,2.5 & 5
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 and check the bet value should be 0.25,0.5,1.25,2.5 & 5
    Then Bet value should get changed to 0.25,0.5,1.25,2.5 & 5 if the bet type selected as 0.05 from the drop down 1 in Happy Fruits slot game
	
	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 0.5,1,2.5,5,10 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.1 from down 2 and bet value as 0.5,1,2.5,5,10
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from down  and check the bet value should be 0.5,1,2.5,5,10
    Then Bet value should get changed to 0.5,1,2.5,5,10 if the bet type selected as 0.1 from the drop down two in Happy Fruits slot game
	
	Scenario: Select the bet type as 1 from the drop down and check the bet value should be 5,10,25,50 & 100 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 1 from drop down and bet value as 5,10,25,50 & 100
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 from drop down and check the bet value should be 5,10,25,50 & 100
    Then Bet value should get changed to 5,10,25,50 & 100 if the bet type selected as 1 from the drop down three in Happy Fruits slot game
	
	
		
	
	
	
	Scenario: Change the bet value as 0.15, do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as 0.15, balance and spin button, balance after spin
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.15, click on spin button and check the balance after spin
    Then Balance should get deducted by 0.15 after spin as bet type is selected as 0.03 and bet value as 0.15 in Happy Fruits game
	
	
	Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as 0.3, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, click on spin button and check the balance
    Then Balance should get deducted by 0.3 as bet type is selected as 0.03 in Happy Fruits game
	
	
	Scenario: Change the bet value to 0.75, click on spin button and check whether current balance is deducting according to changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as 0.75, balance, spin button and win amount
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.75, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by 0.75 as bet type is selected as 0.03 and bet value as 0.75 in Happy Fruits game
	
	
	Scenario: Change the bet value as 1.5, do the spin and check whether balance is deducting according to changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as 1.5, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 1.5, click on spin button and check the balance
    Then Current Balance should get deducted by one point five as bet type is selected as 0.03 and bet value as 1.5 in Happy Fruits game
	
	
	Scenario: Change the bet value as THREE, click on spin and check whether existing balance is deducting according to changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as THREE, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to THREE, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by THREE as bet type is selected as 0.03 and bet value as THREE in Happy Fruits slot game
	

	
	
	

	Scenario: Change the bet value as 0.25, do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, 0.05 as bet type , 0.25 as bet value, balance, spin button and balance after spin
    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.25, click on spin button and check the balance
    Then Balance should get deducted by 0.25 as bet type is selected as 0.05 and bet value as 0.25 in Happy Fruits game
	
	
	Scenario: Change the bet type as 0.05 from drop down & bet value to 1.8 do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type & bet value drop down, bet type as 0.05, bet value as 0.5, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, bet value to .5 click on spin button and check the balance after spin
    Then Balance should get deducted by 0.5 if the bet type is selected as 0.05 and bet value as 0.5 in Happy Fruits hot game
	
	
	Scenario: Change the bet value as 1.25, do the spin and check whether balance is deducting according to changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.05, bet value as 1.25, balance and spin button
    When Open the Happy Fruitsslot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value as 1.25, click on spin button and check the balance
    Then Current Balance should get deducted by 1.25 as bet type is selected as 0.05 & bet value as 1.25 in Happy Fruits game
	
	
	Scenario: Change the bet value to 2.5, click on spin button and check whether current balance is deducting according to changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.05, bet value as 2.5, bet type & bet values drop down, balance, spin button and balance amount
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to 2.5, click on spin button and check the balance
    Then Current Balance should get deducted by 9 as bet type is selected as 0.05 & bet type as 2.5 in Happy Fruits game
	
	Scenario: Change the bet value as FIVE, click on spin and check whether existing balance is deducting according to changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.05, bet value as FIVE, bet value drop down, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to FIVE, click on spin button and check the Happy Fruits slot game balance
    Then Existing Balance should get deducted by FIVE as bet type is selected as 0.05 & bet value as FIVE in Happy Fruits slot game
	
	

	
	
	
	Scenario: Change the bet value as one point 0.5, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.1 from drop down, bet value as 0.5, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by 0.5 if bet type is selected as 0.1 in Happy Fruits game
	
	
	Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.1 from drop down, bet value as ONE, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE from drop down, click on spin button and check the balance
    Then Balance should get deducted by ONE if bet type is selected as 0.1 & bet value as ONE in Happy Fruits game
	
	
	Scenario: Change the bet value as 2.5, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.1 from drop down, bet value as 2.5 from drop down, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, select the bet vale as 2.5 from down, click on spin button and check the balance
    Then Balance should get deducted by 2.5 if bet type is selected as 0.1 & bet value as 2.5 in Happy Fruits game
	
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.1 from drop down, bet value as FIVE, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as FIVE from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by FIVE if bet type is selected as 0.1 & bet value as FIVE in Happy Fruits game
	
	
	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.1 from drop down, bet value as TEN, balance, spin button and balance after spin
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TEN from bet type drop down, click on spin button and check the balance after spin
    Then Balance should get deducted by TEN if bet type is selected as 0.1 & bet value as TEN in Happy Fruits slot game
	
	
	
	
	
	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type ONE in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as ONE, bet value as FIVE, balance and spin buttone
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as FIVE, click on spin button and check the balance
    Then Balance should get deducted by FIVE as bet type is selected as ONE in Happy Fruits game
	
	
	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type ONE in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as ONE, bet value as TEN, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as TEN, click on spin button and check the balance
    Then Balance should get deducted by TEN as bet type is selected as ONE in Happy Fruits game
	
	
	Scenario: Change the bet value as twenty five, do the spin and check whether balance is deducting according to the changed bet type ONE in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as ONE, bet value as twenty five, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as twenty five, click on spin button and check the balance
    Then Balance should get deducted by twenty five as bet type is selected as ONE in Happy Fruits game
	
	
	Scenario: Change the bet value as fifty, do the spin and check whether balance is deducting according to the changed bet type ONE in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as ONE, bet value as fifty, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as fifty, click on spin button and check the balance
    Then Balance should get deducted by fifty as bet type is selected as ONE in Happy Fruits game
	
	
	Scenario: Change the bet value as one hundred, do the spin and check whether balance is deducting according to the changed bet type ONE in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as ONE, bet value as one hundred, balance and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as one hundred, click on spin button and check the balance
    Then Balance should get deducted by one hundred as bet type is selected as ONE in Happy Fruits game

	


	
	
   	 Scenario: Change the bet value as FIVE do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.01, bet value as FIVE, balance in credits and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FIVE, click on spin button and check the balance in credits
    Then Balance should get deducted by FIVE as bet type is selected as 0.01 and bet value as 5 in Happy Fruits game
    
   	Scenario: Change the bet value as TEN, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.01, bet value as TEN, balance in credits and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TEN, click on spin button and check the balance in credits
    Then Balance should get deducted by TEN as bet type is selected as 0.01 and bet value as 10 in Happy Fruits game
	
	 Scenario: Change the bet value as TWENTY FIVE, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.01, bet value as TWENTY FIVE, balance in credits and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWENTY FIVE, click on spin button and check the balance in credits
    Then Balance should get deducted by TWENTY FIVE, as bet type is selected as 0.01 and bet value as 25 in Happy Fruits game
	
	 Scenario: Change the bet value as FIFTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Ultra slot game, bet type as 0.01, bet value as FIFTY, balance in credits and spin button
    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FIFTY, click on spin button and check the balance in credits
    Then Balance should get deducted by FIFTY, as bet type is selected as 0.01 and bet value as 50 in Happy Fruits game
	
	 Scenario: Change the bet value as HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.01, bet value as HUNDRED, balance in credits and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by HUNDRED, as bet type is selected as 0.01 and bet value as 100 in Happy Fruits game
	
	
	
	
	
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, credits and denomination as 0.03 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and check the balance
    Then Balance amound should be same as denomination 0.03 multiplies by credit in Happy Fruits slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, credits, denomination drop down and denomination as 0.05 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
    Then Balance amound should be same as denomination 0.05 multiplies by credit in Happy Fruits game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game window, balance, credits, denomination drop down and denomination as 0.1 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
    Then Balance amound should be same as denomination 0.1 multiplies by credit balance in Happy Fruits slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 1 in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, credits and denomination drop down & value as 1
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 1 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 1 by credit in Happy Fruits slot game
	

	
		
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Happy Fruits slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Happy Fruits slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Happy Fruits slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Happy Fruits slot game
	
	


	
	Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, transfer button, spin button and win amount
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Happy Fruits slot game
    Then Win amount should get added to the balance after win and balance should get increased with win amount in Happy Fruits slot game
	
	
	
	Scenario: Check whether winning amount is getting added to the main balance in credits
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, transfer button, credit balance form, spin button and win amount in credits
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
    Then Win amount should get added to the credit field after win and credit should get increased with win amount in Happy Fruits slot game
	
	


	
	 Scenario: Check whether user able to play the game when there is insufficiant balance in balance counter the bet and credit values are decreased to equal or less than available balance which enables player to resume the game in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance counter, Auto spin button, validation message, credit types and bet types
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Auto spin button till balance counter turns less than betvalues and check the insufficient validation message and reduce the bet and credit values to resume the play.
    Then Player should be blocked from playing the game when there is less amount in balance counter and reducing the credit and bet types player is enable to continue slot game in Happy Fruits game
	
	

	Scenario: Check user instruction messages before and after spin in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button and user instruction message
    When Open the Happy Fruits hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
	And User instruction message 'Good Luck' should be displayed after spin button is clicked in Happy Fruits slot game

	
	Scenario: Navigate to home screen from Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game and home button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    Then System should take the player to Home page after clicking on home button from Happy Fruits game
	
	
	Scenario: Check the functionality of maximize and minimize button in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, maximize button and minimize button
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Happy Fruits slot game
	
	
	
	
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins in Happy Fruits slot game
	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the Happy Fruits  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in Happy Fruits slot game
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Happy Fruits slot game
	
	
	
	
	
	Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable in Happy Fruits game
	And Home and Info buttons should not be clickable in Happy Fruits game
	And Spin button should not visible & Stop button should be visible and clickable in Happy Fruits game
	And Spin button should be visble after clicking on stop button in in Happy Fruits game
    
    
    Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page in Happy Fruits game
    Then Bet value & Credit value buttons should not be clickable after navigating from gamble page in Happy Fruits game
	And Win amount should get added to the balance during autoplay in Happy Fruits game
 
    
    Scenario: Check whether auto spin is continued even after switching between the tabs inside a browser session of Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, spin button, auto spin button, browser tabs.
    When Open the Happy Fruits slot game by entering the valid URL in browser, click on auto wait for the reel spin, open new browser tabs and redirect to game tab and check the spin functionality
    Then Auto spin should be continued even after switching between the tabs in Happy Fruits slot game
	
	
	
	

	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and all denominations in Happy Fruits slot game on mobile
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like star, orange, back button, bet type 0.03 and all denominations
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like star, orange, click on back button, select bet type as 0.03 & all denominations and check payout amount
    Then System should display the Payout max amount on each symbol like star, orange and payout max amount should get changed whenever player changes the bet type to 0.03 and all denominations in Happy Fruits slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like bell, grapes as per the bet type 0.05 and all denominations in Happy Fruits slot game on mobile
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like bell, grapes, back button, bet type 0.05 and  all denominations
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bell, grapes, click on back button, select bet type as 0.05 & all denominations and check payout amount
    Then System should display the Payout max amount on each symbol like bell, grapes and payout max amount should get changed whenever player changes the bet type to 0.05 and all denominations in Happy Fruits slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like cherry,lemon, 10 as per the bet type 0.1 and all denominations in Happy Fruits slot game on mobile
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like cherry,lemon n etc, back button, bet type 0.1 and all denominations on mobile
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like cherry,lemon n etc, click on back button, select bet type as 0.1 & all denominations and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like cherry,lemon n etc and payout max amount should get changed whenever player changes the bet type to 0.1 and all denominations in Happy Fruits slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like 777, stars as per the bet type 1 and all denominations in Happy Fruits slot game on mobile
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like 777, stars n etc, back button, bet type 1 and all denominations on mobile
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like 777, stars n etc, click on back button, select bet type as 1 & all denominations and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like 777, stars n etc and payout max amount should get changed whenever player changes the bet type to 1 and all denominations in Happy Fruits slot game on mobile
	
	
	
	



		
	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Happy Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Happy Fruits slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Happy Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Happy Fruits slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Happy Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Happy Fruits slot game 
	

	
	
	
		Scenario: Check whether gamble color win options and game play in landscape mode and verify the win amount in win meter  in Happy Fruits slot game 
	Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status 
	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount
	Then Verify the home button is enabled on the game screen after returning from gamble page
	Then Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in Happy Fruits slot game 
	

	Scenario: Check whether gamble credit win amount is getting added to the balance after win in Happy Fruits game 
	Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
	Then verify the credit form of currency in gamble page on all fields 
	Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Happy Fruits slot game
	

	Scenario: Check whether resume feature is enabled in Gamble screen, when user collect amount in gamble screen without playing Gamble attempts in Happy Fruits slot game
	Given chrome browser, valid URL, valid login details, Happy Fruits slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect
	When Open the Happy Fruits slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game 
	Then  Resume feature should not be enabled and land on the game screen of Happy Fruits slot game
	
	
	Scenario: Check whether resume feature is enabled in Gamble screen of Happy Fruits slot game
	Given Chrome browser, valid URL, valid login details, Happy Fruits slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session.
	When Open the Happy Fruits slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
	Then  Resume feature should enabled and land on the gamble screen of Happy Fruits slot game
	Then  On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in  Happy Fruits slot game
	
	
	Scenario: Check whether on resume feature is enabled in Gamble screen, user can play further left over attempts and check the attempts before and after resuming to gamble screen in Happy Fruits slot game
	Given chrome browser, valid URL, valid login details, Happy Fruits slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play
	When Open the Happy Fruits slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser
	Then  Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of Happy Fruits slot game
	Then Left over attempts should be  between 4 to 1 and the user is enabled to play the remaining attempts
	
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.15 in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as 0.15, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.03 & denomination as 0.15, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.15 in Happy Fruits game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 and denomination 0.3 in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.3 in Happy Fruits game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.75 in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as 0.75, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as 0.75, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.75 in Happy Fruits game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination one point five in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, transfer button, bet type as 0.03, denomination as one point five, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, transfer the amount, select bet type as 0.03 & denomination as one point five, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.03 and denomination one point five in Happy Fruits game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination three in Happy Fruits game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as three, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as three, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination three in Happy Fruits game

	
	
	
	
	
	Scenario: Check whether system is providing balance in try now feature of Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, try now button and balance to play
    When Open the Happy Fruits slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Happy Fruits slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, try now button, balance to play and spin button
    When Open the Happy Fruits slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Happy Fruitsslot game
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, try now button, balance to play, spin button and win amount
    When Open the Happy Fruits slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Happy Fruits slot game