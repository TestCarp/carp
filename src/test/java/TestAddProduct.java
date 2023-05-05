import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAddProduct {
    Worker w = new Worker();
    product p = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99, true,1);
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);

    @Test
    @When("worker insert all required values")
    public void worker_insert_all_required_values() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("add product Successfully {int} {string} {string} {string} {double}")
    public void add_product_successfully(Integer actualId, String actualCategory, String actualPicture, String actualDimenssion, Double actualCost) {

        w.addProduct(p);
        actualId = p.getProductId();
        actualCategory = p.getCategory();
        actualPicture = p.getPicture();
        actualDimenssion = p.getDimenssion();
        actualCost = p.getCost();

        int expectId = 1;
        String expectCategory = "Tufted Carpets";
        String expectPicture = "https://persiancarpet.com/images/making-a-tufted-rug.jpg";
        String expectDimenssion = "400X300";
        double expectCost =99.99;

        assertTrue(actualId == expectId && actualCategory.equals(expectCategory) && actualPicture.equals(expectPicture) && actualDimenssion.equals(expectDimenssion) && actualCost == expectCost);

    }

    @Test
    @When("add product with exist id")
    public void add_product_with_exist_id() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("print this product exist {int} {string} {string} {string} {double}")
    public void print_this_product_exist(Integer actualId, String actualCategory, String actualPicture, String actualDimenssion, Double actualCost) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        w.addProduct(p2);
        actualId = p2.getProductId();
        System.out.println(actualId);
        actualCategory = p2.getCategory();
        actualPicture = p2.getPicture();
        actualDimenssion = p2.getDimenssion();
        actualCost = p2.getCost();

        boolean ifExistProduct = w.searchProduct(actualId);

        int expectId = 1;
        String expectCategory = "Tufted Carpets";
        String expectPicture = "https://persiancarpet.com/images/making-a-tufted-rug.jpg";
        String expectDimenssion = "400X300";
        double expectCost =99.99;

        assertTrue(ifExistProduct);

    }

}
