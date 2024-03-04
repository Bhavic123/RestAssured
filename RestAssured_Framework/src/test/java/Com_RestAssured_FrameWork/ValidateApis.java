package Com_RestAssured_FrameWork;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidateApis {

	DataCreation dd= new DataCreation();
	
	@Test
	public void postUser() {
	 Response data = Http_Actions.createData("");
		data
		.then()
		.log().all();
	}
	
	@Test
	public void readUser() {
		Response data = Http_Actions.readData();
		data
		.then()
		.log().all();
		
	}
	
	@Test
	public void updateUser() {
		Response data = Http_Actions.updateData("");
		data
		.then()
		.log().all();
	}
	
	@Test
	public void deleteUser() {
		Response deleteData = Http_Actions.deleteData();
		deleteData
		.then()
		.log().all();
	}
	
	
}
