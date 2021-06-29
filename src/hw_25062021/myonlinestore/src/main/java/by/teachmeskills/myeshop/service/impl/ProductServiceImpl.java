package by.teachmeskills.myeshop.service.impl;

import by.teachmeskills.myeshop.dao.ProductDao;
import by.teachmeskills.myeshop.dao.domain.Product;
import by.teachmeskills.myeshop.dao.impl.ProductDaoImpl;
import by.teachmeskills.myeshop.exceptions.ServiceException;
import by.teachmeskills.myeshop.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDaoImpl();

    @Override
    public int create(Product product) throws ServiceException {
        return productDao.create(product);
    }

    @Override
    public Product read(int id) throws ServiceException {
        return productDao.read(id);
    }

    @Override
    public void update(Product product) throws ServiceException {
        productDao.update(product);
    }

    @Override
    public void delete(int id) throws ServiceException {
        productDao.delete(id);
    }

    @Override
    public List<Product> getAllProduct() throws ServiceException {
        return productDao.getAllProducts();
    }
}
