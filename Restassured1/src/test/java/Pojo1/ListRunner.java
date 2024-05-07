package Pojo1;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ListRunner {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req=RestAssured.given();
		Response res=req.request(Method.GET, "/api/users?page=2");
		Listusers l=res.as(Listusers.class);
		List<Data> d=l.getData();
		Support s=l.getSupport();
		for(Data d1:d)
		{
			System.out.println(d1.getFirst_name());
		}
	}
}
