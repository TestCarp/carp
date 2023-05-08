import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAddWorker {

    Admin a = new Admin();
    Worker w1 = new Worker();
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
    product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
    product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);

    @Given("an empty list of workers")
    public void an_empty_list_of_workers() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }

    @When("a new worker with ID is added")
    public void a_new_worker_with_id_is_added() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("the worker should be added to the list")
    public void the_worker_should_be_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.setId(1);
        w1.setName("Ahmed Sholi");
        w1.setAddress("Asira-Nablus");
        w1.setPhone("0592735931");

        a.addWorker(w1);
        w1.addProduct(p1);
        w1.addProduct(p2);
        w1.addProduct(p3);
        w1.addProduct(p4);
        w1.addProduct(p5);
        w1.addProduct(p6);

        boolean foundWorker = a.searchWorker(2);
        assertFalse(foundWorker);

    }

    @Given("a list of workers with an existing worker")
    public void a_list_of_workers_with_an_existing_worker() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("a new worker with the same ID is added")
    public void a_new_worker_with_the_same_id_is_added() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @Test

    @Then("the worker should not be added to the list")
    public void the_worker_should_not_be_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.setId(1);
        w1.setName("Ahmed Sholi");
        w1.setAddress("Asira-Nablus");
        w1.setPhone("0592735931");

        a.addWorker(w1);
        w1.addProduct(p1);
        w1.addProduct(p2);
        w1.addProduct(p3);
        w1.addProduct(p4);
        w1.addProduct(p5);
        w1.addProduct(p6);

        boolean foundWorker = a.searchWorker(1);
        assertTrue(foundWorker);
    }


}
