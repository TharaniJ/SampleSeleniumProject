Feature: create karate script to create user

  Scenario: create a user

  Scenario: POST a user
    Given url 'http://reqres.in/api/users'
    And request {"name": "morpheus","job": "leader"}
    When method POST
    Then status 200

