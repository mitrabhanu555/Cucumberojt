Feature: stock accounting login validation


Scenario: AppliacationLogin validation
	When Open Browser
	When Open Application
	When  Wait For UserName
	When  Enter UserName
	And Wait For Password
	And Enter Password
	And Wait For Password
	When Click On Login
	When wait For Logout
	When Click On Logout
	When wait For Ok
	When Click On Ok
	When CloseBrowser
		