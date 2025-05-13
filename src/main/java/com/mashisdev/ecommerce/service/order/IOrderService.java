package com.mashisdev.ecommerce.service.order;

import com.mashisdev.ecommerce.dto.OrderDto;
import com.mashisdev.ecommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
