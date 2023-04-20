#Author: itachisharingan555@gmail.com

Feature: Login
 

  @loginnop
  Scenario: successfull login with valid credentials
    Given user launch chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And  user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on log out link
    Then page title should be "Your store. Login"
    And close browser
    
      @loginnopdriven
  Scenario Outline: successfull login data driven
    Given user launch chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And  user enters email as "<Email>" and password as "<Password>"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on log out link
    Then page title should be "Your store. Login"
    And close browser
    
     Examples: 
      | Email               |  Password |
      | admin@yourstore.com |  admin    | 
      | name2@gg.com        |  minad    | 
    
