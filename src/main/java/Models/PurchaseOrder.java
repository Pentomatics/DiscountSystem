package Models;

import javax.persistence.*;

@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue
    private long orderID;

    private String orderDescription;
    private double price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;


    public PurchaseOrder() {
        // this form used by Hibernate
    }

    public PurchaseOrder(String orderDescription, Double price, Customer customer) {
        this.orderDescription = orderDescription;
        this.price = price;
        this.customer = customer;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "PurchaseOrder: ID = " + this.orderID + ", description = " + this.orderDescription + ", price = " + this.price + ", customerID = " + this.customer.getCustomerID();
    }
}
