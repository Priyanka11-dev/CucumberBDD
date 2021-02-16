Feature: Login as admin

Scenario: Login into the application
Given User navigate to the "https://orangehrm-demo-6x.orangehrmlive.com/" in browser
When User enters "admin"
And Click on Login button
Then Dashbord Should be displayed