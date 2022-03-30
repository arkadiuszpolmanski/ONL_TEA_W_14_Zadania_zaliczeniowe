Feature: Buy Sweater

  Scenario Outline:
    Given User is on "https://mystore-testlab.coderslab.pl/"
    And User is login
    When User searches and clicks on "<product>"
    And User is dying out in "<size>", "<quantity>" and add to cart
    And  User is finishing deal
    Then User has purchased a product

    Examples:
      |size      |quantity     |product                      |
      |L         |5            |Hummingbird Printed Sweater  |