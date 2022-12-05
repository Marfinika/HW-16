package org.example.exception;

public class  NotRegistered extends RuntimeException {
    public NotRegistered(String name) {
        super("Player " + name + " not registered");
    }
}
