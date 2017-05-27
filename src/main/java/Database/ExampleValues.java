package Database;

import Models.Customer;
import Models.PurchaseOrder;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Steffen on 13.05.2017.
 */
public class ExampleValues {

    public static List<PurchaseOrder> getOrderList() {
        List<PurchaseOrder> orderList = new ArrayList<PurchaseOrder>();
        List<Customer> customerList = getCustomerList();

        orderList.add(new PurchaseOrder("Fischfutter", 2.99, customerList.get(0)));
        orderList.add(new PurchaseOrder("Weißbrot", 0.50, customerList.get(1)));
        orderList.add(new PurchaseOrder("Seeanemonen", 12999.0, customerList.get(2)));

        return orderList;
    }


    private static List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<Customer>();

        customerList.add(new Customer("First", "Alfred", new GregorianCalendar(1991, 1, 1)));
        customerList.add(new Customer("Second", "Bertha", new GregorianCalendar(1992, 2, 2)));
        customerList.add(new Customer("Third", "Clemens", new GregorianCalendar(1993, 3, 3)));

        return customerList;
    }
}
