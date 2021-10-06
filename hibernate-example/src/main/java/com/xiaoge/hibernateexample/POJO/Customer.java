package com.xiaoge.hibernateexample.POJO;

import lombok.Data;

@Data
public class Customer {
    //TODO: add validation

    private String id;
    private String firstName;
    private String lastName;
    private int age;

}
