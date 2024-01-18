package restassuredcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;

public class RestAssuredTest {

    Response response;
    String endpoint = "http://5d6fd3a8482b530014d2e8da.mockapi.io/mock/api/v1/";

    @Given("I call the api service$")
    public void givenStep()throws Throwable{

    }

    @When("I sent the get method to request the list of the user$")
    public void thenStep()throws Throwable{
        response = RestAssured.given().get(endpoint + "users");
    }

    @Then("The response is ok$")
    public void whenStep()throws Throwable{
        System.out.println(response.prettyPrint());
        assertEquals(response.getStatusCode(), 200);
    }
}
