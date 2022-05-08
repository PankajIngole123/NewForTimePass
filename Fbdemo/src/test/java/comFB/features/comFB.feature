Feature: Login to fb

  Scenario Outline: Login to fb account
    Given open account
    And add "<password>" and "<userid>"
    When hit login button

    Examples: 
      | password                | userid     |
      | Ingole                  | panoajd    |
      | Pankajingole5@gmail.com | Origin#123 |
