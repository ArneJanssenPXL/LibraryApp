package be.pxl.researchproject.exceptions;

public class InvalidAuthorException extends RuntimeException{
    public InvalidAuthorException(String message){
        super(message);
    }
}
