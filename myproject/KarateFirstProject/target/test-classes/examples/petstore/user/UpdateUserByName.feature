Feature: create karate script to create user

  Scenario: update a user

  Scenario: PUT a user
    Given url 'https://petstore.swagger.io/v2/user/Ram'
    And request {"id": 30033003,"username": "Ram","firstName": "Ram","lastName": "Mohan","email": "xoxo@gmail.com","password": "coco123","phone": "0974565578","userStatus": 1}
    When method PUT
    Then status 200
