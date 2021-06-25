package by.teachmeskills.myeshop.dao;

import by.teachmeskills.myeshop.dao.domain.BaseEntity;
import by.teachmeskills.myeshop.exceptions.DAOException;

public interface BaseDao<T extends BaseEntity> {

    ConnectionPool databaseConnection = ConnectionPool.getInstance();

    int create(T entity) throws DAOException;

    T read(int id) throws DAOException;

    void update(T entity) throws DAOException;

    void delete(int id) throws DAOException;

}
