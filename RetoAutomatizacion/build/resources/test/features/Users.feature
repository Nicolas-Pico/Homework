Feature: I as a user of SWAGLABS
  I want to validate the users
  to check that they work correctly
  Scenario Outline: Validate Users
    Given Nicolas is on the home page
    When  Nicolas enter the following data
    |Username  |<Username>  |
    |Password  |<Password>  |
    |Firstname |<Firstname> |
    |Lastname  |<Lastname>  |
    |Postalcode|<Postalcode>|
    Then Nicolas sees its a message
    |Username|<Username>|
    |Message |<Message> |

    Examples:
    | Username                | Password     | Firstname | Lastname | Postalcode | Message                                             |
    | standard_user           | secret_sauce | Andrey    | Daza     | 123456     | THANK YOU FOR YOUR ORDER                            |
    | locked_out_user         | secret_sauce |           |          |            | Epic sadface: Sorry, this user has been locked out. |
    | problem_user            | secret_sauce | Andrey    | Daza     | 123456     | Error: Last Name is required                        |
    | performance_glitch_user | secret_sauce | Andrey    | Daza     | 123456     | THANK YOU FOR YOUR ORDER                            |