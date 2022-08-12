package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;

public class CheckUserDetails {


    @Given("When website is up")
    public void when_website_is_up()
  {
      String response1= given()
              .log().all()
              .header("content-type", "application/json")
              .when()
              .get("https://reqres.in/")
              .then()
              .log().all()
              .assertThat().statusCode(200)
              .extract().response().asString();
      System.out.println(response1);
  }

    @When("the list is user in page is present")
    public void the_list_is_user_in_page_is_present()
   {
       String response= given()
               .log().all()
               .header("content-type", "application/json")
               .when()
               .get("https://reqres.in/api/users?page=2")
               .then()
               .log().all()
               .assertThat().statusCode(200)
               .extract().response().asString();
       System.out.println(response);
   }

    @Then("check a particular details are present")
    public void check_a_particular_details_are_present()
   {
       String response2= given()
               .log().all()
               .header("content-type", "application/json")
               .when()
               .get("https://reqres.in/api/users/2")
               .then()
               .log().all()
               .assertThat().statusCode(200)
               .extract().response().asString();
       System.out.println(response2);


   }
    @Then("check if invalid data shows warning")
    public void check_if_invalid_data_shows_warning()
   {
       String response3= given()
               .log().all()
               .header("content-type", "application/json")
               .when()
               .get("https://reqres.in/api/users/23")
               .then()
               .log().all()
               .assertThat().statusCode(404)
               .extract().response().asString();
       System.out.println(response3);



   }


}
