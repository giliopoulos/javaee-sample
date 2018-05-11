package gr.giliopoulos.sample.web.api.employeresources;

import gr.giliopoulos.sample.test.categories.Rest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


@Category(Rest.class)
public class EmployeeResourcesTest {

    @Test
    public void testEmployeesEndpointIsUp() {
        given().
        when().
                get("http://localhost:8081/javee-sample-web/api/employees").
        then().
                statusCode(200);
    }

    @Test
    public void getEmployeeWithId10001_exists() {
        given().
                pathParam("id", 10001).
        when().
                get("http://localhost:8081/javee-sample-web/api/employees/{id}").
        then().
                body("id",equalTo(10001)).
                body("firstName", equalTo("Georgi"));
    }


}