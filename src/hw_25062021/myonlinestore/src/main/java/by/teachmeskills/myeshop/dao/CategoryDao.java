package by.teachmeskills.myeshop.dao;

import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.util.List;

public interface CategoryDao extends BaseDao<Category> {

    List<Category> getAllCategories() throws DAOException;
}
