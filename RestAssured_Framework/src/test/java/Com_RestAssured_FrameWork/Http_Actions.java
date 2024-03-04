package Com_RestAssured_FrameWork;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Http_Actions {

	
	public static Response createData(String data) {
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data)
				.when()
				.post(EndPoints.postUrl);
		return res;

	}

	
	public static Response readData() {
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(EndPoints.getUrl);
		return res;

	}

	
	public static Response updateData(String data) {
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data)
				.when()
				.put(EndPoints.putUrl);
		return res;
	}

	
	public static Response deleteData() {
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.delete(EndPoints.deleteUrl);
		return res;
	}

}
