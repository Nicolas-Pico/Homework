Feature: Create token
Background: Precondiciones
    Given url apiUrl

    Scenario: Create token
        Given url 'https://api.realworld.io/api/'
        And request
            """
            {
                "user": {
                    "email": "luffy@gmail.com",
                    "password": "todomelo"
                }
            }
            """
        And path 'users/login'
        When method Post
        Then status 200
        * def authToken = response.user.token
