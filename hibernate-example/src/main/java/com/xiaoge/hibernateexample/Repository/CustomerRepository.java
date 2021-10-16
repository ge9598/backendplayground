package com.xiaoge.hibernateexample.Repository;

import com.xiaoge.hibernateexample.POJO.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
    // why even though there is no Implementation of the interface, and the functions still works?
    // crudRepository is that smart, it uses find..by as index to search the entity's attributes like id and generate queries to the database
    // for example find indicated read, and the word between find and by is the table indication, and use id as the key.
    // they are so smart lol.
    public Customer findCustomerById(String id);
    public List<Customer> findCustomerByFirstName(String firstName);
    @Transactional
    //must mark as Transactional
    //@Transactional annotation is used when you want the certain method/class(=all methods inside) to be executed in a transaction.
    //https://stackoverflow.com/questions/54326306/what-is-the-use-of-transactional-with-jpa-and-hibernate
    //If you don't specify @Transactional, each DB call will be in a different transaction.
    public void deleteCustomerById(String id);
}
