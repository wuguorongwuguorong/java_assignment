package DDflorishU;
import java.util.Scanner;

public class product{

    protected String SKU;
    protected String name;
    protected double costPrice;
    
    private static int PRODUCT_COUNT = 0;
    public static int getProductCount() {
    return PRODUCT_COUNT;
    }

    public product(){
        SKU = "N/A";
        name = " ";

    }
    public product(String SKU, String name, double costPrice){
        this.SKU = SKU;
        this.name = name;
        this.costPrice = costPrice;
        PRODUCT_COUNT++;
    }
    public String getSKU(){
        return SKU;
    }
    public void setSKU(String SKU){
        this.SKU = SKU;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.length() > 0) {
            this.name = name;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Invalid Name");
        }
    }
    public double getCostPrice(){
        return costPrice;
    }
    public double getPriceWithGST(){
        return costPrice + Util.calculateGST(costPrice);
    }
    public void setCostPrice(double costPrice){
        if (costPrice >= 0) {
            this.costPrice = costPrice;
        } else {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
    }

    
    //public abstract double calculateSalesTax();

    //@Override
    //public double getSalesTax(){
    //    return calculateSalesTax();
    //}

}
