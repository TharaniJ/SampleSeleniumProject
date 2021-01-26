Feature: create karate script to create user

  Scenario: create a user

  Scenario: Create a pet user
    Given url 'https://petstore.swagger.io/v2/user'
    And request {"id": 30033003,"username": "Ram","firstName": "Ram","lastName": "Charan","email": "xoxo@gmail.com","password": "coco123","phone": "0974565578","userStatus": 1}
    When method POST
    Then status 200
