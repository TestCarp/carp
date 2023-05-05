Feature: add new Product

  Scenario Outline: all inputs is true <productId> <category> <picture> <dimenssion> <cost>
    When worker insert all required values
    Then add product Successfully <productId> <category> <picture> <dimenssion> <cost>

    Examples:
    |productId | category | picture | dimenssion | cost |
    | 1 | "Tufted" | "https://persiancarpet.com/images/making-a-tufted-rug.jpg" | "400X300" | 99.99|



  Scenario Outline: add exist product <productId> <category> <picture> <dimenssion> <cost>
    When add product with exist id
    Then print this product exist <productId> <category> <picture> <dimenssion> <cost>

    Examples:
      |productId | category | picture | dimenssion | cost |
      | 1 | "Tufted" | "https://persiancarpet.com/images/making-a-tufted-rug.jpg" | "400X300" | 99.99|

