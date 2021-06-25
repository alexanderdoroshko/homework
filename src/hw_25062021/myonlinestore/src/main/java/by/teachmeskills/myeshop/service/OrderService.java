package by.teachmeskills.myeshop.service;

import by.teachmeskills.myeshop.dao.domain.Order;
import by.teachmeskills.myeshop.exceptions.ServiceException;

import java.util.List;

public interface OrderService extends BaseService<Order> {
    List<Order> getAllOrders() throws ServiceException;
}
