package com.ayaz.service.utils;

public class LogIdGenerator {

    private static int id = 0;

    private LogIdGenerator() {
    }

    public static int generateId() {
        return id++;
    }
}
