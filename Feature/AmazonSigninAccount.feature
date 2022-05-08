Feature: Sign in Amazon account

@signin
Scenario Outline: Create amazon account with  given values
     Given user on the amazon home page 
      When  click on sign in and account tab
      And  click on create a new account
      And  enter Your name as "<usernmae>"
      And  enter Email address as "<email>"
      And enter password as "<password>"
      And re enter password "<repassword>"
      Then the user can create new account sucessfully
      
      Examples:
      |usernmae|email|password|repassword|
      |vinod229|vinodkumark33@yahoo.com|vinod229|vinod229|

      @signin2
Scenario Outline: Create amazon account with  given values
     Given user on the amazon home page 
      When  click on sign in and account tab
      And  click on create a new account
      And  enter Your name as "<usernmae>"
      And  enter Email address as "<email>"
      And enter password as "<password>"
      And re enter password "<repassword>"
      Then the user can create new account sucessfully
      
      Examples:
      |usernmae|email|password|repassword|
      |vinod2291|vinodkumark33@yaho1o.com|v1inod229|v1inod229|