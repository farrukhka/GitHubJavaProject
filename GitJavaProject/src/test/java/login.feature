Feature: Login into Application


Scenario: Positive test validating login

Given Initialize the browser with chrome
And Navigate to "Rediff" Site
And Click on Login Link in home page to land on Secure sign in Page
When User enters "Username" and "Password" and logs in
Then Verify the user is successfully logged in
