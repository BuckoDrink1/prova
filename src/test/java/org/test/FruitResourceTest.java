package org.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class FruitResourceTest {

    @Inject
    FruitService fruitService;

    @Test
    public void testList() {
        given().when()
                .get("/fruits")
                .then()
                .statusCode(200)
                .body(is(fruitService.list()));
    }
}
