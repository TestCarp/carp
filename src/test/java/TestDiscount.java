import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Customer;
import org.example.Worker;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDiscount {
    Worker w1 = new Worker();
    Customer c1 = new Customer(1, "Ali", "0592659066", "Asira", "groupgroup060@gmail.com", 1399.99, 199.99);


    @When("total payed entered")
    public void total_payed_entered() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("generate discount")
    public void generate_discount() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.addCustomer(c1);

        boolean expectedResult = true;

        boolean actualResult = false;
        for (int i = 0; i < w1.findByNameCustomer.size(); i++) {
            if (w1.searchCustomer(1)) {
                if (w1.findByNameCustomer.get(i).getTotalPay() < 1000) {
                    actualResult = true;
                    assertEquals(actualResult , expectedResult);
                } else if (w1.findByNameCustomer.get(i).getTotalPay() > 1000 && w1.findByNameCustomer.get(i).getTotalPay() <= 1500) {
                    actualResult = true;
                    assertEquals(actualResult , expectedResult);
                } else if (w1.findByNameCustomer.get(i).getTotalPay() > 1500 && w1.findByNameCustomer.get(i).getTotalPay() <= 2000) {
                    actualResult = true;
                    assertEquals(actualResult , expectedResult);
                } else if (w1.findByNameCustomer.get(i).getTotalPay() > 2000 && w1.findByNameCustomer.get(i).getTotalPay() <= 3000) {
                    actualResult = true;
                    assertEquals(actualResult , expectedResult);
                } else if (w1.findByNameCustomer.get(i).getTotalPay() > 3000) {
                    actualResult = true;
                    assertEquals(actualResult , expectedResult);
                }

            } else
                System.out.println("org.example.Customer not found");
        }
    }

}