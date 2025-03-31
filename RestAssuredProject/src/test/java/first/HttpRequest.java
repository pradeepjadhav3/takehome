package first;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class HttpRequest {
	int id; //global variable
 @Test(priority=1)
	public void getFirstUser()
	{
		given()//content type,set cookies,add auth,add param,set header info
		.when()
		.get("https://reqres.in/api/users?page=2")//get,post,put,delete
		.then() //validate status code,extract response,extract headers cookies, & response body..
		.statusCode(200)
		.body("page", equalTo(2))
		.log().all();
	}
	
	//create user using hash map;
	@Test(priority=2)
	public void CreateUser()
	{
		HashMap hm=new HashMap();
		hm.put("name", "pradeep");
		hm.put("job", "automation test engineer");
		id=given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	//	.then()
	//	.statusCode(201)
	//	.log().all();
		
	
	}
	
	@Test(priority=3,dependsOnMethods= {"CreateUser"})
	public void UpdateUser()
	{
		HashMap hm=new HashMap();
		hm.put("name", "shivprasad");
		hm.put("job", "automation test engineer");
		given()
		.contentType("application/json")
		.when()
		.post("https://reqres.in/api/users"+id)
   		.then()
		.statusCode(201)
		.log().all();
			
	//	
	}
     @Test(priority=4)
	 public void deleteUser()
	 {
    	 
	 given()
	 .when()
	 .delete("https://reqres.in/2"+id)
	 .then()
	 .statusCode(204)
	 .log().all();
	 }
	 
	 
}