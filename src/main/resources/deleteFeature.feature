Feature: Delete product
  Scenario: invalid input id
    When invalid id
    Then Delete operation id result


  Scenario: Delete operation Successfully
      When worker entered invalid productId to delete
      Then Delete operation result productId result



