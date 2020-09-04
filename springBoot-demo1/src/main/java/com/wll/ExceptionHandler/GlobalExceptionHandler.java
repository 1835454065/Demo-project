package com.wll.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleValidationException(ConstraintViolationException e){
        for(ConstraintViolation<?> s : e.getConstraintViolations()){
            return s.getInvalidValue() + "：" + s.getMessage();
        }

        return "请求参数非法";
    }
}
