import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTrackOrder {
    Admin a = new Admin();
    Worker w1 = new Worker();
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,3);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,2);
    product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
    product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
    product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);

    @Test
    @When("admin insert is waiting")
    public void admin_insert_is_waiting() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("show to user your product is in waiting")
    public void show_to_user_your_product_is_in_waiting() {
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
        int expectedResult = 3;

        int actualResult = 0 ;
        for(int i = 0 ; i < w1.findByNameProduct.size(); i++){
            if(w1.findByNameProduct.get(i).getProductStatus() == 3 && w1.findByNameProduct.get(i).getProductId() == 1){
                // actualResult = 3 ---> in waiting
                actualResult = 3;
            }
        }
        assertTrue(actualResult == expectedResult);
    }

    @Test
    @When("admin insert is treatment")
    public void admin_insert_is_treatment() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("show to user your product is in treatment")
    public void show_to_user_your_product_is_in_treatment() {
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
        int expectedResult = 2;

        int actualResult = 0 ;
        for(int i = 0 ; i < w1.findByNameProduct.size(); i++){
            if(w1.findByNameProduct.get(i).getProductStatus() == 2 && w1.findByNameProduct.get(i).getProductId() == 2){
                // actualResult = 2 ---> in treatment
                actualResult = 2;
            }
        }
        assertTrue(actualResult == expectedResult);
    }

    @Test
    @When("admin insert is complete")
    public void admin_insert_is_complete() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("show to user your product is in complete")
    public void show_to_user_your_product_is_in_complete() {
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
}
