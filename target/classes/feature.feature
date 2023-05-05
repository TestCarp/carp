Feature: Full information for the product
  Scenario Outline: special treatment
    Given <typeOfProduct> and <result>
    When <typeOfProduct> is required special treatment
    Then <result> , <typeOfProduct> need special treatment

      Examples:
    | typeOfProduct | result |
    | "Expensive"   | "yes"  |