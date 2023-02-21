$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/SkyBleuFeature.feature");
formatter.feature({
  "name": "Background color change validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BachGroundColorFeature"
    }
  ]
});
formatter.scenario({
  "name": "White Background Change",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BachGroundColorFeature"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"Set White Background\" white button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackGroundStepDefinition.w_button_exists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the White \"White\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BackGroundStepDefinition.i_click_on_theWhite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white \"white\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackGroundStepDefinition.the_background_color_will_change_to_white(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});