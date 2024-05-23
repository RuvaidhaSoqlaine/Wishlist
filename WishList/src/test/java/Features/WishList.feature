Feature: To add item into the wishlist Functionality

 


Scenario: To check item is added into the wishlist 
Given User is on Home page
When user select the item to added into the wishlist
And Click on whishlist botton present in the product
Then click on wishlist button on the top frame

@smoke
Scenario: Check register for new customer
Given User should click the new customer registered account
When user enters first name and last name and Email and Telephone and Password and Confirm Password
And user select the privacy policy
Then user click on continue button

@regression
Scenario: Check login is successful for returning customer
Given User enter registered Email and password
And click on login button
Then user should navigate WishList page
@smoke
Scenario: Check item added to cart
Given User click on add to cart button in the item to add
Then Click to contine

@regression
Scenario: Check item to remove
Given USer click on remove button in the item to remove
Then click to continue





