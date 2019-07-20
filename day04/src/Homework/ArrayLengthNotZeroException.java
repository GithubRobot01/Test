package Homework;

public class ArrayLengthNotZeroException extends RuntimeException{
    public ArrayLengthNotZeroException() {
    }

    public ArrayLengthNotZeroException(String message) {
        super(message);
    }
}
