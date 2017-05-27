package Database;

import Models.Customer;
import Models.PurchaseOrder;
import org.hibernate.Session;

import java.util.List;


/**
 * Created by Steffen on 24.04.2017.
 */
public class DiscountSystem {

    public void saveCustomers(List<Customer> customerList) {
        Session session =  HibernateUtil.getSession();
        session.beginTransaction();

        for (Customer customer : customerList) {
            session.save(customer);
        }

        session.getTransaction().commit();
    }


    public List<Customer> loadCustomers() {
        Session session =  HibernateUtil.getSession();
        session.beginTransaction();
        List customerList = session.createCriteria(Customer.class).setMaxResults(10).list();
        session.getTransaction().commit();

        return customerList;
    }


    public void savePurchaseOrders(List<PurchaseOrder> purchaseOrderList) {
        Session session =  HibernateUtil.getSession();
        session.beginTransaction();

        for (PurchaseOrder purchaseOrder : purchaseOrderList) {
            session.save(purchaseOrder);
        }

        session.getTransaction().commit();
    }


    public List<PurchaseOrder> loadPurchaseOrders() {
        Session session =  HibernateUtil.getSession();
        session.beginTransaction();
        List purchaseOrderList = session.createCriteria(PurchaseOrder.class).setMaxResults(10).list();
        session.getTransaction().commit();

        return purchaseOrderList;
    }
}
