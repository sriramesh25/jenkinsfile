$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "This Features deals wiht login functionality",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with correct username and password",
  "description": "",
  "id": ";login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the following",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "admin",
        "adminpass"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see Userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToLoginPage()"
});
formatter.result({
  "duration": 24526414400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.enterTheFollowing(DataTable)"
});
formatter.result({
  "duration": 798815000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickLoginButton()"
});
formatter.result({
  "duration": 819014700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeUserformPage()"
});
formatter.result({
  "duration": 45900,
  "status": "passed"
});
});