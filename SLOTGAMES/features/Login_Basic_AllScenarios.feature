Feature: Test all the basic Login functionalities of Slot Game
   
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