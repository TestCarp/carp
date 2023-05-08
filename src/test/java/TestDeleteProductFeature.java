import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestDeleteProductFeature {
    product p = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    Worker w = new Worker();



    @Test
    @When("invalid id")
    public void invalid_id() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }


    @Then("Delete operation id result")
    public void delete_operation_id_result() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addProduct(p);
        int actualId = 3;

        boolean actualResult = w.deleteProduct(actualId);
        boolean expectId = true;


        assertTrue(actualResult != expectId);

    }


    @Test
    @When("worker entered invalid productId to delete")
    public void worker_entered_invalid_product_id_to_delete() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }


    @Then("Delete operation result productId result")
    public void delete_operation_result_product_id_result() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

        w.addProduct(p);
        int actualId = 1;

        boolean actualResult = w.deleteProduct(actualId);
        boolean expectId = true;


        assertTrue(actualResult == expectId);



    }
}
