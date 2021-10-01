package com.xiaoge.validation.Pojo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
public class Customer {
    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;
    @NotNull
    @Size(min = 2, max = 15)
    private String lastName;
}
