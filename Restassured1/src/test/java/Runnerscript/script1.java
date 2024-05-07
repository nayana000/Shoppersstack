package Runnerscript;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class script1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req=RestAssured.given();
		Response res=req.request(Method.GET,"api/users?page=2");
		String str=res.asString();
		JsonPath jp=new JsonPath(str);
		String s1=jp.get("data[2].first_name");
		System.out.println(s1);
	}
}
