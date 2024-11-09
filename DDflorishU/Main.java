package DDflorishU;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        product catalog = new product();
        catalog.setCostPrice(50);
        System.out.println(catalog.getPriceWithGST());

    }
    
}
