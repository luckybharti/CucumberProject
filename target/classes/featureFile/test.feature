Feature: Customer login.
  
  As Customer I need to login onto the filpkart 
  to purchase the Mobile product.

  
  Scenario: Login on flipkart website
    Given User on home page
    When Login by User
    And User lands on profile page 
    Then The profile page displays the user’s personal info
  