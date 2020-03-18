/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Shikimime
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:target/reports"},
        features= "src/test/resources/signin.feature"
)
public class SignInmain {
    
    public SignInmain() {
    }
    
}
