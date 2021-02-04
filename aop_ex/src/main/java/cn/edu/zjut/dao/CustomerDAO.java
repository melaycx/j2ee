package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO extends BaseHibernateDAO implements ICustomerDAO {


    public void save(Customer transientInstance) {
        System.out.println("execute --save()-- method.");
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.save(transientInstance);
            tran.commit();
        } catch (RuntimeException re) {
            if (tran != null) tran.rollback();
            throw re;
        } finally {
            session.close();
        }

    }

    public void delete(Customer transientInstance) {
        System.out.println("execute --delete()-- method.");
    }

    public void update(Customer transientInstance) {
        System.out.println("execute --update()-- method.");
    }

    public void findByHQL(String hql) {
        System.out.println("execute --findByHQL()-- method.");
    }
}
