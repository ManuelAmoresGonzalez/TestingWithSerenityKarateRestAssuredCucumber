package restassured;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {

    @Test
    public void getData(){
        Response response;
        response = given().get("http://5d6fd3a8482b530014d2e8da.mockapi.io/mock/api/v1/users");
        System.out.println(response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void createPost(){
        Response response;
        ///Given
        Map<String, String> user = new HashMap<String, String>();
        user.put("first_name", "Manuel");
        user.put ("last_name", "Amores");
        user .put("email", "manuelamores.2022@globant.com");
        user.put ("country", "COL2020");
        user.put ("telephone", "20202020");
        user.put("active", "true");
        user.put ("job_title", "TAE");

        ///When
        response = given().
                contentType("application/json")
                .body(user)
                .when()
                .post("http://5d6fd3a8482b530014d2e8da.mockapi.io/mock/api/v1/users");
        ///Then
        Assert.assertEquals(response.getStatusCode(), 201);
    }
}
