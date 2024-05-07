package ShopperPojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner {
	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/v2" ;
		RequestSpecification req=RestAssured.given();//abstraction
		Response res=req.request(Method.GET,"/user/nayana");
		User u = res.as(User.class);
		System.out.println(u.getEmail());

	}
}
