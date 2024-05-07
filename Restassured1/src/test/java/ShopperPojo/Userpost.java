package ShopperPojo;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Userpost {
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RequestSpecification req=RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("id", 0);
		obj.put("username", "nayana");
		obj.put("firstname", "nayanashree");
		obj.put("lastname", "s");
		obj.put("email", "nayana@gmail.com");
		obj.put("password", "nayana");
		obj.put("phone", "9087654321");
		obj.put("userStatus", 0);
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res=req.request(Method.POST,"/user");
		System.out.println(res.asString());	
	}
}
