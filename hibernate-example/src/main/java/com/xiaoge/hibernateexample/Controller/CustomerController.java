package com.xiaoge.hibernateexample.Controller;

import com.xiaoge.hibernateexample.POJO.Customer;
import com.xiaoge.hibernateexample.Repository.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;


@Controller

public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @PostMapping()
    public @ResponseBody String addNewCustomer(@RequestParam String lastName, @RequestParam String firstName, @RequestParam String email){
        Customer c = new Customer(lastName, firstName, email);
        customerRepository.save(c);
        return "Saved";
    }
    @GetMapping()
    public ResponseEntity<List<Customer>> getCustomerByFirstName(@RequestParam(value = "firstName") String firstName){
        List<Customer> resp = customerRepository.findCustomerByFirstName(firstName);
        if(resp == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Customer>>(resp, HttpStatus.OK);
    }
    @GetMapping(value = "{cid}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("cid") String id){
        Customer c = customerRepository.findCustomerById(id);
        if(c == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(c, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<Iterable<Customer>> getCustomerAll(){
        return new ResponseEntity<Iterable<Customer>>( customerRepository.findAll(), HttpStatus.OK);
    }
    @PutMapping()
    public ResponseEntity<Customer> updateCustomerById(@RequestParam(value = "id") String id, @RequestParam(required = false) String firstName,
                                                       @RequestParam(required = false) String lastName, @RequestParam(required = false) String email){
        Customer c = customerRepository.findCustomerById(id);
        if(c == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }else{
            if(firstName != null)
                c.setFirstName(firstName);
            if(lastName != null)
                c.setLastName(lastName);
            if(email != null)
                c.setEmail(email);
        }
        customerRepository.save(c);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteCustomerById(@RequestParam(value = "id") String id){
        Customer c = customerRepository.findCustomerById(id);
        if(c == null){
            return new ResponseEntity<>("No Customer found", HttpStatus.NOT_FOUND);
        }else{
            customerRepository.deleteCustomerById(id);
            return new ResponseEntity<String>("Customer " + c.getId() + " is deleted.", HttpStatus.OK);
        }
    }

}
