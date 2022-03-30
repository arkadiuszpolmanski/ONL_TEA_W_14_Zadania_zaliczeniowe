Feature: Add Address

  Scenario Outline: User adds a new address
    Given User is on "https://mystore-testlab.coderslab.pl/" page
    And User clicks button Sign In and login
    When User clicks button Addresses and click button Create new address
    And  User types address form "<alias>" "<address>" "<city>" "<postcode>" "<country>" "<phone>" and click button save
    Then Confirm a new address "<alias>" "<address>" "<city>" "<postcode>" "<country>" "<phone>"

    Examples:
      |alias      |address            |city         |postcode |country          |phone        |
      |Nowy adres |Wolności 10        |Katowice     |40-001   | United Kingdom  |123 456 789  |

