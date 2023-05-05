import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class TestInvoice {
    @When("coustmer went to visit the washer")
    public void coustmer_went_to_visit_the_washer() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @Then("the worker give invoice to the customer")
    public void the_worker_give_invoice_to_the_customer() {

                Worker w = new Worker();
                product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
                Customer c1 = new Customer(1,"Abdullah Ghassan Sholi" , "0592659066" , "Asira-Nablus" , "groupgroup060@gmail.com",200,200);
                w.addProduct(p1);
                w.addCustomer(c1);

                double expectedResult1 = 99.99;

                double actualResult1 = 0 ;
                for(int i = 0 ; i < w.findByNameProduct.size(); i++){
                    actualResult1 = w.findByNameProduct.get(i).getCost() ;
                }
                System.out.println(actualResult1);


                String expectedResult2 = "Asira-Nablus";

                String actualResult2 = "Asira-Nablus" ;
                for(int i = 0 ; i < w.findByNameCustomer.size(); i++){
                    actualResult2 = w.findByNameCustomer.get(i).getAddress() ;
                }
                System.out.println(actualResult2);

                // assertTrue(actualResult == expectedResult);

                int expectedResult3 = 1;

                int actualResult3 = 1 ;
                for(int i = 0 ; i < w.findByNameProduct.size(); i++){
                    actualResult3 = w.findByNameProduct.get(i).getProductId() ;
                }
                System.out.println(actualResult3);

                assertTrue(actualResult1 == expectedResult1 && actualResult2==expectedResult2 && actualResult3==expectedResult3);


        }
    }

