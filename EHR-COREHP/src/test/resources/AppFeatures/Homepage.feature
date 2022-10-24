Feature: Homepage feature

Scenario Outline: User reaches Homepage
Given User landed on homepage 
When Timezone alert was displayed
Then User clicks Ok in the alert
Then User checks the homepage URL should be as expected

