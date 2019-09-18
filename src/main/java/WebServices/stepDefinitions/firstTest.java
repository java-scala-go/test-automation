package WebServices.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class firstTest {

    @Given("^Get a user in service$")
    public void get_a_user_in_service() throws Throwable {
            RequestSpecification request = RestAssured.given();
            Response response = request.get("http://dummy.restapiexample.com/api/v1/employees");
            int statusCode = response.getStatusCode();
            System.out.println("The status code received: " + statusCode);
            System.out.println("Response body: " + response.body().asString());
        }

    @Given("^Create user with name \"([^\"]*)\" salary \"([^\"]*)\" and age \"([^\"]*)\"$")
    public void create_user_with_name_salary_and_age(String name, String salary, String age) throws Throwable {
                RequestSpecification request = RestAssured.given();

                JSONObject requestParams = new JSONObject();
                requestParams.put("name", name);
                requestParams.put("salary", salary);
                requestParams.put("age", age);
                Response response = request.post("http://dummy.restapiexample.com/api/v1/create");
                int statusCode = response.getStatusCode();
                System.out.println("The status code received: " + statusCode);
                System.out.println("Response body: " + response.body().asString());

        }

    @When("^Update User userid \"([^\"]*)\" with name \"([^\"]*)\" salary \"([^\"]*)\" and age \"([^\"]*)\"$")
    public void update_User_userid_with_name_salary_and_age(String id, String name, String salary, String age){
            RequestSpecification request = RestAssured.given();

                JSONObject requestParams = new JSONObject();
                requestParams.put("name", name);
                requestParams.put("salary", salary);
                requestParams.put("age", age);
                String uRI = "http://dummy.restapiexample.com/api/v1/update/" + id;
                System.out.println(uRI);
                Response response = request.put(uRI);
                int statusCode = response.getStatusCode();
                System.out.println("The status code received: " + statusCode);
                System.out.println("Response body: " + response.body().asString());

        }
}
