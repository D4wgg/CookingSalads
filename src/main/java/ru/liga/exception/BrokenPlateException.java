package ru.liga.exception;

public class BrokenPlateException extends RuntimeException {
    public BrokenPlateException() {
        super("Разбита тарелка");
    }
}
