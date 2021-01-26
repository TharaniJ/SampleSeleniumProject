Feature: karate script for create a pet user from the pet store.

  Background:
    * url 'https://petstore.swagger.io/v2'
    * header Content-Type = 'application/json'



  Scenario: create a pet user.

    * def user =
      """
      {
        "id": 121212,
        "username": "Jack",
        "firstName": "Jack",
        "lastName": "Robin",
        "email": "Jack@gmail.com",
        "password": "Jack123",
        "phone": "4444546565",
        "userStatus": 0
      }

      """
    Given path '/v2/user'
    And request user
    When method POST
    Then status 200