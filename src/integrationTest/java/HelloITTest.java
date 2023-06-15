import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusIntegrationTest
public class HelloITTest {

    @Test
    public void testHelloEndpoint() {
        System.out.println("Test start");
        given()
                .when().get("/hello")
                .then()
                .statusCode(200);
        System.out.println("Test end");
    }
}
