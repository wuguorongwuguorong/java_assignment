    package DDflorishU;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        private static Scanner sc = new Scanner(System.in);
        private static ArrayList<product> catalog = new ArrayList<>();

        public static void main(String[] args) {

            while (true) {
                int choice = displayMenu();
                if (choice == 1) {
                    displayProducts();

                }
                if (choice == 2) {
                    addProduct();
                }
                if (choice == 3) {
                    updateProduct();
                }
                if (choice == 4) {
                    System.out.println("Delete product");
                }
                if (choice == 5) {
                    break;
                }
            }

            wine a = new wine();
            a.setSKU("dsgdfh");
            a.setName("Jacbos Creek");
            a.setCostPrice(55);
            a.setCountry("SGD");
            a.setTaste("Merlot");
            a.setYear(1111);
            a.displayDetails();
            

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

        private static void addProduct(){

            System.out.println("Enter product details" + product.getProductCount());
            System.out.println("Enter the type of product add:(w) for Wine and (f) for Flowers");
            String productType = sc.nextLine().toLowerCase();
            if (productType.equals("w") || productType.equals("f")) {
                System.out.println("Enter product name: ");
                String productName = sc.nextLine();

                System.out.println("Enter the product price: ");
                double price =sc.nextDouble();
                sc.nextLine();
                
                System.out.println("Enter the product SKU: ");
                String productSku =sc.nextLine();

                product p;

                if(productType.equals("w")){
                    System.out.println("Enter the Wine production Country: ");
                    String country = sc.nextLine();

                    System.out.println("Enter the taste of the Wine: ");
                    String taste = sc.nextLine();


                    System.out.println("Enter the production Year: ");
                    String year = sc.nextLine();

                    p= new wine(productSku, productName, price, country, taste, Integer.parseInt(year));

                }else{
                    
                    System.out.println("Enter the description of the bouquet of flower: ");
                    String description = sc.nextLine();

                    System.out.println("Enter the colour of the bouquet: ");
                    String colour = sc.nextLine();

                p = new flowers(productSku, productName, price, description, colour);
                }

                catalog.add(p);

            }else{
                System.out.println("Please choose 1 of the options (w) or (f)");
                return;
            }
        }
        private static void displayProducts() {
            System.out.println();
            System.out.println("All products");
            for (int i = 0; i < catalog.size(); i++) {
                
                var p = catalog.get(i);
                // polymorphism happens here
                // if p is a physical product, call PhysicalProduct.displayDetails()
                // if p is a digital product, call DigitalProduct.displayDetails
                System.out.println("Product index: " + i);
                p.displayDetails();
        
            }
        }

        private static void updateProduct(){
            System.out.println();
            System.out.println("Choose a product to edit");
            displayProducts();
            int productIndex = sc.nextInt();
            sc.nextLine();

            product p = catalog.get(productIndex);
            p.edit(sc);
        }
    }
