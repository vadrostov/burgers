package com.vadimrostov.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Алиса on 11.01.2017.
 */
@Repository
public class OrdersDAOImpl implements OrdersDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Object o) {
        sessionFactory.getCurrentSession().save(o);
    }
}
