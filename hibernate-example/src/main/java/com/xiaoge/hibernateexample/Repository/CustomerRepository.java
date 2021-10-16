package com.xiaoge.hibernateexample.Repository;

import com.xiaoge.hibernateexample.POJO.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    //TODO
    public Customer findCustomerById(String id);

    public List<Customer> findCustomerByFirstName(String firstName);
}
