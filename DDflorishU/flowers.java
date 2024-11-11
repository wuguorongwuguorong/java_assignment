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
    
    @Override
    public  void displayDetails(){
        super.displayDetails();
        System.out.println("Description: " + description);
        System.out.println("Colour: " + colour);
    }
    @Override
    public void edit(Scanner sc) {
       super.edit(sc); // call parent version of edit
       System.out.println("Enter new Description or press[Enter] to remain unchanged.");
       String productDescription = sc.nextLine();
       setDescription(productDescription.length() > 0 ? productDescription : this.description);

       System.out.println("Enter New colour or press [Enter] to remain unchanged.");
       String productColour = sc.nextLine();
       setColour(productColour.length() > 0 ? productColour : this.colour);

    }
    
    
}
