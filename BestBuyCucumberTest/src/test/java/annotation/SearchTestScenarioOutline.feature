Feature: SearchTestScenarioOutline 
 

Background: 
   User navigates to Best Buy home page 
   Given I am on Best Buy home page 


Scenario Outline: 
   When I enter search Term as "<term>"
   Then search page should display "<term>"
    
Examples: 
| term 	 |
| coffee |
| biscuit |
| chair |

