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
public class singupSteps {
    private String nama;
    private String username;
    private String password;
    @Given("Seorang user dengan nama lengkap {string}")
    public void seorang_user_dengan_nama_lengkap(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.nama=string;
        System.out.println(nama);
    }

    @Given("username {string}")
    public void username(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.username=string;
    }

    @Given("password {string}")
    public void password(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.password=string;
    }

    @When("Didaftarkan ke sistem")
    public void didaftarkan_ke_sistem() {
        // Write code here that turns the phrase above into concrete actions
        HttpResponse<String> response = Unirest.post("https://app.alunalun.info/restful/api/user/signup")
          .header("Content-Type", "application/json")
          .header("wssid", "IVxPf5mM7c/HsiIEuqM0cQ")
          .body("{\n  \"name\": \""+this.nama+"\",\n  \"pwd\": \""+this.password+"\",\n  \"username\": \""+this.username+"\",\n  \"role\": \"User\"\n}")
          .asString();
        String status;
        if(response.getBody().contains("OK")){
            status="OK";
        }else{
            status="FAILED";
        }
        assertEquals(status,"OK");
    }

    @Then("Sistem mengembalikan berhasil")
    public void sistem_mengembalikan_berhasil() {
        // Write code here that turns the phrase above into concrete actions
        HttpResponse<String> response = Unirest.post("https://app.alunalun.info/restful/api/user/signin")
            .header("Content-Type", "application/json")
            .header("wssid", "IVxPf5mM7c/HsiIEuqM0cQ")
            .body("{\n  \"name\": \""+this.nama+"\",\n  \"pwd\": \""+this.password+"\"\n}")
            .asString();
        String status;
        if(response.getBody().contains("OK")){
            status="OK";
        }else{
            status="FAILED";
        }
        assertEquals(status,"OK");
    }

    public singupSteps() {

    }

}
