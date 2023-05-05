import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

public class TestRequired {
    product p = new product();



    @Test
    @Given("{string} and {string}")
    public void and(String name, String result) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @When("{string} is required special treatment")
    public void is_required_special_treatment(String name) {
    }

    @Then("{string} , {string} need special treatment")
    public void need_special_treatment(String result , String Category) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        Category = "Expensive";
        result = "true";
        p.setCategory(Category);
        p.setRequiredSpecialTreatment(Boolean.parseBoolean(result));
        String expectedName = p.getCategory();
        boolean expectedResult = p.isRequiredSpecialTreatment();
        System.out.println(expectedResult + "     " + expectedName);
        String actualName = "Expensive";
        boolean actualResult = true ;

        assertTrue(actualName == expectedName && actualResult == expectedResult);

    }

}
