Feature: Login page feature

Scenario: User enters login credentials
Given User is on login Page using Login Page URL
When User sees the Company Code field
Then Enters Valid Company Code
When User sees the Username field
Then Enters valid Username
When User sees the Password field
Then Enters Valid Password
When User sees the Login button
Then Clicks on Login button






