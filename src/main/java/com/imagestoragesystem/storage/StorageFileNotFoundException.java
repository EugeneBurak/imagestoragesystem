package com.imagestoragesystem.storage;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by java_dev on 01.09.17.
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
