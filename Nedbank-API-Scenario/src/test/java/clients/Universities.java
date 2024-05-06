package clients;

import base.APIBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Universities extends APIBase {

    RequestSpecification requestSpecification;
    Response response;

    public Response getUniversities()
    {
        requestSpecification = RestAssured.given();
        response =  requestSpecification.get(endpoint);
        return  response;
    }
}
