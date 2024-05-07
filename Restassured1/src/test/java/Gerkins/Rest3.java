package Gerkins;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Rest3 {
	public static void main(String[] args) {
		RequestSpecBuilder req_bui=new RequestSpecBuilder();
		RequestSpecification req=req_bui.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		
		ResponseSpecBuilder res_bui=new ResponseSpecBuilder();
		ResponseSpecification res=res_bui.expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		Response endres=given().spec(req).when().get("/api/users/2").then().spec(res).extract().response();
		System.out.println(endres.asString());
	}
}
