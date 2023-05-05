import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestDistributeWorkerOnOrders {

    Admin a = new Admin();
    Worker w1 = new Worker();
    product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
    product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
    product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
    product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);

    @Test


    @When("have enough worker")
    public void have_enough_worker() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("divide {int} on {int} {int} {int}")
    public void divide_on(Integer int1, Integer int2, Integer int3, Integer int4) {
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



        int actualNumberOfWorkers = 0 ;
        for(int i = 0 ; i < a.findByNameWorker.size(); i++){
            actualNumberOfWorkers++;
        }
        int actualNumberOfOrders = 0;
        for(int i = 0 ; i < w1.findByNameProduct.size(); i++){
            // if(w1.findByNameProduct.get(i).getProductDone() == true)
            actualNumberOfOrders++;
        }

        // multiply of 100 instead of write information for 100 workers
        System.out.println("Total number of workers: "+(actualNumberOfWorkers*100));
        System.out.println("The number of Orders: "+actualNumberOfOrders);
        System.out.println("The number of bussy Worker: "+(4*actualNumberOfOrders));
        System.out.println("The number of available worker: "+((actualNumberOfWorkers*100) - (4*actualNumberOfOrders)));
        int actualTotalWorker = (actualNumberOfWorkers*100);
        int actualNumberOfBussyWorkers = 4*actualNumberOfOrders;
        int actualNumberOfAvailableWorker =(actualNumberOfWorkers*100) - (4*actualNumberOfOrders);

        int expectedTotalWorker = 100;
        int expectedNumberOfOrders = 6;
        int expectedNumberOfBussyWorkers = 24;
        int expectedNumberOfAvailableWorker = 76;

        assertTrue(actualTotalWorker == expectedTotalWorker && actualNumberOfOrders == expectedNumberOfOrders && actualNumberOfBussyWorkers == expectedNumberOfBussyWorkers && actualNumberOfAvailableWorker == expectedNumberOfAvailableWorker);


    }

}
