Feature: karate script for retrieve pet user from the pet store.

  Background:
    * url 'https://petstore.swagger.io/v2'
    * header Content-Type = 'application/json'


  Scenario: Retrieve the pet user by name
    Given path '/user/Ram'
    When method GET
    Then status 200
    Then print response

