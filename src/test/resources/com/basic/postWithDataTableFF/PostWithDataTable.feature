Feature: First Rest Assured test POST 


Scenario: Test my POST request test DataTable
Given  user hit the post request with "Tom" name
Then user validate followind data
	|param			|Value			|
	|id					|notNull		|
	|statusCode	|200				| 	

#When user hit the get request
#Then user checks 200 the status code
#Then user checks the count or size
#Then user checks "albert_park" value
#Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value


 

