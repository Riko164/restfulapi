Feature: Login User

Scenario Outline: user sign in
    Given Seorang user dengan <username>
    And Password <password>
    When Login ke sistem
    Then Sistem mengembalikan <hasil>

    Examples: 
      | username | password | hasil  |
      | "shikimime3" | "aja" | "FAILED"  |
      | "shikimime3" | "1234" | "OK" |

