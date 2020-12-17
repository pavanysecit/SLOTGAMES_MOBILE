Feature: Test all the functionalities of Frozen Slot Game
   

	#1. FrozenFruits_AutoSpin_Check_WinAmount_AddedToBalance

	Scenario: Check whether in AutoSpin win amount is added to balance automatically when new spin starts in Frozen Fruits slot game 
	Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, Autospin button, win amount added to balance
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, select autospin, play till win triggers and observe win amount added to main balance in next spin itteration
    Then Automatically Win amount should get added to the main balance after win and balance should get increased with win amount and next spin should continue in Frozen Fruits slot game
 
#2. FrozenFruits_AutoSpin_Reload_Option 

 	Scenario: Check whether reload the game while playing Autospin is allowed in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, Autospin button, browser hamburger reload button valid session invalid error message.
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, select autospin button, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and autospin should be terminated and informed with valid error message for session invalid in Frozen Fruits slot game 
 

#3. FrozenFruits_AutoSpin_Validations_NetworkInteruptions

 	Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, wifi turnOFF and ON, network messages 
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin autospin and turn OFF wifi and check for valid message. and turn on wifi for autospin to continued
    Then User is addressed with valid error message 'No Internet' for network interuptions in Frozen Fruits slot game 
    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interuptions in Frozen Fruits slot game 


#4. FrozenFruits_Balance_Check_MaxBet_WinAmount_AddedTo_Balance 
     
    Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, gamble collect, max credit and bet value, win amount added to balance
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble collect, win amount added to main balance
    Then MaxBet Win amount should get added to the main balance after win and balance should get increased with win amount in Frozen Fruits slot game    

#5. FrozenFruits_Balance_CreditBalance_For_IncrementalAndDecremental_CreditValue 
      
	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, increment, decrement and balance, balance in credit form, creditvalues
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Frozen Fruits slot game 
 

#6. FrozenFruits_Balance_FullAmount_AddedToGame_And_Reload_Option

 	Scenario: Check whether user is allowed to play with full amount in the account in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, Full amount transfer from account to game.
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, select game and transfer full amount same amount has to reflect in game balance, play and reload the game 
    Then Remaining balance should be transfered to main account balance in Frozen Fruits slot game 
 

#7. FrozenFruits_Balance_InsufficiantBalance_Validation1 

 	Scenario: Check whether user able to play the game when there is insufficiant balance in account and verify when the insuffficient alert popup is displayed with the game buttons during behavior during alert popup in Frozen Fruits slot game
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button and validation message, button behavior, 
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message with buttons behavior 
    Then Check the insufficient alert popop is displayed before the clicking on spin 
    Then Player should be blocked from playing the game when there is no balance in the account and buttons are inactive state in Frozen Fruits game


#8. FrozenFruits_Check_BetType_BetValue_DropDown_For_IncrementalAndDecremental_CreditValue
   
 	Scenario: Check whether incrementing and decrementing the creditvalue, betval amount are assigned respectively in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, increment, decrement and betvalue amount
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit and verify the betvalue assigned respectively 
    Then Bet amount for all credit values should be assigned respectively in Frozen Fruits slot game 


#9. FrozenFruits_Check_SessionExpired_Messages 
    
 	Scenario: Check whether error messages is displayed on game session is being idle for more than 20minutes in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, full screen, landscape mode ,session terminated messages 
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, and full screen and change orientation of the screen, idle for more 20mins  
    Then User is addressed with valid error message on the screen 'Session Expired' in Frozen Fruits slot game 
    Then Again relauch other slot game and verify user is able to continue gameplay
 

#10. FrozenFruits_Gamble_GamblePage_NetworkInteruptions 

 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection resume to gamble session in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, gamble screen, wifi turnOFF and ON, network messages 
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin till player wins, selext any gamble option and turn OFF wifi and check for valid message and turn on wifi for gamble to resume if won or go back to game screen
    Then User is addressed with valid error message 'No Internet' for network interuptions in gamble page of Frozen Fruits slot game 
 
 
#11. FrozenFruits_Gamble_Reload_Option
 
 	Scenario: Check whether reload the game while playing gamble is allowed in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, gamble page, browser hamburger reload button valid session invalid error message.
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble should won,  click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message and again relauch the game and game session redirected to gamble page in Frozen Fruits slot game 
 


#12. FrozenFruits_ManualSpin_Validations_ButtonsBehavior

 	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Frozen Fruits slot game
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, spin button and check for buttons behavior & functionality
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable under spin condition in Frozen Fruits slot game
	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Frozen Fruits slot game
	And Spin button should be disabled during reel spin in Frozen Fruits slot game
	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Frozen Fruits slot game
	And Gamble button behaviour under win triggered and disabled when next spin starts in Frozen Fruits slot game
	

#13. FrozenFruits_Reload_Option 

 	Scenario: Check whether reload the game is allowed in Frozen Fruits slot game 
    Given Chrome browser, valid URL, valid login details, Frozen Fruits slot game, balance, spin button, browser hamburger reload button valid session invalid error message.
    When Open the Frozen Fruits slot game by entering the valid URL in browser, enter the valid login details, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message in Frozen Fruits slot game 