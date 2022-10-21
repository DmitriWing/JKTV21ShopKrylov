package jktv21market;

import entity.Customer;
import entity.Goods;
import entity.Order;
import java.util.Scanner;
import java.util.Arrays;


public class App {

    public void run(){
        String splitter = "------------------------------------------------------------------------------";
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do{
            System.out.println("\t\t\t\tApp functions:");
            System.out.println("0 - Quit");
            System.out.println("1 - Add goods\t\t|\t2 - Edit goods\t\t|\t3 - Goods list" );
            System.out.println("4 - Add customer\t|\t5 - Edit customer\t|\t6 - Customers list");
            System.out.println("7 - Place order\t\t|\t8 - Orders list");
            System.out.print("Choose function number: ");
            int task = scanner.nextInt();
            switch (task){
                case 0:
                   repeat = false;
                   break;
                case 1:
                    System.out.println("1 - Add goods");
                    Goods goods =  new Goods();
                    
                    System.out.println(splitter);
                   break;
                case 2:
                    System.out.println("2 - Edit goods");
                    Customer buyer =  new Customer();
                    
                    System.out.println(splitter);
                    break;
                case 3:
                    System.out.println("3 - Goods list");
                    Order order =  new Order();
                    
                    System.out.println(splitter);
                    break;
                case 4:
                    System.out.println("4 - Add customer");
                    
                    System.out.println(splitter);
                    break;
                case 5:
                    System.out.println("5 - Edit customer");
                    
                    System.out.println(splitter);
                    break;
                case 6:
                    System.out.println("6 - Customers list");
                    
                    System.out.println(splitter);
                    break;
                case 7:
                    System.out.println("7 - Place order");
                    
                    System.out.println(splitter);
                    break;
                case 8:
                    System.out.println("8 - Orders list");
                    
                    System.out.println(splitter);
                    break;
                    
                default:
                    System.out.println("There is no function with such number\nChoose function number from the list!\n---------------------------------------------------------------------------");
            }
            
            
        }while(repeat);
        System.out.println("Good bye!");
        
        
        
    }   // run ends
    
}   // App ends
