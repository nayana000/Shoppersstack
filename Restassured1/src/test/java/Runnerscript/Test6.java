package Runnerscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test6 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/" ;
		RequestSpecification req=RestAssured.given();//abstraction
		Response res=req.request(Method.GET,"/api/unknown/23");
		System.out.println(res.asString());

	}

}
