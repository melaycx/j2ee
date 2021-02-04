package cn.edu.zjut.dao;

import java.util.List;

import cn.edu.zjut.po.ItemBasic;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ItemDAO {
    private static final Log log = LogFactory.getLog(ItemDAO.class);

    public List findAll() {
        log.debug("finding all Item instances");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        try {
            String queryString = "from ItemBasic";
            Query queryObject = session.createQuery(queryString, ItemBasic.class);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        } finally {
            session.close();
        }
    }
}
