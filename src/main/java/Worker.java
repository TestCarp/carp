import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {
    private int id ;


    private String name , phone , address ;
    public List<product> findByNameProduct = new ArrayList<>();
    public List<Customer> findByNameCustomer = new ArrayList<>();

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
                System.out.println("product is Exist");
                return true;
            }
        }
        System.out.println("Product will added to list");
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

    public boolean updateProduct(product toUpdate,int id){
        int neededIndex = 0;
        for(product product : findByNameProduct) {
            boolean temp = searchProduct(id);
            System.out.println(temp);
            if(temp){
                neededIndex = findByNameProduct.indexOf(product);
                logger.log(Level.INFO,"{0}",findByNameProduct.indexOf(product));
                return  true;
            }

        }
        findByNameProduct.set(neededIndex-1,toUpdate);
        return false;
    }


    /////
    ////////////////////////////////////////////////////////////////////////
    // Customer Methods


    // add new Customer Method

    public boolean addCustomer(Customer newCustomer){
        for(Customer oldCustomer : findByNameCustomer){
            if(oldCustomer.getId() == newCustomer.getId() || oldCustomer.getEmail() .equals(newCustomer.getEmail()) || oldCustomer.getPhone() .equals(newCustomer.getPhone())){
                return true;
            }
        }
        findByNameCustomer.add(newCustomer);
        return false;
    }

    // /////  Search about specific Customer Method
    public boolean searchCustomer(int id){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){

                return true;
            }
        }

        return false;
    }

    // Search about Customer using (email)

    public boolean searchCustomerByEmail(String email){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    /////  Delete Customer Method
    public boolean deleteCustomer(int id){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){
                findByNameCustomer.removeIf(n -> (n.getId() == (id)));
                return true;
            }
        }
        return false;
    }



    /// to Update Customer

    public void updateCustomer(Customer toUpdate,int id){
        int neededIndex = 0;
        for(Customer customer : findByNameCustomer) {
            boolean temp = searchCustomer(id);

            if(temp){
                neededIndex = findByNameCustomer.indexOf(customer);

            }

        }
        findByNameCustomer.set(neededIndex-1,toUpdate);
    }


    // to Print Customer Data
    public void getCustomerData(){
        for(Customer oldCustomer : findByNameCustomer){
            logger.log(Level.INFO, "id: {0} Name: {1} Phone: {2} Address: {3} Email: {4}",
                    new Object[] {oldCustomer.getId(), oldCustomer.getName(), oldCustomer.getPhone(), oldCustomer.getAddress(), oldCustomer.getEmail()});

        }
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
        for(int i = 0 ; i < findByNameProduct.size(); i++){
            if(findByNameProduct.get(i).getProductDone())
                numberOfDeliveredOrders++;
        }
        int totalAmountOfPaidMoney = 0;
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            totalAmountOfPaidMoney+= findByNameCustomer.get(i).getTotalPay() ;
        }

        int totalAmountOfDebt = 0;
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            totalAmountOfDebt+= findByNameCustomer.get(i).getTotalDebts() ;
        }



        int totalAmountOfCash = 0 ;
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            totalAmountOfCash+= findByNameCustomer.get(i).getTotalDebts() + findByNameCustomer.get(i).getTotalPay() ;
        }
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

                if((findByNameProduct.get(i).getProductDone() == false)) {
                    if (findByNameProduct.get(i).getProductStatus() == 1) {
                        logger.log(Level.INFO,"Your product is complete!!");
                        break;
                    } else if ((findByNameProduct.get(i).getProductStatus() == 2)) {
                        logger.log(Level.INFO,"Your product is treatment!!");
                        break;
                    } else if ((findByNameProduct.get(i).getProductStatus() == 3)) {
                        logger.log(Level.INFO,"Your product is waiting!!");
                        break;
                    }
                    else {
                        logger.log(Level.INFO,"Invalid input Status");
                        break;
                    }
                }
                else {
                    logger.log(Level.INFO,"Your product was Delivered ");
                    break;
                }

            }
            }
            else {
                logger.log(Level.INFO,"Invalid product ID");
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
                logger.log(Level.INFO,"Customer not found");
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
                else
                    logger.log(Level.INFO,"This product not Exist");
            }
        for (int i = 0; i < findByNameCustomer.size(); i++) {

            if(searchProduct(custId)){
                flag2 = 1;
                    address1 = findByNameCustomer.get(i).getAddress();
            }
            else
                logger.log(Level.INFO,"This product not Exist");
        }

        if(flag1 == 1 && flag2 == 1)
            logger.log(Level.INFO, "product id: {0}, product cost: {1}, customer address: {2}", new Object[] {pId, cost, address1});

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






