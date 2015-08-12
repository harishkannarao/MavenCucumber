package com.harishkannarao.cucumber.service;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.enterprise.context.ApplicationScoped;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@ApplicationScoped
public class CustomServiceSteps {

    private CustomService customService = new CustomService();
    private String name;

    @Given("^I pass the name as \"(.*)\" to getMessage method of customService$")
    public void I_pass_the_name_as_to_getMessage_method_of_customService(String name) throws Throwable {
        this.name = name;
    }

    @Then("^I should see the message as \"(.*)\" from getMessage method of customService$")
    public void I_should_see_the_message_as_from_getMessage_method_of_customService(String expectedMessage) throws Throwable {
        assertEquals(expectedMessage, customService.getMessage(this.name));
    }

    @Given("^I pass the name as null to getMessage method of customService$")
    public void I_pass_the_name_as_null_to_getMessage_method_of_customService() throws Throwable {
        this.name = null;
    }

    @Then("^I should see the message as null from getMessage method of customService$")
    public void I_should_see_the_message_as_null_from_getMessage_method_of_customService() throws Throwable {
        assertNull(customService.getMessage(this.name));
    }
}
