Feature: karate script for get particular user info from API.

  Scenario: get the single user with user id
    Given url 'http://reqres.in/api/users/2'
    When method get
    Then status 200
    Then print response