package examplesTestApi;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class FirstTestApiRestassured {

    @Test
    public void requestUsZipCdde90210_checkPlaceNameInResponseBOdy_expectBeverlyHills(){
        given().when().get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }
}
