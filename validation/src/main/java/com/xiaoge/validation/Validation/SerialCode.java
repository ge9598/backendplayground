package com.xiaoge.validation.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SerialCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@NotBlank(message = "You cant be empty!!!")
public @interface SerialCode {
    public String value() default "FAFA";
    public String message() default "must start with FAFA";
    public Class<?> [] groups() default {};
    public Class<? extends Payload> [] payload() default {};
}
