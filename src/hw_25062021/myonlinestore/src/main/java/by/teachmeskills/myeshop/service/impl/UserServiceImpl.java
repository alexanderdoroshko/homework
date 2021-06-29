package by.teachmeskills.myeshop.service.impl;

import by.teachmeskills.myeshop.dao.UserDao;
import by.teachmeskills.myeshop.dao.domain.User;
import by.teachmeskills.myeshop.dao.impl.UserDaoImpl;
import by.teachmeskills.myeshop.exceptions.ServiceException;
import by.teachmeskills.myeshop.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public int create(User user) throws ServiceException {
        return userDao.create(user);
    }

    @Override
    public User read(int id) throws ServiceException {
        return userDao.read(id);
    }

    @Override
    public void update(User user) throws ServiceException {
        userDao.update(user);
    }

    @Override
    public void delete(int id) throws ServiceException {
        userDao.delete(id);
    }

    @Override
    public User getUserByEmail(String email) throws ServiceException {
        return userDao.getUserByEmail(email);
    }

}
