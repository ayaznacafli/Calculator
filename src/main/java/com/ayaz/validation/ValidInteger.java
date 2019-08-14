package com.ayaz.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IntegerValidator.class)
@Documented
public @interface ValidInteger {
    String message() default "Invalid Integer";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
