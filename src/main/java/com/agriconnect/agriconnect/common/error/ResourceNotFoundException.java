package com.agriconnect.agriconnect.common.error;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}





// Thrown when something the user asked for doesn't exist (for example a listing id).
// RuntimeException = we don't have to declare it on every method.