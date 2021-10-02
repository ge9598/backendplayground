package com.xiaoge.validation.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotBlank;
import java.lang.annotation.Annotation;
public class SerialCodeConstraintValidator implements ConstraintValidator<SerialCode, String> {

    private  String serialPrefix;
    @Override
    public void initialize(SerialCode serialCode) {
        serialPrefix = serialCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = code != null ? code.startsWith(serialPrefix) : true;
        return result;
    }
}
