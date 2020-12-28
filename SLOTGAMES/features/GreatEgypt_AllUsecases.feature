Feature: Test all the functionalities of Great Egypt Slot Game
   

	#2. GreatEgypt_AutoSpin_Reload_Option 

 	Scenario: Check whether reload the game while playing Autospin is allowed in Great Egypt slot game 
    Given Chrome browser, valid URL, valid login details, Great Egypt slot game, balance, Autospin button, browser hamburger reload button valid session invalid error message.
    When Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, select autospin button, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and autospin should be terminated and informed with valid error message for session invalid in Great Egypt slot game 
 
#
#3. GreatEgypt_AutoSpin_Validations_NetworkInteruptions
#
 #	Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Great Egypt slot game 
    #Given Chrome browser, valid URL, valid login details, Great Egypt slot game, balance, spin button, wifi turnOFF and ON, network messages 
    #When Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin autospin and turn OFF wifi and check for valid message. and turn on wifi for autospin to continued
    #Then User is addressed with valid error message 'No Internet' for network interuptions in Great Egypt slot game 
    #Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interuptions in Great Egypt slot game 
#
#
#4. GreatEgypt_Balance_Check_MaxBet_WinAmount_AddedTo_Balance 
     #
    #Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Great Egypt slot game 
    #Given Chrome browser, valid URL, valid login details, Great Egypt slot game, balance, spin button, gamble collect, max credit and bet value, win amount added to balance
    #When Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble collect, win amount added to main balance
    #Then MaxBet Win amount should get added to the main balance after win and balance should get increased with win amount in Great Egypt slot game    
#
#5. GreatEgypt_Balance_CreditBalance_For_IncrementalAndDecremental_CreditValue 
      #
#	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Great Egypt slot game 
    #Given Chrome browser, valid URL, valid login details, Great Egypt slot game, increment, decrement and balance, balance in credit form, creditvalues
    #When Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
    #Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Great Egypt slot game 
    