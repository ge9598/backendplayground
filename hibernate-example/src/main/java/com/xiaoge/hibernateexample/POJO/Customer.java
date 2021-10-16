package com.xiaoge.hibernateexample.POJO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Customer {
    public Customer(){

    }
    //TODO: add validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")

    private String email;

    public Customer(String first, String last, String email){
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }
    @Override
    public String toString(){
        return "Student [ id=" + this.id + " , firstName=" + this.firstName + " , lastName=" + this.lastName + " , + email=" + this.email + " ]";
    }

}
