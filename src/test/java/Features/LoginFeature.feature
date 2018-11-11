Feature:
  This Features deals wiht login functionality
  Scenario: Login with correct username and password
    Given I navigate to login page
    And Enter the following
    | username | password  |
    | admin    | adminpass |
    And I click Login Button
    Then I should see Userform page