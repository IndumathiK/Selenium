Feature: Shout Feature

Scenario: Sean shouts
	Given Sean is 10 meters away from lucia
	When Sean shouts "Free coffee"
	Then Lucia "listens" to the message
	
Scenario:  Sean shouts
    Given Sean is 200 meters away from lucia
	When Sean shouts "Free coffee"
	Then Lucia "cannot listen" to the message
	


