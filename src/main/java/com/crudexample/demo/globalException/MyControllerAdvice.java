package com.crudexample.demo.globalException;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;



public class MyControllerAdvice  {
    @RestControllerAdvice(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmptyStackException.class)
}
