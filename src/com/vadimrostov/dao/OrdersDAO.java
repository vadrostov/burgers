package com.vadimrostov.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Алиса on 11.01.2017.
 */
@Repository
public interface OrdersDAO {

    public void save(Object o);
}
