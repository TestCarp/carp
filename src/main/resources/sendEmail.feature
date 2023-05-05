Feature:
  Scenario: order complete
    When order is complete
    Then Send email

  Scenario: order is not complete
    When order isn't complete
    Then print your product is not incomplete yet