import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestDeleteProductFeature {
    product p = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    Worker w = new Worker();


    @Test
    @When("invalid {int}")
    public void invalid(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }

    @Then("Delete operation {int} {string}")
    public void delete_operation(Integer actualId, String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addProduct(p);
        actualId = 3;

        boolean actualResult = w.deleteProduct(actualId);
        boolean expectId = true;


        assertTrue(actualResult != expectId);

    }

    @Test

    @When("worker entered invalid {int} to delete")
    public void worker_entered_invalid_to_delete(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }

    @Then("Delete operation result {int} {string}")
    public void delete_operation_result(Integer actualId, String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

        w.addProduct(p);
        actualId = 1;

        boolean actualResult = w.deleteProduct(actualId);
        boolean expectId = true;


        assertTrue(actualResult == expectId);



    }
}
