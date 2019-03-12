Feature: Tests for sigin in page

  Scenario Outline: User is signed into the autopracitce
   Given User navigate into autopractise website
   Then  User entered the user name and password  into autopractise website
   And I enter a <emailid>
   And I enter <password>
    Then click on sign in button

  Examples:
 | emailid               | password    |
  | "Sashaooo@gmail.com" | "Sashaooo" |


  Scenario: As a user updated the personal account information
  Then click on the my personal information
   Then click on the first name
  Then update the first name
   Then click on the Save button
   Then enter the password
   Then click on the Save button
   Then verify < Your personal information has been successfully updated.> dispalyed to the user



  Scenario: As a BA user, I should be able to navigate to and verify Breadcrumbs available on Council Tax Page
    Given User logged into autopractise website
    Then user click on the Tshirt link
    Then click on the add to cart
    Then click on the proceed to checkout
    Then click on the check box for the Terms of service
    Then click on the proceed to checkout again
    Then click on the pay by bank wire
    Then click on the I confirm the order
    Then click on the view my customer account information
    Then click on the order histroy and details
    Then verify the <"Here are the orders you've placed since your account was created"> is dispalyed to the user

