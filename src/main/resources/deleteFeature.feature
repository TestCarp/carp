Feature: Delete product
  Scenario Outline: invalid input <id>
    When invalid <id>
    Then Delete operation <id> <result>

    Examples:
    |id | result|
    |3  | "Failed" |

    Scenario Outline: Delete operation Successfully
      When worker entered invalid <productId> to delete
      Then Delete operation result <productId> <result>
      Examples:
      |productId | result |
      |1         | "Success"|


