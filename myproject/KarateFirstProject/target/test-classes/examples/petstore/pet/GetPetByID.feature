Feature: karate script for get pet info in the pet store.

  Scenario: get the pet by pet id
    Given url 'https://petstore.swagger.io/v2/pet/9222968140496998000'
    When method GET
    Then status 200
    Then print response
