$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/signin.feature");
formatter.feature({
  "name": "Login User",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user sign in",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Seorang user dengan \u003cusername\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Login ke sistem",
  "keyword": "When "
});
formatter.step({
  "name": "Sistem mengembalikan \u003chasil\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "hasil"
      ]
    },
    {
      "cells": [
        "\"shikimime3\"",
        "\"aja\"",
        "\"FAILED\""
      ]
    },
    {
      "cells": [
        "\"shikimime3\"",
        "\"1234\"",
        "\"OK\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "user sign in",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Seorang user dengan \"shikimime3\"",
  "keyword": "Given "
});
formatter.match({
  "location": "signinSteps.seorang_user_dengan(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Password \"aja\"",
  "keyword": "And "
});
formatter.match({
  "location": "signinSteps.password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login ke sistem",
  "keyword": "When "
});
formatter.match({
  "location": "signinSteps.login_ke_sistem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistem mengembalikan \"FAILED\"",
  "keyword": "Then "
});
formatter.match({
  "location": "signinSteps.sistem_mengembalikan(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user sign in",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Seorang user dengan \"shikimime3\"",
  "keyword": "Given "
});
formatter.match({
  "location": "signinSteps.seorang_user_dengan(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Password \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "signinSteps.password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login ke sistem",
  "keyword": "When "
});
formatter.match({
  "location": "signinSteps.login_ke_sistem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistem mengembalikan \"OK\"",
  "keyword": "Then "
});
formatter.match({
  "location": "signinSteps.sistem_mengembalikan(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});