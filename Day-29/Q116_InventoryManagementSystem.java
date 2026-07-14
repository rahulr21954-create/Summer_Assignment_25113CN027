import java.util.*;

public class Q116_InventoryManagementSystem {
    public static class Product{
        int id;
        String name;
        int quantity;
        double price;

        Product(int id,String name,int quantity,double price){
            this.id=id;
            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }

        void display(){
            System.out.println("----------------------------------------");
            System.out.println("Id       : "+id);
            System.out.println("Name     : "+name);
            System.out.println("Quantity : "+quantity);
            System.out.println("Price    : "+price);
        }
    }
    
    static Scanner sc=new Scanner(System.in);
    static List<Product> products=new ArrayList<>();
    public static void main(String[] args) {
        
        while(true){
            System.out.println("======== Inventory Management System ========\n");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product By ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    System.out.println("__ Thank You! for using Inventory Management System __");
                    return;
                default:
                    break;
            }
        }
    }

    static void addProduct(){
        System.out.println("Enter Id:");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name=sc.nextLine();

        System.out.println("Enter Quantity:");
        int quantity=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Price:");
        double price=sc.nextDouble();

        products.add(new Product(id, name, quantity, price));

        System.out.println("Product Added Successfully!");
    }

    static void displayProducts(){
        for(Product product:products){
            product.display();
        }

    }
    static void searchProduct(){
        System.out.println("Search Product by ID:");
        int id=sc.nextInt();

        for (Product product : products) {
            if(product.id==id){
                product.display();
                System.out.println("Product Searched Successfully!");
                return;
            }
        }
        System.out.println("Product NOT Found!");
    }

    static void updateProduct(){
        System.out.println("Update Product by ID:");
        int id=sc.nextInt();

        for (Product product : products) {
            if(product.id==id){
                sc.nextLine();
                System.out.println("Enter new Name:");
                String newName=sc.nextLine();

                System.out.println("Enter new Quantity:");
                int newQuantity=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter new Price:");
                double newPrice=sc.nextDouble();

                product.name=newName;
                product.quantity=newQuantity;
                product.price=newPrice;
                
                System.out.println("Product Updated Successfully!");
                return;
            }
        }
        System.out.println("Invalid ID!");
    }

    static void deleteProduct(){
        System.out.println("Delete Product by ID:");
        int id=sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).id==id){
                products.remove(i);
                System.out.println("Product Removed Successfully!");
                return;
            }
        }
        System.out.println("Invalid ID!");
    }

}
