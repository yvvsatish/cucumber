Feature: validate gmail functionality

@SmokeTest @RegressionTest
Scenario: verify gmail functionality
    Given enter valid url for gmail
    And enter username and password
    | satish | test |
    When login into the application
    Then validate login screen occurance
    
    @SmokeTest
    Scenario: verify login functionality
    Given enter valid url for login