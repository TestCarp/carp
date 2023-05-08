import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class TestRecordProductInformations {
    product p = new product();
    @When("entered product data")
    public void entered_product_data() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @Then("check them if true")
    public void check_them_if_true() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        p.setProductDone(true);
        assertTrue(p.getProductDone());

        // test setting the productDone variable to false
        p.setProductDone(false);
        assertFalse(p.getProductDone());

        // test setting the productDone variable to the same value it already has
        boolean initialProductDoneValue = p.getProductDone();
        p.setProductDone(initialProductDoneValue);
        assertEquals(initialProductDoneValue, p.getProductDone());

    }

}
