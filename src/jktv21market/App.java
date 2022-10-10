package jktv21market;

import entity.Buyer;
import entity.Goods;
import entity.Order;
import java.util.Scanner;


public class App {
    public void run(){
        String splitter = "------------------------------------------------------------------------------";
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do{
            System.out.println("App functions:");
            System.out.println("0 - Quit");
            System.out.println("1 - Add goods");
            System.out.println("2 - Add buyer");
            System.out.println("3 - Checkout");
            System.out.println("4 - Cancel order");
            System.out.println("5 - Orders list");
            System.out.println("6 - Buyers list");
            System.out.println("Choose function number:");
            int task = scanner.nextInt();
            scanner.nextLine();
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
                    System.out.println("2 - Add buyer");
                    Buyer buyer =  new Buyer();
                    
                    System.out.println(splitter);
                    break;
                case 3:
                    System.out.println("3 - Checkout");
                    Order order =  new Order();
                    
                    System.out.println(splitter);
                    break;
                case 4:
                    System.out.println("4 - Cancel order");
                    
                    System.out.println(splitter);
                    break;
                case 5:
                    System.out.println("5 - Orders list");
                    
                    System.out.println(splitter);
                    break;
                case 6:
                    System.out.println("6 - Buyers list");
                    
                    System.out.println(splitter);
                    break;
                    
                default:
                    System.out.println("There is no function with such number\nChoose function number from the list!\n---------------------------------------------------------------------------");
            }
            
            
        }while(repeat);
        System.out.println("Good bye!");
    }   // run ends
}   // App ends
