import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSearchCustomerByEmail {

    Customer c = new Customer(1,"Abdullah Ghassan Sholi" , "0592659066" , "Asira-Nablus" , "groupgroup060@gmail.com",200,100);

    Worker w = new Worker();
    @Given("There are customers in the database")
    public void there_are_customers_in_the_database() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("the worker searches for a customer by email")
    public void the_worker_searches_for_a_customer_by_email() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @Test

    @Then("the system should return true if the customer exists and false if they do not exist")
    public void the_system_should_return_true_if_the_customer_exists_and_false_if_they_do_not_exist() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c);
        boolean actualResult = w.searchCustomerByEmail("groupgroup060@gmail.com");
        boolean expectedResult = true;

        assertEquals(actualResult,expectedResult);
    }

}
