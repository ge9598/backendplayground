package com.xiaoge.validation.Pojo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
public class Customer {
    @NotNull(message = "is Required")
    @Size(min = 1)
    private String firstName;
    private String lastName;
}
