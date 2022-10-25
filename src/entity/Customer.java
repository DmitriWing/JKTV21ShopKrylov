package entity;



public class Customer {
    private String name;
    private String lastName;
    private String phone;
    private int cash;
//    ---------------------------------------------

    public Customer() {
        
    }

    public Customer(String name, String lastName, String phone, int cash) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
    
    
    
    @Override
    public String toString() {
        return "Customer{" 
                + "name=" + name 
                + ", lastName=" + lastName 
                + ", phone=" + phone 
                + '}';
    }


    
}
