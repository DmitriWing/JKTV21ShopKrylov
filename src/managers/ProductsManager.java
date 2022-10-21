package managers;

import entity.Product;
import java.util.Scanner;


public class ProductsManager {
    private Scanner scanner;

    public ProductsManager() {
        scanner = new Scanner(System.in);
    }
    
    public Product createProduct(){
        Product product = new Product();
        System.out.println("Input product title: ");
        product.setTitle(scanner.nextLine());
        
        System.out.println("Input product price per item: ");
        product.setPrice(scanner.nextDouble()); scanner.nextLine();
        
        System.out.println("Input products quantity: ");
        product.setQuantity(scanner.nextInt()); scanner.nextLine();
        return product;
        
    }
    
    public void productsLis(Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. Title: %s; Price: %.2f; Quantity: %d%n", i+1, products[i].getTitle(), products[i].getPrice(), products[i].getQuantity());
        }
    }
    
    
    
    
    
}
