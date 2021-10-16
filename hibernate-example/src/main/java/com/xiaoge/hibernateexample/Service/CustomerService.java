package com.xiaoge.hibernateexample.Service;

import com.xiaoge.hibernateexample.POJO.Customer;

public interface CustomerService {
    Customer findCustomerById(String id);
}
