import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Worker;
import org.example.product;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDeleteProductFeature {
    product p = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    Worker w = new Worker();



    @Test
    @When("invalid id")
    public void invalid_id() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue(true);

    }


    @Then("Delete operation id result")
    public void delete_operation_id_result() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addProduct(p);
        int actualId = 3;

        boolean actualResult = w.deleteProduct(actualId);
        boolean expectId = true;


        assertNotEquals(actualResult , expectId);

    }


    @Test
    @When("worker entered invalid productId to delete")
    public void worker_entered_invalid_product_id_to_delete() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue(true);

    }


    @Then("Delete operation result productId result")
    public void delete_operation_result_product_id_result() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

        w.addProduct(p);
        int actualId = 1;

        boolean actualResult = w.deleteProduct(actualId);
        boolean expectId = true;


        assertEquals(actualResult , expectId);



    }
}
