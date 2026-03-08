Feature: Registration

  Scenario Outline: Successfull registration
    Given Pepito wants to sign up in teh application
    When Pepito sends the required information to sign up
      | name   | last name    | age   | email   | country  |
      | <name> | <last name> | <age> | <email> | <country> |
    Then Pepito should have a new account created
    Examples:
      | name     | last name | age | email                      | country  |
      | Jhonatan | Quintana  | 23  | jhonata.quintana@gmail.com | Colombia |
      | Zoro     | Fox       | 23  | jhonata.quintana@gmail.com | Colombia |

  Scenario: Missing requiered fields for registration
    Given Pepito wants to sign up in teh application
    When Pepito does not send the required information
    Then Pepito should be told all fields are required

