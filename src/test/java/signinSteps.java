/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shikimime
 */
public class signinSteps {
    private String username;
    private String pass;
    private String status;
    @Given("Seorang user dengan {string}")
    public void seorang_user_dengan(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.username=string;
    }

    @Given("Password {string}")
    public void password(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.pass=string;
    }

    @When("Login ke sistem")
    public void login_ke_sistem() {
        // Write code here that turns the phrase above into concrete actions
        HttpResponse<String> response = Unirest.post("https://app.alunalun.info/restful/api/user/signin")
            .header("Content-Type", "application/json")
            .header("wssid", "IVxPf5mM7c/HsiIEuqM0cQ")
            .body("{\n  \"name\": \""+this.username+"\",\n  \"pwd\": \""+this.pass+"\"\n}")
            .asString();
        if(response.getBody().contains("OK")){
            status="OK";
        }else{
            status="FAILED";
        }
    }

    @Then("Sistem mengembalikan {string}")
    public void sistem_mengembalikan(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string,status);
    }

    public signinSteps() {
    }

}
