package by.teachmeskills.myeshop.dao;

import by.teachmeskills.myeshop.dao.domain.Order;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.util.List;

public interface OrderDao extends BaseDao<Order> {

    List<Order> getAllOrders() throws DAOException;
}
