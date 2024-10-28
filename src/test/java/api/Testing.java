package api;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import java.util.HashMap;
public class Testing {	
	int val;
	@Test(priority=2)
	void getUser() {
		
		given()
		.headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		.when()
		.get("https://gorest.co.in/public/v2/users" +val)
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority=1)
	void createUser() {
		HashMap hm = new HashMap();
		hm.put( "name","aad" );
		hm.put( "email","aaf@gmail.com" );
		hm.put( "gender","Male" );
		hm.put( "status","Active" );
		
		val=given()
		.body(hm)
		.headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		.contentType("Application/json")
		
		.when()
		.post("https://gorest.co.in/public/v2/users")
		.jsonPath().getInt("id");
		
		//.then()
		//.statusCode(201)
		//.log().all();
	}
	
	//7449942
	@Test(priority=3)
	void updateUser() {
		HashMap hm = new HashMap();
		hm.put( "name","abdfgcd" );
		hm.put( "email","assdfgaf@gmail.com" );
		hm.put( "gender","Malse" );
		hm.put( "status","Active" );
		
		given()
		.body(hm)
		.headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		.contentType("Application/json")
		
		.when()
		.put("https://gorest.co.in/public/v2/users" + val)
		
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority=4)
	void deleteUser() {
		given()
		.headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		
		.when()
		.delete("https://gorest.co.in/public/v2/users" + val)
		
		.then()
		.statusCode(204)
		.log().all();
	}

}
