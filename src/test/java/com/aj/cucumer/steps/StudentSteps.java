package com.aj.cucumer.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentSteps {


  @When("^the client calls /api/students$")
  public void theClientCallsApiStudents() throws Throwable {
    System.out.println("The client api call");
  }

  @Then("^the client receives status code of (\\d+)$")
  public void theClientReceivesStatusCodeOf(int statusCode) throws Throwable {
    System.out.println("student status is " + statusCode);
  }

  @And("^the client receives (\\d+) students$")
  public void theClientReceivesStudents(int studentSize) throws Throwable {
    System.out.println("student size is " + studentSize);
  }
}
