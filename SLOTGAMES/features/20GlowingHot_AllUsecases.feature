Feature: Test all the functionalities of 20 Glowing Hot Slot Game
   

		Scenario: Check whether gamble color win options and game play in landscape mode and verify the win amount in win meter  in 20 Glowing Hot slot game 
	Given Chrome browser, valid URL, valid login details, 20 Glowing Hot slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status 
	When Open the 20 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount
	Then Verify the home button is enabled on the game screen after returning from gamble page
	Then Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in 20 Glowing Hot slot game 
	

	Scenario: Check whether gamble credit win amount is getting added to the balance after win in 20 Glowing Hot game 
	Given Chrome browser, valid URL, valid login details, 20 Glowing Hot slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
	When Open the 20 Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
	Then verify the credit form of currency in gamble page on all fields 
	Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in 20 Glowing Hot slot game
	

	Scenario: Check whether resume feature is enabled in Gamble screen, when user collect amount in gamble screen without playing Gamble attempts in 20 Glowing Hot slot game
	Given chrome browser, valid URL, valid login details, 20 Glowing Hot slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect
	When Open the 20 Glowing Hot slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game 
	Then  Resume feature should not be enabled and land on the game screen of 20 Glowing Hot slot game
	
	
	Scenario: Check whether resume feature is enabled in Gamble screen of 20 Glowing Hot slot game
	Given Chrome browser, valid URL, valid login details, 20 Glowing Hot slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session.
	When Open the 20 Glowing Hot slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
	Then  Resume feature should enabled and land on the gamble screen of 20 Glowing Hot slot game
	Then  On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in  20 Glowing Hot slot game
	
	
	Scenario: Check whether on resume feature is enabled in Gamble screen, user can play further left over attempts and check the attempts before and after resuming to gamble screen in 20 Glowing Hot slot game
	Given chrome browser, valid URL, valid login details, 20 Glowing Hot slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play
	When Open the 20 Glowing Hot slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser
	Then  Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of 20 Glowing Hot slot game
	Then Left over attempts should be  between 4 to 1 and the user is enabled to play the remaining attempts
	