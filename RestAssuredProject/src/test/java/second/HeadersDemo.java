package second;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class HeadersDemo {

	@Test
	public void getHeaders() {
		given()
		.when()
		.get("https://www.google.com/")
		.then()
		.header("Content-Type","text/html; charset=ISO-8859-1")
		.header("Content-Encoding", "gzip")
		.header("Server", "gws")
		.log().all();

	}
}
