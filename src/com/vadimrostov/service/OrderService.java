package com.vadimrostov.service;

import com.vadimrostov.domain.Order;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Алиса on 11.01.2017.
 */

@Service
public interface OrderService {

    public void save(Order order);
}
