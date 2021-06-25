package by.teachmeskills.myeshop.service;

import by.teachmeskills.myeshop.dao.domain.Product;
import by.teachmeskills.myeshop.exceptions.ServiceException;

import java.util.List;

public interface ProductService extends BaseService<Product> {
    List<Product> getAllProduct() throws ServiceException;
}
