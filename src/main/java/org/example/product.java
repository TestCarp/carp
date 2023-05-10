package org.example;

public class product {

    private int productId;
    private String dimenssion ;
    private String category ;
    private String picture ;
    private boolean isRequiredSpecialTreatment ;
    protected boolean  productDone;
    protected int productStatus;
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
    public boolean isRequiredSpecialTreatment() {
        return isRequiredSpecialTreatment;
    }
    public void setRequiredSpecialTreatment(boolean requiredSpecialTreatment) {isRequiredSpecialTreatment = requiredSpecialTreatment;}
    public String getDimenssion() {
        return dimenssion;
    }
    public int getProductId() {
        return productId;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getPicture() {return picture;}
    public double getCost(){
        return  cost;
    }
    public void setCost(double cost) {this.cost = cost;}
    public void setProductId(int productId) {this.productId = productId;}
    public void setDimenssion(String dimenssion) {this.dimenssion = dimenssion;}
    public void setPicture(String picture) {this.picture = picture;}
    public void setProductStatus(int productStatus) {this.productStatus = productStatus;}
}
