Feature: karate script to get pet info from the pet store using status.

  Scenario: get all 'available' pets using 'available' status
    Given url 'https://petstore.swagger.io/v2/pet/findByStatus?status=available'
    When method GET
    Then status 200

  Scenario: get all 'pending' pets using 'pending' status
    Given url 'https://petstore.swagger.io/v2/pet/findByStatus?status=pending'
    When method GET
    Then status 200

  Scenario: get all 'sold' pets using 'sold' status
    Given url 'https://petstore.swagger.io/v2/pet/findByStatus?status=sold'
    When method GET
    Then status 200