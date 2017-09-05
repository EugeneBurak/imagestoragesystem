package com.imagestoragesystem.storage;

/**
 * Created by java_dev on 05.09.17.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}