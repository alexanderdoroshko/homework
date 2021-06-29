package by.teachmeskills.myeshop.service;

import by.teachmeskills.myeshop.dao.domain.User;
import by.teachmeskills.myeshop.exceptions.ServiceException;

public interface UserService extends BaseService<User> {

    User getUserByEmail(String email) throws ServiceException;
}
