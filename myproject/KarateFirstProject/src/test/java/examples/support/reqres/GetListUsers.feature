Feature: karate script for get list of user info from API.


  Scenario: get the list of user
    Given url 'http://reqres.in/api/users?page=2'
    When method get
    Then status 200
