package be.pxl.researchproject.exceptions;

public class InvalidBookException extends RuntimeException{
    public InvalidBookException(String message){
        super(message);
    }
}
