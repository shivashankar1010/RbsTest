Feature: Tests Bread crumbs screen features
  User stories covered :- VOA-815


  Background: User is signed into the autopracitce
    Given User navigate into autopractise website
    Then  User entered the user name and password  into autopractise website

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
    Then verify the<"Here are the orders you've placed since your account was created"



