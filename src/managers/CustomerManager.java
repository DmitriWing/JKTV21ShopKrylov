package managers;

import entity.Customer;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerManager {
    private final Scanner scanner;
    
    

    public CustomerManager() {
        scanner = new Scanner(System.in);
    }
    
    public Customer createCustomer(){
        Customer customer = new Customer();
        System.out.println("Input customer's name");
        customer.setName(scanner.nextLine());
        
        System.out.println("Input customer's last name");
        customer.setLastName(scanner.nextLine());
        
        System.out.println("Input customer's phone");
        customer.setPhone(scanner.nextLine());
        return customer;
        
    }
    
    
    
    public void customersList(Customer customers[]){
        for (int i = 0; i < customers.length; i++) {
//            System.out.println(customers[i].getName() + customers[i].getLastName() + customers[i].getPhone());
            
            System.out.printf("%d. %s %s, phone: %s%n", i+1, customers[i].getName(), customers[i].getLastName(), customers[i].getPhone());
        }
        
        
    }
    
    
    
    
    
    
}   // public class CustomerManager ENDS
