package com.example.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException cve){
        List<String> errorList = new ArrayList<>(cve.getConstraintViolations().size());
        cve.getConstraintViolations().forEach(e->errorList.add(e.toString()));
        return new ResponseEntity(errorList, HttpStatus.BAD_REQUEST);
    }
}
