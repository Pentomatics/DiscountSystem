package Database;

import Models.Customer;
import org.hibernate.Session;

import java.util.GregorianCalendar;

/**
 * Created by Steffen on 11.05.2017.
 */
public class NestedTransactions {

    public static void tryNestedTransactionInSameSession() {
        Session session =  HibernateUtil.getSession();
        session.beginTransaction();
        session.save(new Customer("NewBerta", "Baum", new GregorianCalendar(1990, 12, 2)));
        session.beginTransaction();
        session.save(new Customer("NewTim", "Tom", new GregorianCalendar(1990, 12, 2)));
        session.getTransaction().commit();
    }
}
