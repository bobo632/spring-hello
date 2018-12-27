package com.sunyx.dao;

import com.sunyx.domain.User;

/**
 * Created by liuli on 2018/12/27.
 */
public interface IUserDao {
    public User findByName(String userName);
}
