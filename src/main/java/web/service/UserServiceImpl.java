package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.userDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private static userDao userDao;
    @Autowired
    public UserServiceImpl(web.dao.userDao userDao) {
        UserServiceImpl.userDao = userDao;
    }

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
