Feature: Login



Scenario: Succesful Login With Valid Credentials

Given use Launch Chrome browser 
When User Opens URL "http://103.50.162.196/testing/user-login.php"
And User Enters PhoneNumber as "123" and Password as "admin"
And Click on Login
Then Page Title Should be ""
When User Click on Log out Link
Then Page Title Should be "BHIMAN GROUP"
And Close browser


