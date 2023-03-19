package com.temmytechie.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;

@RestControllerAdvice
public class CustomerExceptionHandler {


    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onException(RuntimeException ex)
    {
        var pd = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), ex.getMessage());

        pd.setTitle("Customer Details call");
        return pd;
    }
}
