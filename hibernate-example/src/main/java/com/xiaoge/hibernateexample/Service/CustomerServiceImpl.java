package com.xiaoge.hibernateexample.Service;

import com.xiaoge.hibernateexample.POJO.Customer;
import com.xiaoge.hibernateexample.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer findCustomerById(String id) {
        return null;
    }
}
