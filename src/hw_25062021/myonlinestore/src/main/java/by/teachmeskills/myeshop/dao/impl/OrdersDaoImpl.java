package by.teachmeskills.myeshop.dao.impl;

import by.teachmeskills.myeshop.dao.OrderDao;
import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.dao.domain.Order;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersDaoImpl implements OrderDao {
    /**
     * SQL-statements
     */
    private static final String ADD_ORDER = "INSERT INTO orders VALUES (NULL, ?, ?, ?)";
    private static final String GET_ORDER_BY_ID = "SELECT * FROM orders WHERE id = ?";
    private static final String GET_ALL_ORDER = "SELECT * FROM orders";
    private static final String UPDATE_ORDER = "UPDATE orders SET price = ? WHERE id = ?";
    private static final String DELETE_ORDER = "DELETE FROM orders WHERE id = ?";

    /**
     * Error causes fields
     */
    private static final String ERROR_IN_CREATE_ORDER = "Error while adding order to database";
    private static final String ERROR_IN_READ_ORDER = "Error while getting order from database";
    private static final String ERROR_IN_UPDATE_ORDER = "Error while trying to update order in database";
    private static final String ERROR_IN_DELETE_ORDER = "Error while deleting order from database";
    private static final String ERROR_IN_GET_ALL_ORDER = "Error while getting list of order";


    @Override
    public int create(Order order) throws DAOException {
        int orderId;

        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(ADD_ORDER, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, order.getDate());
            ps.setInt(2, order.getPrice());
            ps.setInt(3, order.getUserId());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            orderId = rs.next() ? rs.getInt(1) : 0;
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_CREATE_ORDER, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return orderId;
    }

    @Override
    public Order read(int id) throws DAOException {
        Order order = null;
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(GET_ORDER_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                order = Order.orderBuilder().buildFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_READ_ORDER, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return order;
    }

    @Override
    public void update(Order order) throws DAOException {
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE_ORDER)) {
            ps.setInt(1, order.getPrice());
            ps.setInt(2, order.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_UPDATE_ORDER, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }

    }

    @Override
    public void delete(int id) throws DAOException {
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE_ORDER)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_DELETE_ORDER, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }

    }

    @Override
    public List<Order> getAllOrders() throws DAOException {
        List<Order> orders = new ArrayList<Order>();
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(GET_ALL_ORDER)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Order order = Order.orderBuilder().buildFromResultSet(rs);
                orders.add(order);
            }
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_GET_ALL_ORDER, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return orders;
    }
}
