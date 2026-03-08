Feature: Add transaction

  Scenario: Add new transaction
    Given Pepito is logged into the aplication
      | userName | password |
      | user     | pass     |
    When Pepito enters the required information for the new transaction
      | date       | amount | description |
      | 12-12-2026 | 500    | Pago        |
    Then Pepito should see a new transaction list with correct details

