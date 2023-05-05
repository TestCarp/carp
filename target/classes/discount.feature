Feature: discount
  Scenario: no discount
    When Total Pay less than 1000
    Then no discount

  Scenario: fourth Discount
    When level four , Total pay Greater than 1000 and less than 1500
    Then you will take level four Discount

  Scenario: third Discount
    When level three , Total pay Greater than 1500 and less than 2000
    Then you will take level three Discount

  Scenario: second Discount
    When level two , Total pay Greater than 2000 and less than 3000
    Then you will take level two Discount

  Scenario: first Discount
    When level one , Total pay Greater than 3000
    Then you will take level one Discount