import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSearchWorker {

    Admin a = new Admin();
    Worker w1 = new Worker();
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
    product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
    product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);

    @Given("a list of workers")
    public void a_list_of_workers() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("the worker with ID is searched for")
    public void the_worker_with_id_is_searched_for() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("the worker with ID should be found")
    public void the_worker_with_id_should_be_found() {
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

    @When("a non-existent worker with ID is searched for")
    public void a_non_existent_worker_with_id_is_searched_for() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("no worker with ID should be found")
    public void no_worker_with_id_should_be_found() {
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

}
