package com.crudexample.demo.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

//@ControllerAdvice
@RestControllerAdvice
public class ControllerAdviceMy {


//    @ExceptionHandler(EmptyInputException.class)
//    public ResponseEntity<String> handleEmptyStackException(EmptyInputException emptyInputException) {
//        return new ResponseEntity<String>("Input Not found", HttpStatus.BAD_REQUEST);
//    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException emptyInputException) {
        return new ResponseEntity<String>("No Value presnt in db", HttpStatus.BAD_REQUEST);
    }
}
