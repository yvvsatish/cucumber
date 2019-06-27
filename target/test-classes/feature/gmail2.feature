Feature: validate gmail functionality2

Scenario: verify gmail functionality2
    Given enter valid url for gmail2
    And enter username and password2
    | username | password |
   	| satish | test |
    When login into the application2
    Then validate login screen occurance2