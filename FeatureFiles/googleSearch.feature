Feature: searching keywords on google.

Scenario Outline:
Given user is present on "https://www.google.com"
When user enters "<keyword>" and hits enter
Then user can see search results

Examples:
|keyword|
|lana condor|
|Vox|