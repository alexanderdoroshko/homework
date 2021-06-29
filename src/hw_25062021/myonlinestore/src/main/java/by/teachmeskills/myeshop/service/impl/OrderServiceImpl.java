package by.teachmeskills.myeshop.service.impl;

import by.teachmeskills.myeshop.dao.OrderDao;
import by.teachmeskills.myeshop.dao.domain.Order;
import by.teachmeskills.myeshop.dao.impl.OrdersDaoImpl;
import by.teachmeskills.myeshop.exceptions.ServiceException;
import by.teachmeskills.myeshop.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao = new OrdersDaoImpl();

    @Override
    public int create(Order order) throws ServiceException {
        return orderDao.create(order);
    }

    @Override
    public Order read(int id) throws ServiceException {
        return orderDao.read(id);
    }

    @Override
    public void update(Order order) throws ServiceException {
        orderDao.update(order);
    }

    @Override
    public void delete(int id) throws ServiceException {
        orderDao.delete(id);

    }

    @Override
    public List<Order> getAllOrders() throws ServiceException {
        return orderDao.getAllOrders();
    }
}
