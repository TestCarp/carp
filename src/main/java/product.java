public class product {

    private int productId;
    private String dimenssion , category , picture ;
    private boolean isRequiredSpecialTreatment , isComplete;
    public boolean  productDone;
    public int productStatus;
    private double cost ;

    ////////////////////////////////
    public product(){}
    public product(int productId,String category, String picture , String dimenssion , double cost , boolean productDone,int productStatus){
        this.productId = productId;
        this.category = category;
        this.picture = picture;
        this.dimenssion = dimenssion;
        this.cost = cost;
        this.productDone = productDone;
        this.productStatus = productStatus;
    }
    public int getProductStatus(){
        return productStatus;
    }
    public void setProductDone(boolean productDone){
        this.productDone = productDone;
    }
    public boolean getProductDone(){
        return productDone;
    }




    /////////////////////////////////


    public boolean isRequiredSpecialTreatment() {
        return isRequiredSpecialTreatment;
    }

    public void setRequiredSpecialTreatment(boolean requiredSpecialTreatment) {
        isRequiredSpecialTreatment = requiredSpecialTreatment;
    }

    public String getDimenssion() {
        return dimenssion;
    }

    public void setDimenssion(String dimenssion) {
        this.dimenssion = dimenssion;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost(){
        return  cost;
    }
//////////////////////////
    public product addProduct(){
        return new product(productId,category,picture , dimenssion ,cost,productDone,productStatus);
    }


    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean complete) {
        isComplete = complete;
    }
}
