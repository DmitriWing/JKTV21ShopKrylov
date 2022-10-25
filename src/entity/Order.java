package entity;

import java.util.Date;


public class Order {
    private Customer customer;
    private Product product;
    private Date orderDate;
    private int quantity;

    public Order() {
    }
    
    public Order(Customer customer, Product product, Date orderDate, int quantity) {
        this.customer = customer;
        this.product = product;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Order{" 
                + "customer=" + customer 
                + ", product=" + product 
                + ", orderDate=" + orderDate 
                + ", quantity =" + quantity
                + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
}   // public class Order ENDS


