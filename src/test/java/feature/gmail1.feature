Feature: validate gmail functionality1

Background:
    Given the user is logged in
    And goes to landing page
    
Scenario Outline: verify gmail functionality1
    Given enter valid url for gmail1
    And enter "<username>" and "<password>"1
    When login into the application1
    Then validate login screen occurance1
    
   Examples:
   | username | password |
   | satish | test |