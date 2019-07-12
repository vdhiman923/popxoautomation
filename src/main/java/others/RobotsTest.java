package others;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import objects.RobotsPFOM;

public class RobotsTest 
{	
	@BeforeMethod
	public void before()
	{
			
	}
	
	@AfterMethod
	public void after()
	{
		//driver.close();
	}
	
	@Test(enabled= true)
	public void robots() 
	{
//		Response res = RestAssured.get("https://www.popxo.com/robots.txt");
//		RequestSpecification req = RestAssured.given();
//	    req.header("Content-Type", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
//		System.out.println(res.getBody());
		
	Response res=	(Response) given().
			contentType("application/json").
			when().
			get("https://www.popxo.com/robots.txt").
			then().
			extract();
			res.prettyPrint();

			given().
			contentType("application/json").
			when().
			get("https://www.popxo.com/robots.txt").
			then().
			statusCode(200);

	}

	
}
