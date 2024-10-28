package api;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

public class PostBody {
	//@Test
	void HashMethod() {
		HashMap hm = new HashMap();
		hm.put("name","Ashu");
		hm.put("gender","Male");
		hm.put("email","Ashu@456gmail.com");
		hm.put("status","Active");
		
		given()
		 .body(hm)
		 .headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		 .contentType("application/json")
		
		 .when()
		 .post("https://gorest.co.in/public/v2/users")
		 
		 .then()
		 .statusCode(201)
		 .log().all();
	}
	
	//@Test
	void jsonvala() {
		JSONObject J = new JSONObject();
		J.put("name","Aashu");
		J.put("gender","Male");
		J.put("email","Aashu@456gmail.com");
		J.put("status","Active");
		given()
		 .body(J)
		 .headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		 .contentType("application/json")
		
		 .when()
		 .post("https://gorest.co.in/public/v2/users")
		 
		 .then()
		 .statusCode(201)
		 .log().all();
	}
	
	@Test
	void pojoMethod() {
		pojo_postRequest p = new pojo_postRequest();
		p.setName("AAAshutosh");
		p.setGender("Male");
		p.setEmail("Aaaashu@456gmail.com");
		p.setStatus("Active");
		given()
		 .body(p)
		 .headers("Authorization","Bearer 7d6932760ffc9c7bb0eb7ce0f2159fdcdb20216189e666a6a667392bc9d08647")
		 .contentType("application/json")
		
		 .when()
		 .post("https://gorest.co.in/public/v2/users")
		 
		 .then()
		 .statusCode(201)
		 .log().all();
		
	}
	

}
