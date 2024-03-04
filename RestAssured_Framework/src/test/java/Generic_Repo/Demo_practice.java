package Generic_Repo;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class Demo_practice {

	@Test
	public void Get() {

		given()

				.when().get("http://localhost:3000/students").then().log().all();
	}

	@Test
	public void post() {
		HashMap hm = new HashMap();
		hm.put("name", "balaji");
		hm.put("locatoin", "dev");
		given().body(hm).when().post("http://localhost:3000/students").then().log().all();
	}

	@Test
	public void put() {
		HashMap hm = new HashMap();
		hm.put("name", "ramudu");
		hm.put("locatoin", "Kakinada");
		given().body(hm).when().put("http://localhost:3000/students/c566").then().log().all();
	}

	@Test
	public void delete() {

		given()

				.when().delete("http://localhost:3000/students/6359").then().log().all();
	}
}
