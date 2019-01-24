package com.sunyx.dao.impl;

import com.sunyx.dao.IUserDao;
import com.sunyx.domain.User;
import com.sunyx.util.MyDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by liuli on 2018/12/27.
 */
public class UserDaoImpl implements IUserDao {
    private MyDataSource myDataSource1;

    public UserDaoImpl(MyDataSource myDataSource) {
        this.myDataSource1 = myDataSource;
    }

    public MyDataSource getMyDataSource() {
        return myDataSource1;
    }

    public void setMyDataSource(MyDataSource myDataSource) {
        this.myDataSource1 = myDataSource;
    }

    public User findByName(String userName) {
        String sql="select username,password,iphone from tt_user where username=?";
        User user = new User();
        try {
            Connection connection=myDataSource1.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,userName);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next())
            {
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setIphone(resultSet.getString("iphone"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
