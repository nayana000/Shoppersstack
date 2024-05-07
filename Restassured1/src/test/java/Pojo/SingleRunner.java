package Pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SingleRunner {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req=RestAssured.given();
		Response res=req.request(Method.GET, "/api/users/2");
		Singleuser u=res.as(Singleuser.class);
		Data d=u.getData();
		Support s=u.getSupport();
		System.out.println(d.getFirst_name());
	}
}
