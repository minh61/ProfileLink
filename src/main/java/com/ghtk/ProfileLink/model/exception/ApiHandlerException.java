package com.ghtk.ProfileLink.model.exception;

import com.ghtk.ProfileLink.model.reponse.ResponseData;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiHandlerException {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseData notFoundException(NotFoundException ex) {
        return new ResponseData(false, ex.getMessage() , null);
    }
}
