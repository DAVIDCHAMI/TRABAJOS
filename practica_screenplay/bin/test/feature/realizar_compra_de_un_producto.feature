#Author: your.email@your.domain.com

Feature: Buy a product

As a user logged in app
I want buy a products
to see the purchase done

 Scenario Outline: do buy product
    Given david logged en app whith <user> and <pass>
    When  makes a buy
    Then david see the purchase done.
   Examples: 
    |user                      |pass    |
    |"chamirojo.16@hotmail.es" |"123456"|
    

Scenario Outline: asks for a receipt
 Given david logged whith <user> and <pass>
 When david makes buy the:
  |product                     |
  |Faded Short Sleeve T-shirts |
  |Blouse                      |
 Then should see the values the: "Payment amount" 
  
 Examples: 
    |user                      |pass    |
    |"chamirojo.16@hotmail.es" |"123456"|