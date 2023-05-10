import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.product;

import static org.junit.Assert.*;

public class TestRecordProductInformations {
    product p = new product();
    @When("entered org.example.product data")
    public void entered_product_data() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @Then("check them if true")
    public void check_them_if_true() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        p.setProductDone(true);
        assertTrue(p.getProductDone());

        // test setting the productDone variable to false
        p.setProductDone(false);
        assertFalse(p.getProductDone());

        // test setting the productDone variable to the same value it already has
        boolean initialProductDoneValue = p.getProductDone();
        p.setProductDone(initialProductDoneValue);
        assertEquals(initialProductDoneValue, p.getProductDone());

        double actualCost = 300.0;
        p.setCost(actualCost);

        double expectedCost  = 300.0;
        assertEquals((int) p.getCost(),(int)expectedCost);

        p.setDimenssion("400x700");
        p.getDimenssion();
        String expectedDimension ="400x700";
        assertTrue(p.getDimenssion().equals(expectedDimension));

        p.setPicture("https://tse1.mm.bing.net/th?id=OIP.6j-ZV233s414yjEAoA6fPQHaE6&pid=Api&rs=1&c=1&qlt=95&w=174&h=115");
        p.getPicture();
        String expectedPicture ="https://tse1.mm.bing.net/th?id=OIP.6j-ZV233s414yjEAoA6fPQHaE6&pid=Api&rs=1&c=1&qlt=95&w=174&h=115";
        assertTrue(p.getPicture().equals(expectedPicture));

        p.setProductStatus(1);
        p.getProductStatus();
        int expectedProductStatus =1;
        assertTrue(p.getProductStatus() == (expectedProductStatus));

        p.setProductId(1);
        p.getProductId();
        int expectedProductId =1;
        assertTrue(p.getProductId() == (expectedProductId));


    }

}
