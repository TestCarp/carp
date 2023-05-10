package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {
    private int id ;


    private String name ;
    private String phone ;
    private String address ;
    protected List<product> findByNameProduct = new ArrayList<>();
    protected List<Customer> findByNameCustomer = new ArrayList<>();

    Logger logger = Logger.getLogger(Worker.class.getName());
    public Worker(int id , String name , String address , String phone){
        this.id = id ;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public Worker(){}
    // Setters and Getters

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public boolean addProduct(product newProduct){
        for(product oldProduct : findByNameProduct){
            if(oldProduct.getProductId()==(newProduct.getProductId())){

                return true;
            }
        }

        findByNameProduct.add(newProduct);
        return false;
    }

    public boolean searchProduct(int id){
        for(product existProduct : findByNameProduct){
            if(existProduct.getProductId() ==(id)){

                return true;
            }
        }

        return false;
    }

    public boolean deleteProduct(int id){
        for(product existProduct : findByNameProduct){
            if(existProduct.getProductId()== (id)){
                findByNameProduct.removeIf(n -> (n.getProductId() == (id)));
                return true;
            }
        }

        return false;
    }

    public boolean addCustomer(Customer newCustomer){
        for(Customer oldCustomer : findByNameCustomer){
            if(oldCustomer.getId() == newCustomer.getId() || oldCustomer.getEmail() .equals(newCustomer.getEmail()) || oldCustomer.getPhone() .equals(newCustomer.getPhone())){
                return true;
            }
        }
        findByNameCustomer.add(newCustomer);
        return false;
    }

    // /////  Search about specific org.example.Customer Method
    public boolean searchCustomer(int id){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){

                return true;
            }
        }

        return false;
    }

    public boolean searchCustomerByEmail(String email){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean deleteCustomer(int id){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){
                findByNameCustomer.removeIf(n -> (n.getId() == (id)));
                return true;
            }
        }
        return false;
    }


    // General Methods

    // getNumberOfProduct

    public int getNumberOfProducts() {
        int numberOfDeliveredOrders = 0;
        for (int i = 0; i < findByNameProduct.size(); i++) {
                numberOfDeliveredOrders++;
        }
        return numberOfDeliveredOrders;
    }



    // 1) Generate Statistics
    public void generateStatistics(){
        int numberOfDeliveredOrders = 0;
        for(int i = 0 ; i < findByNameProduct.size(); i++)
            if(findByNameProduct.get(i).getProductDone())
                numberOfDeliveredOrders++;
        int totalAmountOfPaidMoney = 0;
        for(int i = 0 ; i < findByNameCustomer.size(); i++)
            totalAmountOfPaidMoney+= findByNameCustomer.get(i).getTotalPay() ;
        int totalAmountOfDebt = 0;
        for(int i = 0 ; i < findByNameCustomer.size(); i++)
            totalAmountOfDebt+= findByNameCustomer.get(i).getTotalDebts() ;
        int totalAmountOfCash = 0 ;
        for(int i = 0 ; i < findByNameCustomer.size(); i++)
            totalAmountOfCash+= findByNameCustomer.get(i).getTotalDebts() + findByNameCustomer.get(i).getTotalPay() ;
        logger.log(Level.INFO,"The number of Delivered Orders: {0}",numberOfDeliveredOrders);
        logger.log(Level.INFO,"Total amount of Customers payment: {0}",totalAmountOfPaidMoney);
        logger.log(Level.INFO,"Total amount of Customers Debts: {0}",totalAmountOfDebt);
        logger.log(Level.INFO,"Total amount of Company Cash: {0}",totalAmountOfCash);
    }

    // 3) Feature to Track Order

    public void trackOrder(int productId){

        for(int i = 0 ; i < findByNameProduct.size(); i++){

            if(searchProduct(productId)){
            if((findByNameProduct.get(i).getProductId() == productId )) {

                if((!findByNameProduct.get(i).getProductDone())) {
                    if (findByNameProduct.get(i).getProductStatus() == 1) {
                        logger.log(Level.INFO,"Your org.example.product is complete!!");
                        break;
                    } else if ((findByNameProduct.get(i).getProductStatus() == 2)) {
                        logger.log(Level.INFO,"Your org.example.product is treatment!!");
                        break;
                    } else if ((findByNameProduct.get(i).getProductStatus() == 3)) {
                        logger.log(Level.INFO,"Your org.example.product is waiting!!");
                        break;
                    }
                    else {
                        logger.log(Level.INFO,"Invalid input Status");
                        break;
                    }
                }
                else {
                    logger.log(Level.INFO,"Your org.example.product was Delivered ");
                    break;
                }

            }
            }
            else {
                logger.log(Level.INFO,"Invalid org.example.product ID");
                break;
            }


        }
    }

    // feature discount
    public void printDiscount(int customerId){
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            if(searchCustomer(customerId)) {
                if (findByNameCustomer.get(i).getTotalPay() < 1000)
                    logger.log(Level.INFO,"You will take : .05 discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 1000 && findByNameCustomer.get(i).getTotalPay() <= 1500)
                    logger.log(Level.INFO,"You will take : .10 discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 1500 && findByNameCustomer.get(i).getTotalPay() <= 2000)
                    logger.log(Level.INFO,"You will take : .15 discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 2000 && findByNameCustomer.get(i).getTotalPay() <= 3000)
                    logger.log(Level.INFO,"You will take : .20 discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 3000)
                    logger.log(Level.INFO,"You will take : .30 discount");
            }
            else
                logger.log(Level.INFO,"org.example.Customer not found");
        }
    }

    // feature Generate Invoice

    public void generateInvoice(int prodId , int custId){
        int flag1 = 0 ;
        int flag2 = 0 ;
        int pId = 0;

        String address1 = "" ;
        double cost = 0;
            for (int i = 0; i < findByNameProduct.size(); i++) {

                if(searchProduct(prodId)){
                    flag1 = 1;
                    pId = prodId;
                    cost = findByNameProduct.get(i).getCost();

                }
            }
        for (int i = 0; i < findByNameCustomer.size(); i++) {

            if(searchProduct(custId)){
                flag2 = 1;
                    address1 = findByNameCustomer.get(i).getAddress();
            }
        }

        if(flag1 == 1 && flag2 == 1)
            logger.log(Level.INFO, "org.example.product id: {0}, org.example.product cost: {1}, customer address: {2}", new Object[] {pId, cost, address1});

        }

        // Send email feature

    public void orderStatus(int productId,int customerId,String email) {
        String status = "";

        for (int i = 0; i < findByNameProduct.size(); i++) {
            if ((searchCustomer(customerId) && searchProduct(productId) && searchCustomerByEmail(email)) && (findByNameProduct.get(i).productStatus == 1 && findByNameProduct.get(i).getProductId() == productId)) {

                    status = "Your Order Complete";
                    SendMail.getSendEmail(status, email);

            }
        }
    }



    }






