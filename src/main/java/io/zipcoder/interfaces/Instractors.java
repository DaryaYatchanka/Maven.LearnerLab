package io.zipcoder.interfaces;

public class Instractors {
    private static Instractors ourInstance = new Instractors();

    public static Instractors getInstance() {
        return ourInstance;
    }

    private Instractors() {
    }
}
