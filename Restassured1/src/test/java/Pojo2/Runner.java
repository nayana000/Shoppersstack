package Pojo2;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification  req=RestAssured.given();
		Response res=req.request(Method.GET, "/api/unknown");
		Listresource l=res.as(Listresource.class);
		List<Data> d = l.getData();
		Support s = l.getSupport();
		for (Data d1 : d) {
			System.out.println(d1.getColor());
			
		}
	}
}