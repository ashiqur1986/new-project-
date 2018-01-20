@register
Feature: User resgistration

In order to become a site memeber
As a site visitor
I want to go to registration page, enter first name 

Scenario: Positive - user registration

Given user visit homepage
When user click on register link
And user enter user name, password, confirm password
And user click on submit button
Then user receives a confirmation
And user closes the browser
