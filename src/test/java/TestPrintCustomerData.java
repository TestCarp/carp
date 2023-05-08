import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestPrintCustomerData {

    Customer c = new Customer(1,"Abdullah Ghassan Sholi" , "0592659066" , "Asira-Nablus" , "groupgroup060@gmail.com",200,100);

    Worker w = new Worker();
    @Given("a list of customers exists")
    public void a_list_of_customers_exists() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("the worker requests to see all customer information")
    public void the_worker_requests_to_see_all_customer_information() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("the system displays the customer ID, name, phone, address, and email for each customer in the list")
    public void the_system_displays_the_customer_id_name_phone_address_and_email_for_each_customer_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c);
        int actId = c.getId();
        String actName = c.getName();
        String actPhone = c.getPhone();
        String actAddress = c.getAddress();
        String actEmail = c.getEmail();

        int expectedId = 1;
        String expectedName = "Abdullah Ghassan Sholi";
        String expectedPhone = "0592659066";
        String expectedAddress = "Asira-Nablus";
        String expectedEmail = "groupgroup060@gmail.com";

        assertTrue(actAddress==expectedAddress && actEmail==expectedEmail && actName==expectedName && actId==expectedId && actPhone==expectedPhone);

    }
}
