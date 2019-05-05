Feature: First Rest Assured test22


Scenario: Test Get For CircuitId0
Given  user start the rest asured test
When user hit the get request
Then use checks the staus code 200
Then user checks the count or size
Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value

Scenario: Test Get For CircuitId1
Given  user start the rest asured test
When user hit the get request
Then use checks the staus code 200
Then user checks the count or size
Then user checks at path "MRData.CircuitTable.Circuits.circuitId[1]" with the "americas" value