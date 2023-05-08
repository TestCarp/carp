import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestDeleteCustomer {

    Customer c = new Customer(1,"Abdullah Ghassan Sholi" , "0592659066" , "Asira-Nablus" , "groupgroup060@gmail.com",200,100);

    Worker w = new Worker();
    @Given("a list of customers")
    public void a_list_of_customers() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("the customer with ID is deleted")
    public void the_customer_with_id_is_deleted() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("the customer with ID should be removed from the list")
    public void the_customer_with_id_should_be_removed_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c);
        int actualId = 1;

        boolean actualResult = w.deleteCustomer(actualId);
        boolean expectId = true;


        assertEquals(actualResult , expectId);
    }

    @When("the customer with ID is attempted to be deleted")
    public void the_customer_with_id_is_attempted_to_be_deleted() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("no customer with ID should be found")
    public void no_customer_with_id_should_be_found() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c);
        int actualId = 3;

        boolean actualResult = w.deleteCustomer(actualId);
        boolean expectId = true;


        assertNotEquals(actualResult , expectId);
    }

}
