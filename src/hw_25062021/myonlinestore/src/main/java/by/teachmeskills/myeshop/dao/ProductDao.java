package by.teachmeskills.myeshop.dao;

import by.teachmeskills.myeshop.dao.domain.Product;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.util.List;

public interface ProductDao extends BaseDao<Product> {

    List<Product> getAllProducts() throws DAOException;
}
