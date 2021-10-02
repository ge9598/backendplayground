package com.xiaoge.validation.Pojo;

import com.xiaoge.validation.Validation.SerialCode;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {
    @NotBlank(message = "this field may not be empty!")
    @Size(min = 2, max = 30)
    private String firstName;
    @NotBlank(message = "this field may not be empty!")
    private String lastName;

    @SerialCode
    private String serialCode;
}
