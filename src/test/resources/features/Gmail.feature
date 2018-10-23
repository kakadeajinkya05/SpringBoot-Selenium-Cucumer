Feature: Login Feature File

  Scenario: Login scenario test for Gmail
    Given navigate to Gmail page
    When user logged in using username as user and password as pass
    Then home page should be displayed