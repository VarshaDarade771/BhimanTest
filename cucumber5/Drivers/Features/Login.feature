Feature:Login

Scenario: Successful Login with Valid Credential
Given User Launch Chrome browser
When User opens URL "http://103.50.162.196/testing"
And User enters Email as "1234567890" and Password as"admin"
And Click on Login
Then page Title should be "http://103.50.162.196/testing/index.php"
When User Click on Log out link
Then Page Title  should be ""
And Close browser