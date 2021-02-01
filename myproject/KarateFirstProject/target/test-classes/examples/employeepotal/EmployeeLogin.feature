Feature: karate script for authenticates Employee Portal users by user-name and password

  Background:
    * url 'http://localhost:8080/employeepotal'
    * header Content-Type = 'application/json'


  Scenario: authenticates Employee Portal users by user-name and password
    Given path '/login'
    When method GET
    Then status 200
    Then print response
