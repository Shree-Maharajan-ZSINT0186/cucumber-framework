Feature: login function on automation exercises
  Scenario Outline: TC-001 valid login functionality
    Given user is on login page
    And user enters "<email>"  and "<password>"
    Then user clicks login button

    Examples:
    | email            |  password  |
    | test@zuci.com    |  test@123   |
    | invalid@gmail.com|  invalid123|