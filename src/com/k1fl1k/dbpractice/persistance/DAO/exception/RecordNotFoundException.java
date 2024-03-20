package com.k1fl1k.dbpractice.persistance.DAO.exception;

public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException(String message) {
        super(message);
    }
}
