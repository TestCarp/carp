Feature: generate Statistics
  Scenario: check number of delivered product
    When all product
    Then number of delivered product

  Scenario: total cash
    When find total cash
    Then get total cash

  Scenario: total payed
    When find total payed
    Then get total payed

  Scenario: total debts
    When find total debts
    Then get total debts