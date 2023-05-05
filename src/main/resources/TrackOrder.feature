Feature: Track Order
  Scenario: is waiting
  When admin insert is waiting
  Then show to user your product is in waiting

  Scenario: is treatment
    When admin insert is treatment
    Then  show to user your product is in treatment

  Scenario: is complete
    When admin insert is complete
    Then show to user your product is in complete

