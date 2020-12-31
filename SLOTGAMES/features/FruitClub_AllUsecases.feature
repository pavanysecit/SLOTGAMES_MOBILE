Feature: Test all the functionalities of Fruit Club Slot Game
   

#11. FruitClub_Gamble_Reload_Option
 
 	Scenario: Check whether reload the game while playing gamble is allowed in Fruit Club slot game 
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, balance, spin button, gamble page, browser hamburger reload button valid session invalid error message.
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble should won,  click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message and again relauch the game and game session redirected to gamble page in Fruit Club slot game 
 


#12.FruitClub_ManualSpin_Validations_ButtonsBehavior

 	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Fruit Club slot game
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, balance, spin button, spin button and check for buttons behavior & functionality
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable under spin condition in Fruit Club slot game
	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Fruit Club slot game
	And Spin button should be disabled during reel spin in Fruit Club slot game
	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Fruit Club slot game
	And Gamble button behaviour under win triggered and disabled when next spin starts in Fruit Club slot game
	

#13. FruitClub_Reload_Option 

 	Scenario: Check whether reload the game is allowed in Fruit Club slot game 
    Given Chrome browser, valid URL, valid login details, Fruit Club slot game, balance, spin button, browser hamburger reload button valid session invalid error message.
    When Open the Fruit Club slot game by entering the valid URL in browser, enter the valid login details, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message in Fruit Club slot game 
     