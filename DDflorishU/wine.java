package DDflorishU;
import java.util.Scanner;

public class wine extends product{
   
    private String country;
    private String taste;
    private int year;

    public wine(){
        super();
        country=" ";
        taste= " ";
        year=0;
    }
    public wine(String SKU, String name, double costPrice, String country, String taste, int year){
        super(SKU, name, costPrice);
        this.country = country;
        this.taste = taste;
        this.year = year;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        if (country.length() > 0) {
            this.country = country;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Please indicate the country origin");
        }
    }
    public String getTaste(){
        return taste;
    }

    public void setTaste(String taste){
        if (taste.length() > 0) {
            this.taste = taste;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Please indicate the taste");
        }
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if (year > 0) {
            this.year = year;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Please indicate the year");
        }
    }
    
}
