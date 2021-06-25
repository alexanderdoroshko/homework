package by.teachmeskills.myeshop.dao.impl;

import by.teachmeskills.myeshop.dao.CategoryDao;
import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    /**
     * SQL-statements
     */
    private static final String ADD_CATEGORY = "INSERT INTO categories VALUES (NULL, ?, ?, ?)";
    private static final String GET_CATEGORY_BY_ID = "SELECT * FROM categories WHERE id = ?";
    private static final String GET_ALL_CATEGORY = "SELECT * FROM categories";
    private static final String UPDATE_CATEGORY = "UPDATE categories SET rating = ? WHERE name = ?";
    private static final String DELETE_CATEGORY = "DELETE FROM categories WHERE id = ?";

    /**
     * Error causes fields
     */
    private static final String ERROR_IN_CREATE_CATEGORY = "Error while adding category to database";
    private static final String ERROR_IN_READ_CATEGORY = "Error while getting category from database";
    private static final String ERROR_IN_UPDATE_CATEGORY = "Error while trying to update category in database";
    private static final String ERROR_IN_DELETE_CATEGORY = "Error while deleting category from database";
    private static final String ERROR_IN_GET_ALL_CATEGORY = "Error while getting list of category";


    @Override
    public int create(Category category) throws DAOException {
        int categoryId;

        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(ADD_CATEGORY, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, category.getName());
            ps.setInt(2, category.getRating());
            ps.setString(3, category.getImagePath());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            categoryId = rs.next() ? rs.getInt(1) : 0;
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_CREATE_CATEGORY, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return categoryId;
    }

    @Override
    public Category read(int id) throws DAOException {
        Category category = null;
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(GET_CATEGORY_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                category = Category.categoryBuilder().buildFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_READ_CATEGORY, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return category;
    }

    @Override
    public void update(Category category) throws DAOException {
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE_CATEGORY)) {
            ps.setInt(1, category.getRating());
            ps.setString(2, category.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_UPDATE_CATEGORY, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }

    }

    @Override
    public void delete(int id) throws DAOException {
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE_CATEGORY)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_DELETE_CATEGORY, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
    }

    @Override
    public List<Category> getAllCategories() throws DAOException {
        List<Category> categories = new ArrayList<Category>();
        Connection connection = databaseConnection.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(GET_ALL_CATEGORY)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = Category.categoryBuilder().buildFromResultSet(rs);
                categories.add(category);
            }
        } catch (SQLException e) {
            throw new DAOException(ERROR_IN_GET_ALL_CATEGORY, e);
        } finally {
            databaseConnection.closeConnection(connection);
        }
        return categories;
    }
}
