Feature: Test all the functionalities of Great Egypt Slot Game
   

 				Scenario: Check whether reload the game while playing gamble is allowed in Great Egypt slot game 
    Given Chrome browser, valid URL, valid login details, Great Egypt slot game, balance, spin button, gamble page, browser hamburger reload button valid session invalid error message.
    When Open the Great Egypt slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble should won,  click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message and again relauch the game and game session redirected to gamble page in Great Egypt slot game 
    