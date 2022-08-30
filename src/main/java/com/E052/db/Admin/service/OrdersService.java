package com.E052.db.Admin.service;

import com.E052.db.Admin.dto.OrderDto;
import com.E052.db.Admin.model.customerorder;

public interface OrdersService {
    customerorder save(OrderDto registrationDto);

}
