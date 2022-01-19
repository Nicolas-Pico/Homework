Feature: Favorite articles
    Background: Precondiciones
        Given url apiUrl
        * def tokenResponse = call read('classpath:helpers/createToken.feature')
        * def token = tokenResponse.authToken

    Scenario: get all articles of the global feed
        # Step 1: Obtener los articulos de la global feed
        Given path 'articles'
        And params { limit: 10, offset: 0}
        And header Authorization = 'Token ' + token
        When method Get
        Then status 200

        # Step 2: Obtener el slug del primer articulo (preguntar a johan)
        * def slug = response.articles[0].slug
        * def callFavorites = response.articles[0].favoritesCount
        * if (response.articles[0].favoritesCount == 1) karate.call('deleteFavorite.feature')

        # Step 3: Realizar un post para dar favoritos
        Given path 'articles/' + slug + '/favorite'
        And header Authorization = 'Token ' + token
        When method Post
        Then status 200

        # Step 4: Verificar el esquema de respuesta
        * def timevalidator = read('classpath:helpers/timeValidator.js')
        And match response.article ==
            """
            {
                "id": "#number",
                "slug": "#string",
                "title": "#string",
                "description": "#string",
                "body": "#string",
                "createdAt": "#? timevalidator(_)",
                "updatedAt": "#? timevalidator(_)",
                "authorId": "#number",
                "tagList": "#array",
                "author": {
                    "username": "#string",
                    "bio": "##string",
                    "image": "#string",
                    "following": "#boolean"
                },
                "favoritedBy": [
                    {
                        "id": "#number",
                        "email": "#string",
                        "username": "#string",
                        "password": "#string",
                        "image": "#string",
                        "bio": "##string",
                        "demo": "#boolean"
                    }
                ],
                "favorited": "#boolean",
                "favoritesCount": "#number"
            }
            """

        # Step 5: Verifica que el artículo de favoritos se incremente en 1
        * def callFavorites = 0
        And match response.article.favoritesCount == callFavorites + 1

        # Step 6: Obtener todos los articulos favoritos
        Given path 'articles'
        And params { favorited: Aczino, limit: 10, offset: 0}
        And header Authorization = 'Token ' + token
        When method Get
        Then status 200

        # Step 7: Verifica que el esquema de artículo de favoritos
        * def timevalidator = read('classpath:helpers/timeValidator.js')
        And match response.articles[1] ==
            """
            {
                "slug": "#string",
                "title": "#string",
                "description": "#string",
                "body": "#string",
                "createdAt": "#? timevalidator(_)",
                "updatedAt": "#? timevalidator(_)",
                "tagList": "#array",
                "author": {
                    "username": "#string",
                    "bio": "##string",
                    "image": "#string",
                    "following": "#boolean"
                },
                "favoritesCount": "#number",
                "favorited": "#boolean"
            }
            """
        # Step 8: Verifique que la ID de slug del Paso 2 exista en uno de los artículos favoritos
        And match response.articles[*].slug contains slug
        * print response


    Scenario: Comment articles
        # Step 1: Obtener los articulos de la global feed
        Given path 'articles'
        And params { limit: 10, offset: 0}
        And header Authorization = 'Token ' + token
        When method Get
        Then status 200

        # Step 2: Obtener los articulos de la global feed
        * def slug = response.articles[0].slug
        * print slug

        # Step 3: Obtener todos los comentarios del articulo
        Given path 'articles/' + slug + '/comments'
        And header Authorization = 'Token ' + token
        When method Get
        Then status 200

        # Step 4: Verificar el esquema de respuesta
        * def timevalidator = read('classpath:helpers/timeValidator.js')
        And match each response.comments ==
            """
            {
                "id": "#number",
                "createdAt": "#? timevalidator(_)",
                "updatedAt": "#? timevalidator(_)",
                "body": "#string",
                "author": {
                    "username": "#string",
                    "bio": "##string",
                    "image": "#string",
                    "following": "#boolean"
                }
            }
            """

        # Step 5: Obtenga el recuento de la longitud de la matriz de comentarios y guárdelo en la variable
        * def responseWithComments = response.comments
        * def cometariosCount = responseWithComments.length

        # Step 6: Haz una solicitud POST para publicar un nuevo comentario
        Given path 'articles/' + slug + '/comments'
        And header Authorization = 'Token ' + token
        And request
            """
            {
                "comment": {
                    "body": "Sabroso"
                }
            }
            """
        When method Post
        Then status 200

        # Step 7: Verifique el esquema de respuesta que debe contener el texto del comentario publicado
        * def timevalidator = read('classpath:helpers/timeValidator.js')
        And match response.comment ==
            """
            {
                "id": "#number",
                "createdAt": "#? timevalidator(_)",
                "updatedAt": "#? timevalidator(_)",
                "body": "#string",
                "author": {
                    "username": "#string",
                    "bio": "##string",
                    "image": "#string",
                    "following": "#boolean"
                }
            }
            """

        # Step 8: Obtenga la lista de todos los comentarios de este artículo una vez más
        Given path 'articles/' + slug + '/comments'
        And header Authorization = 'Token ' + token
        When method Get
        Then status 200
        * def commentId = response.comments[3].id

        # Step 9: Verifique el número de comentarios aumentado en 1 (similar a lo que hicimos con los recuentos de favoritos)
        * def commentCount = response.comments.length
        And match commentCount == cometariosCount + 1
        * print commentCount
        
        # Step 10: Hacer una solicitud DELETE para eliminar el comentario
        Given path 'articles/' + slug + '/comments/' + commentId
        And header Authorization = 'Token ' + token
        When method Delete
        Then status 204
        
        # Step 11: Obtenga todos los comentarios nuevamente y verifique que el número de comentarios disminuyó en 1
        Given path 'articles/' + slug + '/comments'
        And header Authorization = 'Token ' + token
        When method Get
        Then status 200



