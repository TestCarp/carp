import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestGenerateStatistics {
    Worker w = new Worker();
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
    product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
    product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);


    // public Customer(int id , String name , String phone , String address , String email , double totalPay , double totalDebts)
    Customer c1 = new Customer(1,"Abdullah Ghassan Sholi" , "0592659066" , "Asira-Nablus" , "groupgroup060@gmail.com",200,200);
    Customer c2 = new Customer(2,"Ali Nabeel Hamadneh" , "0568347481" , "Asira-Nablus" , "groupgroup061@gmail.com",100,500);

    @Test
    @When("all product")
    public void all_product() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("number of delivered product")
    public void number_of_delivered_product() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addProduct(p1);
        w.addProduct(p2);
        w.addProduct(p3);
        w.addProduct(p4);
        w.addProduct(p5);
        w.addProduct(p6);

        int expectedResult = 4;

        int actualResult = 0 ;
        for(int i = 0 ; i < w.findByNameProduct.size(); i++){
            if(w.findByNameProduct.get(i).getProductDone() == true)
                actualResult++;
        }

        assertTrue(actualResult == expectedResult);

    }

    @When("find total cash")
    public void find_total_cash() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("get total cash")
    public void get_total_cash() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c1);
        w.addCustomer(c2);


        int expectedResult = 1000;

        int actualResult = 0 ;
        for(int i = 0 ; i < w.findByNameCustomer.size(); i++){
            actualResult+=w.findByNameCustomer.get(i).getTotalDebts() + w.findByNameCustomer.get(i).getTotalPay() ;
        }
        System.out.println(actualResult);

        assertTrue(actualResult == expectedResult);
    }

    @When("find total payed")
    public void find_total_payed() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("get total payed")
    public void get_total_payed() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c1);
        w.addCustomer(c2);


        int expectedResult = 300;

        int actualResult = 0 ;
        for(int i = 0 ; i < w.findByNameCustomer.size(); i++){
            actualResult+= w.findByNameCustomer.get(i).getTotalPay() ;
        }
        System.out.println(actualResult);

        assertTrue(actualResult == expectedResult);
    }

    @When("find total debts")
    public void find_total_debts() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("get total debts")
    public void get_total_debts() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addCustomer(c1);
        w.addCustomer(c2);


        int expectedResult = 700;

        int actualResult = 0 ;
        for(int i = 0 ; i < w.findByNameCustomer.size(); i++){
            actualResult+=w.findByNameCustomer.get(i).getTotalDebts()  ;
        }
        System.out.println(actualResult);

        assertTrue(actualResult == expectedResult);
    }
}
