Feature: Application will use Stream module to ingest logging request

	Stream for logging requests.

	Scenario: Loggin service is ready!
		Given logging service has started
		When I put a log request to "/push/log" path
		Then I should see the log response http code is 200 and content printed on screen
