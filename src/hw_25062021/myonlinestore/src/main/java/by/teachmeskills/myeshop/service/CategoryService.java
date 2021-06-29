package by.teachmeskills.myeshop.service;

import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.exceptions.ServiceException;

import java.util.List;

public interface CategoryService extends BaseService<Category> {

   List <Category> getAllCategories() throws ServiceException;
}
