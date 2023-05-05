import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class TestSendEmail {

    Admin a = new Admin();
    Worker w1 = new Worker();
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,3);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,2);
    product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
    product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
    product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);

    @When("order is complete")
    public void order_is_complete() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }

    @Then("Send email")
    public void send_email() {
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
        int expectedResult = 1;

        int actualResult = 0 ;
        for(int i = 0 ; i < w1.findByNameProduct.size(); i++){
            System.out.println(w1.findByNameProduct.get(i).getProductStatus());
            System.out.println(w1.findByNameProduct.get(i).getProductId());
            if((w1.findByNameProduct.get(i).getProductStatus() == 1) && (w1.findByNameProduct.get(i).getProductId() == 3)){
                // actualResult = 1 ---> in complete
                actualResult = 1;
            }
        }
        assertTrue(actualResult == expectedResult);

    }

    @When("order isn't complete")
    public void order_isn_t_complete() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("print your product is not incomplete yet")
    public void print_your_product_is_not_incomplete_yet() {
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
        int expectedResult = 1;

        int actualResult = 0 ;
        for(int i = 0 ; i < w1.findByNameProduct.size(); i++){
            System.out.println(w1.findByNameProduct.get(i).getProductStatus());
            System.out.println(w1.findByNameProduct.get(i).getProductId());
            if((w1.findByNameProduct.get(i).getProductStatus() == 1) && (w1.findByNameProduct.get(i).getProductId() == 3)){
                // actualResult = 1 ---> in complete
                actualResult = 1;
            }
        }
        assertTrue(actualResult != expectedResult);

    }
}
