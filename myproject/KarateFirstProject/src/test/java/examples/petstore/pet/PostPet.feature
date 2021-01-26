Feature: create karate script to create pet

Scenario: create a pet

        Scenario: POST a pet
                Given url 'https://petstore.swagger.io/v2/pet'
                And request {"id": 12345679,"category": {"id": 12345679,"name": "string"},"name": "Rox","photoUrls": ["string"],"tags": [{"id": 12345679,"name": "Rox"}],"status": "available"}
                When method POST
                Then status 200
