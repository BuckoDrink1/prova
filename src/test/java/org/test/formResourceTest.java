package org.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class formResourceTest {

    @Test
    public void testForm() {
        given().when()
                .get("/form")
                .then()
                .statusCode(200);
    }
}
