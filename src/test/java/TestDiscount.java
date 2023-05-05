import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestDiscount {
    Worker w1 = new Worker();
    Customer c1 = new Customer(1,"Ali","0592659066","Asira","groupgroup060@gmail.com",1399.99,199.99);


    @When("Total Pay less than {int}")
    public void total_pay_less_than(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("no discount")
    public void no_discount() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.addCustomer(c1);

        boolean expectedResult = true;

        boolean actualResult =false ;
        for(int i = 0 ; i < w1.findByNameCustomer.size(); i++){
            if(w1.searchCustomer(1)) {
                if (w1.findByNameCustomer.get(i).getTotalPay() < 1000)
                    actualResult = true;
            }
            else
                System.out.println("Customer not found");
        }

        assertTrue(actualResult == expectedResult);
    }

    @When("level four , Total pay Greater than {int} and less than {int}")
    public void level_four_total_pay_greater_than_and_less_than(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("you will take level four Discount")
    public void you_will_take_level_four_discount() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.addCustomer(c1);

        boolean expectedResult = true;

        boolean actualResult =false ;
        for(int i = 0 ; i < w1.findByNameCustomer.size(); i++){
            if(w1.searchCustomer(1)) {
                if (w1.findByNameCustomer.get(i).getTotalPay() > 1000 && w1.findByNameCustomer.get(i).getTotalPay() <= 1500)
                    actualResult = true;
            }
            else
                System.out.println("Customer not found");
        }

        assertTrue(actualResult == expectedResult);
    }

    @When("level three , Total pay Greater than {int} and less than {int}")
    public void level_three_total_pay_greater_than_and_less_than(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("you will take level three Discount")
    public void you_will_take_level_three_discount() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.addCustomer(c1);

        boolean expectedResult = true;

        boolean actualResult =false ;
        for(int i = 0 ; i < w1.findByNameCustomer.size(); i++){
            if(w1.searchCustomer(1)) {
                if (w1.findByNameCustomer.get(i).getTotalPay() > 1500 && w1.findByNameCustomer.get(i).getTotalPay() <= 2000)
                    actualResult = true;
            }
            else
                System.out.println("Customer not found");
        }

        assertTrue(actualResult == expectedResult);
    }

    @When("level two , Total pay Greater than {int} and less than {int}")
    public void level_two_total_pay_greater_than_and_less_than(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("you will take level two Discount")
    public void you_will_take_level_two_discount() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.addCustomer(c1);

        boolean expectedResult = true;

        boolean actualResult =false ;
        for(int i = 0 ; i < w1.findByNameCustomer.size(); i++){
            if(w1.searchCustomer(1)) {
                if (w1.findByNameCustomer.get(i).getTotalPay() > 2000 && w1.findByNameCustomer.get(i).getTotalPay() <= 3000)
                    actualResult = true;
            }
            else
                System.out.println("Customer not found");
        }

        assertTrue(actualResult == expectedResult);
    }

    @When("level one , Total pay Greater than {int}")
    public void level_one_total_pay_greater_than(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("you will take level one Discount")
    public void you_will_take_level_one_discount() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w1.addCustomer(c1);

        boolean expectedResult = true;

        boolean actualResult =false ;
        for(int i = 0 ; i < w1.findByNameCustomer.size(); i++){
            if(w1.searchCustomer(1)) {
                if (w1.findByNameCustomer.get(i).getTotalPay() > 3000)
                    actualResult = true;
            }
            else
                System.out.println("Customer not found");
        }

        assertTrue(actualResult == expectedResult);
    }




}
