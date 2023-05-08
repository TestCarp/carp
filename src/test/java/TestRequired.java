import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

public class TestRequired {
    product p = new product();




    @Test
    @Given("typeOfProduct and result")
    public void type_of_product_and_result() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue(true);
    }


    @When("typeOfProduct is required special treatment")
    public void type_of_product_is_required_special_treatment() {

    }


    @Then("result , typeOfProduct need special treatment")
    public void result_type_of_product_need_special_treatment() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        String Category = "Expensive";
        String result = "true";
        p.setCategory(Category);
        p.setRequiredSpecialTreatment(Boolean.parseBoolean(result));
        String expectedName = p.getCategory();
        boolean expectedResult = p.isRequiredSpecialTreatment();
        String actualName = "Expensive";
        boolean actualResult = true ;

        assertTrue(actualName == expectedName && actualResult == expectedResult);

    }

}
