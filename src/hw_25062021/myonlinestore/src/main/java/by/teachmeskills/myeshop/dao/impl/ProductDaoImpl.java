package by.teachmeskills.myeshop.dao.impl;

import by.teachmeskills.myeshop.dao.ProductDao;
import by.teachmeskills.myeshop.dao.domain.Product;
import by.teachmeskills.myeshop.dao.domain.User;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    /**
     * SQL-statements
     */
    private static final String ADD_PRODUCT = "INSERT INTO products VALUES (NULL, ?, ?, ?, ?, ?)";
    private static final String GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE id = ?";
    private static final String GET_ALL_PRODUCT = "SELECT * FROM products";
    private static final String UPDATE_PRODUCT = "UPDATE products SET price = ? WHERE id = ?";
    private static final String DELETE_PRODUCT = "DELETE FROM products WHERE id = ?";

    /**
     * Error causes fields
     */
    private static final String ERROR_IN_CREATE_PRODUCT = "Error while adding product to database";
    private static final String ERROR_IN_READ_PRODUCT = "Error while getting product from database";
    private static final String ERROR_IN_UPDATE_PRODUCT = "Error while trying to update product in database";
    private static final String ERROR_IN_DELETE_PRODUCT = "Error while deleting product from database";
    private static final String ERROR_IN_GET_ALL_PRODUCT = "Error while getting list of product";

    @Override
    public int create(Product product) throws DAOException {
        int productId;

        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(ADD_PRODUCT, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setString(3, product.getImagePath());
            ps.setInt(4, product.getPrice());
            ps.setInt(5, product.getCategoryId());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            productId = rs.next() ? rs.getInt(1) : 0;
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_CREATE_PRODUCT, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return productId;
    }

    @Override
    public Product read(int id) throws DAOException {
        Product product = null;
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(GET_PRODUCT_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                product = Product.productBuilder().buildFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_READ_PRODUCT, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return product;
    }

    @Override
    public void update(Product product) throws DAOException {
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE_PRODUCT)) {
            ps.setInt(1, product.getPrice());
            ps.setInt(2, product.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_UPDATE_PRODUCT, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }

    }

    @Override
    public void delete(int id) throws DAOException {
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE_PRODUCT)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_DELETE_PRODUCT, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }

    }

    @Override
    public List<Product> getAllProducts() throws DAOException {
        List<Product> products = new ArrayList<Product>();
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(GET_ALL_PRODUCT)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = Product.productBuilder().buildFromResultSet(rs);
                products.add(product);
            }
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_GET_ALL_PRODUCT, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return products;
    }
}
