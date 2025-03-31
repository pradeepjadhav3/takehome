package second;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {

	//@Test
	public void testCookies() {
		 given()
		 .when()
		 .get("https://www.google.com/")
		 .then()
		 .log().all();

	}
	
	//@Test
	//get single cookies
	 public void getSingleCookies() {
		Response res= given()
		 .when()
		 .get("https://www.google.com/");
		  String cookies_value= res.getCookie("AEC");
		  System.out.println("cookies value="+cookies_value);
		  
		
	}
	@Test
	
	//get all cookies
	  public void getAllCookies() {
		
		Response res= given()
				 .when()
				 .get("https://www.google.com/");
		Map<String,String> allcookiesvalue= res.getCookies();
		//System.out.println("allcookies value="+allcookiesvalue.keySet());
			 for(String i:allcookiesvalue.keySet())	
			 {
				 System.out.println(i+"   "+allcookiesvalue);
			 }
	}
	
}


