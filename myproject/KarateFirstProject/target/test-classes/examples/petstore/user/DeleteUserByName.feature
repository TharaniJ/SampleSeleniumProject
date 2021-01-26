Feature: karate script for delete pet user info in the pet store.

  Scenario: get the pet user by name
    Given url 'https://petstore.swagger.io/v2/user/gem'
    When method Delete
    Then status 200
    Then print response