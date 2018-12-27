package com.sunyx.service.impl;

import com.sunyx.dao.IUserDao;
import com.sunyx.domain.User;
import com.sunyx.service.IUserService;

/**
 * Created by liuli on 2018/12/27.
 */
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public boolean login(String username,String password)
    {
        User user = userDao.findByName(username);
        System.out.println(user);
        if(user.getPassword().equals(password))
        {
            return true;
        }
        return false;
    }
}
