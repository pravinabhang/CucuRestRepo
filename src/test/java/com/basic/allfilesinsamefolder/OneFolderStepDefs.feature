Feature: Facebook login11
As a fb user, I want to enter username and pwd 

Scenario: validate fb login Scenario1
Given the user is on facebook login page
When he enters "abhang.pravin183@gmail.com" as user name
When he enters "psa9822355520aps" as password
Then he clicks button
Then check username is present in textbox
Then close the browser

Scenario: validate fb login Scenario2
Given the user is on facebook login page
When he enters "Pravin" as user name
When he enters "psa9822355" as password
Then he clicks button
Then check username is present in textbox
Then close the browser