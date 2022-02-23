$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/LoginWithdataFromDatabse.feature");
formatter.feature({
  "name": "Login to Techfios Login page with data extrated from database",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DbFeature"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DbFeature"
    },
    {
      "name": "@DbScenerio1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Username\" from techfios database",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefination.user_enters_from_techfios_database(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Password\" from techfios database",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefination.user_enters_from_techfios_database(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clikcks on signin button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.user_clikcks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
});