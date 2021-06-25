package by.teachmeskills.myeshop.dao;

import by.teachmeskills.myeshop.dao.domain.User;
import by.teachmeskills.myeshop.exceptions.DAOException;

import java.util.List;

public interface UserDao extends BaseDao<User> {

    User getUserByEmail(String email) throws DAOException;

    List<User> getAllUsers() throws DAOException;

}
