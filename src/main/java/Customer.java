public class Customer {
    private int id ;
    private String name , phone , address , email;
    private double totalPay , totalDebts;

    public Customer(){}
    public Customer(int id , String name , String phone , String address , String email , double totalPay , double totalDebts){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.totalPay = totalPay;
        this.totalDebts = totalDebts;
    }


    // setters and getters Functions
    ////////////////////////////////////////////////////////////////

    public void setTotalDebts(double totalDebts) {
        this.totalDebts = totalDebts;
    }

    public double getTotalDebts() {
        return totalDebts;
    }

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
    public void setEmail(String email){this.email = email;}
    public void setTotalPay(double totalPay){this.totalPay = totalPay;}
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
    public String getEmail(){return email;}
    public double getTotalPay(){return totalPay;}
    ///////////////////////////////////////////////////////////////

    // method to add new Customer
    public Customer addCustomer(){
        return new Customer(id,name,phone,address,email,totalPay,totalDebts) ;
    }

}
