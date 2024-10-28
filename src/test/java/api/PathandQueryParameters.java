package api;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
public class PathandQueryParameters {
	//@Test
	void query() {
		given()
		.pathParam("mypath","users")
		.when()
		.get("https://gorest.co.in/public/v2/users")
		.then()
		.statusCode(200)
		.log().all();
	}
	




}
