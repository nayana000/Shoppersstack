package Runnerscript;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Post {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req=RestAssured.given();
	JSONObject obj= new JSONObject();
	obj.put( "name", "morpheus");
	obj.put("job", "leader");
	req.contentType(ContentType.JSON);
}
}
