Feature: Test login
@tag
Scenario Outline: Verify test case
Given I lopen Online booking webapp with url as "<url>"
When user enters required input to book the room


Examples:
|url|
|https://automationintesting.online/|