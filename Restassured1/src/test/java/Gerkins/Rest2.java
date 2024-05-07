package Gerkins;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Rest2 {
	public static void main(String[] args) {
		RequestSpecBuilder req_bui=new RequestSpecBuilder();
		RequestSpecification req=req_bui.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		Response res=given().spec(req).when().get("/api/users/2").then().assertThat().statusCode(200).extract().response();
		System.out.println(res.asString());
	}
}
