package by.teachmeskills.myeshop.service;

import by.teachmeskills.myeshop.dao.domain.BaseEntity;
import by.teachmeskills.myeshop.exceptions.ServiceException;

public interface BaseService<T extends BaseEntity> {

    int create(T entity) throws ServiceException;

    T read(int id) throws ServiceException;

    void update(T entity) throws ServiceException;

    void delete(int id) throws ServiceException;

}
