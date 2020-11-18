package edu.epam.ball.exception;

public class BallException extends Exception{
    String message;

    public BallException(String str) {message = str;}

    public String toString() {
        return ("Ball Exception Occurred: " + message);
    }
}
