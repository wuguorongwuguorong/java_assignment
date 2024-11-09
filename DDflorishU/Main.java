package DDflorishU;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args){
        
        while (true) {
            int choice = displayMenu();
            if (choice == 1) {
                System.out.println("Delete product");
            }
            if (choice == 2) {
                System.out.println("Delete product");
            }
            if (choice == 3) {
                System.out.println("Delete product");
            }
            if (choice == 4) {
                System.out.println("Delete product");
            }
            if (choice == 5) {
                break;
            }
        }

    }
    private static int displayMenu() {
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1. Show all products");
        System.out.println("2. Add product");
        System.out.println("3. Update product");
        System.out.println("4. Delete product");
        System.out.println("5. Quit");
        int choice = sc.nextInt();
        sc.nextLine(); // clear the input buffer
        return choice;
    }
    
}
