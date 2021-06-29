package by.teachmeskills.myeshop.service.impl;

import by.teachmeskills.myeshop.dao.CategoryDao;
import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.dao.impl.CategoryDaoImpl;
import by.teachmeskills.myeshop.exceptions.ServiceException;
import by.teachmeskills.myeshop.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public int create(Category category) throws ServiceException {
        return categoryDao.create(category);
    }

    @Override
    public Category read(int id) throws ServiceException {
        return categoryDao.read(id);
    }

    @Override
    public void update(Category category) throws ServiceException {
        categoryDao.update(category);
    }

    @Override
    public void delete(int id) throws ServiceException {
        categoryDao.delete(id);

    }

    @Override
    public List<Category> getAllCategories() throws ServiceException {
        return categoryDao.getAllCategories();
    }
}
