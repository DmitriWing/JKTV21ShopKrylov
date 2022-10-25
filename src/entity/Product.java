package entity;

public class Product {
    private String title;
    private int price;
    private int quantity;
    
    
    
    public Product() {
    }

    public Product(String title, int price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    @Override
    public String toString() {
        return "Goods{" 
                + "title=" 
                + title 
                + ", price=" 
                + price 
                + '}';
    }

    

    
    
    
}
