import Database.DiscountSystem;
import Database.ExampleValues;
import Database.HibernateUtil;
import Database.NestedTransactions;
import Models.Customer;
import Models.PurchaseOrder;

import java.util.List;

public class Main {

    private static final DiscountSystem discountSystem = new DiscountSystem();

    public static void main(String[] args) {
        testBasicUsage();
        NestedTransactions.tryNestedTransactionInSameSession();

        HibernateUtil.closeSessionFactory();
    }


    public static void testBasicUsage() {
        List<PurchaseOrder> purchaseOrderList = ExampleValues.getOrderList();
        discountSystem.savePurchaseOrders(purchaseOrderList);

        List<Customer> customerList = discountSystem.loadCustomers();
        purchaseOrderList = discountSystem.loadPurchaseOrders();

        printCustomers(customerList);
        printPurchaseOrders(purchaseOrderList);
    }


    public static void printCustomers(List<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }


    public static void printPurchaseOrders(List<PurchaseOrder> purchaseOrderList) {
        for ( PurchaseOrder purchaseOrder : purchaseOrderList) {
            System.out.println(purchaseOrder.toString());
        }
    }
}
