import java.util.ArrayList;
import java.util.List;

public class Worker {
    private int id ;
    private String name , phone , address ;
    public List<product> findByNameProduct = new ArrayList<>();
    public List<Customer> findByNameCustomer = new ArrayList<>();


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
                System.out.println("Exist");
                return true;
            }
        }
        System.out.println("Not Exist");
        return false;
    }

    public boolean deleteProduct(int id){
        for(product existProduct : findByNameProduct){
            if(existProduct.getProductId()== (id)){
                System.out.println("Exist");
                findByNameProduct.removeIf(n -> (n.getProductId() == (id)));
                return true;
            }
        }
        System.out.println("Not Exist");
        return false;
    }

    public boolean updateProduct(product toUpdate,int id){
        int neededIndex = 0;
        for(product product : findByNameProduct) {
            boolean temp = searchProduct(id);
            System.out.println(temp);
            if(temp){
                neededIndex = findByNameProduct.indexOf(product);
                System.out.println(findByNameProduct.indexOf(product));
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
                System.out.println("Customer already Exist");
                return true;
            }
        }
        System.out.println("Customer will be added to list");
        findByNameCustomer.add(newCustomer);
        return false;
    }

    // /////  Search about specific Customer Method
    public boolean searchCustomer(int id){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){
                System.out.println("Exist");
                return true;
            }
        }
        System.out.println("Not Exist");
        return false;
    }

    // Search about Customer using (email)

    public boolean searchCustomerByEmail(String email){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getEmail().equals(email)){
                System.out.println("Exist");
                return true;
            }
        }
        System.out.println("Not Exist");
        return false;
    }

    /////  Delete Customer Method
    public boolean deleteCustomer(int id){
        for(Customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){
                System.out.println("Exist");
                findByNameCustomer.removeIf(n -> (n.getId() == (id)));
                return true;
            }
        }
        System.out.println("Not Exist");
        return false;
    }



    /// to Update Customer

    public void updateCustomer(Customer toUpdate,int id){
        int neededIndex = 0;
        for(Customer customer : findByNameCustomer) {
            boolean temp = searchCustomer(id);
            System.out.println(temp);
            if(temp){
                neededIndex = findByNameCustomer.indexOf(customer);
                System.out.println(findByNameCustomer.indexOf(customer));

            }

        }
        findByNameCustomer.set(neededIndex-1,toUpdate);
    }


    // to Print Customer Data
    public void getCustomerData(){
        for(Customer oldCustomer : findByNameCustomer){
            System.out.println("Id: "+oldCustomer.getId()+" Name: "+oldCustomer.getName() + " Phone: "+oldCustomer.getPhone()+" Address: "+oldCustomer.getAddress()+" Email: "+oldCustomer.getEmail());
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
            if(findByNameProduct.get(i).getProductDone() == true )
                numberOfDeliveredOrders++;
            System.out.println("The number of Delivered Orders: "+numberOfDeliveredOrders);

        }
        int totalAmountOfPaidMoney = 0;
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            totalAmountOfPaidMoney+= findByNameCustomer.get(i).getTotalPay() ;
        }
        System.out.println("Total amount of Customers payment: "+totalAmountOfPaidMoney);

        int totalAmountOfDebt = 0;
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            totalAmountOfDebt+= findByNameCustomer.get(i).getTotalDebts() ;
        }
        System.out.println("Total amount of Customers Debts: "+totalAmountOfDebt);

        int totalAmountOfCash = 0 ;
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            totalAmountOfCash+= findByNameCustomer.get(i).getTotalDebts() + findByNameCustomer.get(i).getTotalPay() ;
        }
        System.out.println("Total amount of Company Cash: "+totalAmountOfCash);


    }

    // 3) Feature to Track Order

    public void trackOrder(int productId){
        int actualResult = 0 ;
        for(int i = 0 ; i < findByNameProduct.size(); i++){

            if(searchProduct(productId)){
            if((findByNameProduct.get(i).getProductId() == productId )) {
                System.out.println(findByNameProduct.get(i).getProductId());
                System.out.println(findByNameProduct.get(i).getProductStatus());
                if((findByNameProduct.get(i).getProductDone() == false)) {
                    if (findByNameProduct.get(i).getProductStatus() == 1) {
                        System.out.println("Your product is complete!!");
                        break;
                    } else if ((findByNameProduct.get(i).getProductStatus() == 2)) {
                        System.out.println("Your product is treatment!!");
                        break;
                    } else if ((findByNameProduct.get(i).getProductStatus() == 3)) {
                        System.out.println("Your product is waiting!!");
                        break;
                    }
                    else {
                        System.out.println("Invalid input Status");
                        break;
                    }
                }
                else {
                    System.out.println("Your product was Delivered ");
                    break;
                }

            }
            }
            else {
                System.out.println("Invalid product ID");
                break;
            }


        }
    }

    // feature discount
    public void printDiscount(int customerId){
        for(int i = 0 ; i < findByNameCustomer.size(); i++){
            if(searchCustomer(customerId)) {
                if (findByNameCustomer.get(i).getTotalPay() < 1000)
                    System.out.println("You will take : "+ .05 +" discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 1000 && findByNameCustomer.get(i).getTotalPay() <= 1500)
                    System.out.println("You will take : "+ .10 +" discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 1500 && findByNameCustomer.get(i).getTotalPay() <= 2000)
                    System.out.println("You will take : "+ .15 +" discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 2000 && findByNameCustomer.get(i).getTotalPay() <= 3000)
                    System.out.println("You will take : "+ .20 +" discount");
                else if (findByNameCustomer.get(i).getTotalPay() > 3000)
                    System.out.println("You will take : "+ .30 +" discount");
            }
            else
                System.out.println("Customer not found");
        }
    }

    // feature Generate Invoice

    public void generateInvoice(int prodId , int custId){
        int flag1 = 0 ;
        int flag2 = 0 ;
        int cId = 0 , pId = 0;
        System.out.println(pId+"-------------");
        String address = "" ;
        double cost = 0;
            for (int i = 0; i < findByNameProduct.size(); i++) {

                if(searchProduct(prodId)){
                    flag1 = 1;
                    pId = prodId;
                    cost = findByNameProduct.get(i).getCost();
                    System.out.println(pId);
                 //   System.out.println("product id : "+findByNameProduct.get(i).getProductId() + "product cost : "+findByNameProduct.get(i).getCost());
                }
                else
                    System.out.println("This product not Exist");
            }
        for (int i = 0; i < findByNameCustomer.size(); i++) {

            if(searchProduct(prodId)){
                flag2 = 1;
                    cId = findByNameCustomer.get(i).getId();
                    address = findByNameCustomer.get(i).getAddress();
                // System.out.println("Customer id : "+findByNameCustomer.get(i).getId() + "Customer Address : "+findByNameCustomer.get(i).getAddress());
            }
            else
                System.out.println("This product not Exist");
        }

        if(flag1 == 1 && flag2 == 1)
            System.out.println("product id : "+ pId + " product cost : "+cost+" customer address : "+address);
        }

        // Send email feature

    public void orderStatus(int productId,int customerId,String email) {
        String status = "";
        int flag = 0 ;
        for (int i = 0; i < findByNameProduct.size(); i++) {
            if (searchCustomer(customerId) && searchProduct(productId) && searchCustomerByEmail(email)) {
                if(findByNameProduct.get(i).productStatus == 1 && findByNameProduct.get(i).getProductId() == productId){
                    status = "Your Order Complete";
                    SendMail.getSendEmail(status, email);
                }
            }
        }
    }



    }






