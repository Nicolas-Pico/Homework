Feature: Favorite articles
Background: Precondiciones
    Given url apiUrl
    * def tokenResponse = call read('classpath:helpers/createToken.feature')
    * def token = tokenResponse.authToken

Scenario: delete article favorite  
    Given path 'articles'
    And params { limit: 10, offset: 0}
    And header Authorization = 'Token ' + token
    When method Get
    Then status 200
    * def slugFinal = response.articles[0].slug