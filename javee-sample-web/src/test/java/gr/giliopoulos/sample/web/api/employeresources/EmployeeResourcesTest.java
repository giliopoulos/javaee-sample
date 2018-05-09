package gr.giliopoulos.sample.web.api.employeresources;

import gr.giliopoulos.sample.test.categories.Rest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.jayway.restassured.RestAssured.given;

@Category(Rest.class)
public class EmployeeResourcesTest {

    @Test
    public void testGoogleIsUp(){
        given().when().get("http://www.google.com").then().statusCode(200);
    }

}