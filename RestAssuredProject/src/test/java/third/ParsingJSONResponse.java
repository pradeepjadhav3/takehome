package third;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ParsingJSONResponse {
   @Test
	public void jsonResopnse() {
	//apporach 1
	   given()
	   .contentType(ContentType.JSON)
	   .when()
	   .get("http://localhost:3000/page")
	   
	   .then()
	   .statusCode(200);
	  // .header(headerName, expectedValueMatcher)

}
}
