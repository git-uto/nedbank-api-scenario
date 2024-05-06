package tests;

import base.APIBase;
import clients.Universities;
import io.restassured.response.Response;
import org.codehaus.groovy.ast.stmt.IfStatement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UniversitiesSearchTest {
    Universities universities;
    Response response;
    String stateProvincePath = "[0].{}.state-province";
    String universityNamePath = "[0].{}.name";
    String universityName;
    String stateProvince;


    @BeforeMethod
    private void setup() {
        universities = new Universities();
    }
    public String getStateProvincePath()
    {
        universityName = response.jsonPath().getString(universityNamePath);
        if (universityName == "University of Witwatersrand")
        {
            stateProvince = response.jsonPath().getString(stateProvincePath);
        }
        System.out.println(stateProvince);
        return  stateProvince;
    }


    @Test
    public void getStateProvince() {
        response = universities.getUniversities();
        System.out.println(response.asPrettyString());
    }

}
