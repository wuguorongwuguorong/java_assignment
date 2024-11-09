package DDflorishU;
import java.util.Scanner;

public class flowers extends product {
    private String description;
    private String colour;

    public flowers(){
        super();
        description = " ";
        colour = " ";
    
    }

    public flowers(String SKU, String name, double costPrice, String description, String colour){
        super(SKU, name, costPrice);
        this.description = description;
        this.colour = colour;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription( String description){
        if (description.length() > 0) {
            this.description = description;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Please descripe the bouquet");
        }
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        if (colour.length() > 0) {
            this.colour = colour;
        } else {
            // An exception is an object that represents an error
            throw new IllegalArgumentException("Please indicate the colour");
        }
    }
    
    
    
}
