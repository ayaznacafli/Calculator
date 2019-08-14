package com.ayaz.validation;

import com.ayaz.validation.ValidInteger;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerValidator implements ConstraintValidator<ValidInteger,String> {

    private Pattern pattern;
    private Matcher matcher;

    private static final String INTEGER_PATTERN = "^[0-9]*$";

    @Override
    public void initialize(ValidInteger constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        pattern=Pattern.compile(INTEGER_PATTERN);
        matcher=pattern.matcher(value);
        return matcher.matches();
    }
}
