package com.sunyx.dao.impl;

import com.sunyx.dao.ICustomerDao;
import org.springframework.stereotype.Component;

/**
 * Created by liuli on 2019/1/17.
 */
@Component("ccDao")
public class CustomerDao  implements ICustomerDao{
    @Override
    public void delete() {
        System.out.println("delete...");
    }

    @Override
    public void find() {
        System.out.println("find...");
    }

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }
}
