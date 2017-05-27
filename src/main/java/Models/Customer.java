package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.GregorianCalendar;


@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long customerID;

    private String firstName;
    private String lastName;
    private GregorianCalendar birthday;


    public Customer() {
        // this form used by Hibernate
    }


    public Customer(String firstName, String lastName, GregorianCalendar birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }


    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(GregorianCalendar birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Customer: ID = " + this.customerID + ", first_name = " + this.firstName + ", last_name = " + this.lastName + ", birthday = " + this.birthday;
    }
}

