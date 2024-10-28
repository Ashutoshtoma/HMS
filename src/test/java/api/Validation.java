package api;

import org.testng.Assert;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

public class Validation {
	//@Test
		void getUser() {
			
			given()
			.headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
			.when()
			.get("https://gorest.co.in/public/v2/users/7449942")
			.then()
			.statusCode(200)
			.body("name",equalTo("aasd"))
			.log().all();
		}
		@Test
		void getUser2() {
			Response res = given()
					.headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
					.when()
					.get("https://gorest.co.in/public/v2/users/7449942");
			Assert.assertEquals(res.getStatusCode(),200); //validation for status coe
			
			String body = res.jsonPath().get("gender").toString();
			Assert.assertEquals(body,"male");
			
			
					
			
		}

}
