Feature: To test Login Page in HomePage

Scenario Outline: To Checks the Login Functionality

Given webdriver to access a browser
And going to "http://automationpractice.com/index.php" page
When user provides <Email>,<Title>,<FirstName>,<LastName>,<Pwd>,<Addrs>,<City>,<State>,<Post>,<AddnInfo> and <Mobile>
Then user <FirstName>,<LastName>  home page will be displayed
And browser will be closed

Examples:
|Email          |Title|FirstName|LastName|Pwd   |Addrs |City|State   |Post |AddnInfo   |Mobile|
|dssfsf3sbzza@mail.com|Mr   |Rav      |Raj     |qwerty|asdfgh|htfd|Delaware|00000|askjfhkjasf|1234567890|